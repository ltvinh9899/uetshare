package com.example.uetshare.service;

import com.example.uetshare.entity.AccountRole;
import com.example.uetshare.entity.Role;
import com.example.uetshare.repository.AccountRoleRepository;
import com.example.uetshare.repository.PersistentLoginsRepository;
import com.example.uetshare.repository.RoleRepository;
import com.example.uetshare.response.AccountResponse;
import com.example.uetshare.response.dto.AccountDto;
import com.example.uetshare.entity.Account;
import com.example.uetshare.repository.AccountRepository;
import com.example.uetshare.response.dto.LoginDto;
import com.example.uetshare.response.mapper.AccountMapper;
import com.example.uetshare.security.JwtTokenProvider;
import com.example.uetshare.security.LoginResponse;
import com.example.uetshare.utils.EncoderUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private AccountRoleRepository accountRoleRepository;
    @Autowired
    PersistentLoginsRepository persistentLoginsRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private JwtTokenProvider jwtTokenProvider;

//    public AccountService(AuthenticationManager authenticationManager) {
//        this.authenticationManager = authenticationManager;
//    }

    public LoginResponse login(LoginDto payload) throws Exception {
        Account account = this.accountRepository.getAccountByUsername(payload.getUsername());
        if (account == null) {
            throw new Exception("Tài khoản hoạc mật khẩu không đúng");
        }
//        if (!EncoderUtils.encoderPassword(payload.getPassword()).equals(account.getPassword())) {
//            throw new Exception("Tài khoản hoạc mật khẩu không đúng");
//        }
        log.info("---------------password: " + EncoderUtils.encoderPassword(payload.getPassword()).equals(account.getPassword()));
        log.info("---------------username: " + account.getAccountRole().size());
        String token = this.jwtTokenProvider.createToken(account.getUsername(), account.getRoles());
        log.info("---------------token : " + token);
        LoginResponse login = new LoginResponse();
        login.token = token;
        return login;
    }

    /**
     * Đăng ký tài khoản
     *
     * @return
     */
    public AccountResponse register(AccountDto accountDto) {
        Account account = checkOfExists(accountDto);
        if (account != null) {
            return new AccountResponse(false, "Tài khoản đã tồn tại!", null);
        } else {
            addAccount(accountDto);
            Account accountGet = accountRepository.getAccountByUsername(accountDto.getUsername());
            AccountResponse accountResponse = new AccountResponse(true, "Đăng ký thành công!", AccountMapper.toAccountDto(accountGet));
            return accountResponse;
        }
    }

    /**
     * Kiểm tra sự tồn tại của tài khoản
     *
     * @return
     */
    public Account checkOfExists(AccountDto accountDto) {
        Account account = accountRepository.getAccountByUsername(accountDto.getUsername());
        if (account != null) {
            System.out.println("tai khoan ton tai username: " + account.getUsername());
            return account;
        } else {
            System.out.println("tai khoan chua ton tai");
            return null;
        }
    }

    /**
     * Thêm tài khoản vào Database
     */
    public void addAccount(AccountDto accountDto) {
        Account account = new Account(accountDto.getUsername(), EncoderUtils.encoderPassword(accountDto.getPassword()));
        accountRepository.save(account);
        Account accountGet = accountRepository.getAccountByUsername(accountDto.getUsername());
        Role role = new Role();
        role.setId(1L);
        role.setRoleName("ROLE_USER");
        AccountRole accountRole = new AccountRole();
        accountRole.setAccount(accountGet);
        accountRole.setRole(role);
        accountRoleRepository.save(accountRole);

        /**
         * đang dở phần này, thêm role khi đăng ký user
         * Nên thêm model account_role
         */
//        CompletableFuture<Account> future1 = CompletableFuture.supplyAsync(() -> getAccountFromMysql(account.getUsername()));
//        future1.thenAccept((result)->{
//            accountRoleRepository.insertRole(result.getId());
//
//        }).join();
    }

    public Account getAccountFromMysql(String username) {
        Account accountGet = accountRepository.getAccountByUsername(username);
        log.info("--------------------account get name: " + accountGet.getUsername());
        return accountGet;
    }

    /**
     * @param accountDto
     * @return
     */
    public AccountResponse login(AccountDto accountDto) {
        Account account = accountRepository.getAccountByUsername(accountDto.getUsername());
        if (account != null) {
            if (accountDto.getPassword().equals(account.getPassword())) {
                AccountResponse accountResponse = new AccountResponse(true, "Đăng nhập thành công!", AccountMapper.toAccountDto(account));
                return accountResponse;
            } else {
                return new AccountResponse(false, "Đăng nhập thất bại!", AccountMapper.toAccountDto(account));
            }
        } else {
            System.out.println("tai khoan khong ton tai");
            return new AccountResponse(false, "Tài khoản không tồn tại!", null);
        }
    }

    public AccountResponse getAccount(String cookie) {
        String cookieSplit[] = cookie.split(";");
        String rememberMeSplit[] = new String[]{};
        for (String cookieIndex : cookieSplit
        ) {
            if (cookieIndex.contains("remember-me")) {
                rememberMeSplit = cookieIndex.split("=");

            }
        }
        String rememberMeToken = rememberMeSplit[1];
        byte[] decodedBytes = Base64.getDecoder().decode(rememberMeToken);
        String rememberMeDecode[] = new String(decodedBytes).split(":");
        String seriesCode = rememberMeDecode[0];
        String series = java.net.URLDecoder.decode(seriesCode, StandardCharsets.UTF_8);
        log.info("---------------series: " + series);
        String username = persistentLoginsRepository.getUsernameBySeries(series);
        log.info("---------------username: " + username);
        Account account = accountRepository.getAccountByUsername(username);
        if (account != null) {
            AccountResponse accountResponse = new AccountResponse(true, "Đăng nhập thành công!", AccountMapper.toAccountDto(account));
            return accountResponse;
        } else {
            System.out.println("tai khoan khong ton tai");
            return new AccountResponse(false, "Chưa đăng nhập!", null);
        }
    }

    public List<Account> getAccountByText(Integer index, String text) {
        return accountRepository.getAccountByText(index, text);
    }
}
