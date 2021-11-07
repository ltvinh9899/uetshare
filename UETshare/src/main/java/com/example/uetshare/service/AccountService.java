package com.example.uetshare.service;

import com.example.uetshare.response.AccountResponse;
import com.example.uetshare.response.dto.AccountDto;
import com.example.uetshare.entity.Account;
import com.example.uetshare.repository.AccountRepository;
import com.example.uetshare.response.mapper.AccountMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Log4j2
@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;
    /**
     * Đăng ký tài khoản
     * @return
     */
    public AccountResponse register(AccountDto accountDto){
        Account account = checkOfExists(accountDto);
        if(account!=null){
            return new AccountResponse(false,"Đăng ký thất bại!",null);
        }else{
            addAccount(accountDto);
            Account accountGet = accountRepository.getAccountByUsername(account.getUsername());
            AccountResponse accountResponse = new AccountResponse(true,"Đăng ký thành công!",AccountMapper.toAccountDto(accountGet));
            return accountResponse;
        }
    }

    /**
     * Kiểm tra sự tồn tại của tài khoản
     * @return
     */
    public Account checkOfExists(AccountDto accountDto){
        Account account = accountRepository.getAccountByUsername(accountDto.getUsername());
        if(account!=null){
            System.out.println("tai khoan ton tai username: "+ account.getUsername());
            return account;
        }else{
            System.out.println("tai khoan chua ton tai");
            return null;
        }
    }

    /**
     * Thêm tài khoản vào Database
     */
    public void addAccount(AccountDto accountDto){
        Account account = new Account(accountDto.getUsername(),accountDto.getPassword());
        accountRepository.save(account);
    }

    /**
     *
     * @param accountDto
     * @return
     */
    public AccountResponse login(AccountDto accountDto){
        Account account = accountRepository.getAccountByUsername(accountDto.getUsername());
        if(account!=null){
            if(accountDto.getPassword().equals(account.getPassword())){
                AccountResponse accountResponse = new AccountResponse(true,"Đăng nhập thành công!", AccountMapper.toAccountDto(account));
                return accountResponse;
            }else{
                return new AccountResponse(false,"Đăng nhập thất bại!", AccountMapper.toAccountDto(account));
            }
        }else{
            System.out.println("tai khoan khong ton tai");
            return new AccountResponse(false,"Tài khoản không tồn tại!", null);
        }
    }
}
