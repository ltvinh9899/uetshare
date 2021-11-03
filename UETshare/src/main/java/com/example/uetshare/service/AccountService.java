package com.example.uetshare.service;

import com.example.uetshare.dto.AccountDto;
import com.example.uetshare.entity.Account;
import com.example.uetshare.repository.AccountRepository;
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
    public boolean register(AccountDto accountDto){
        if(checkOfExists(accountDto)){
            return false;
        }else{
            addAccount(accountDto);
            return true;
        }
    }

    /**
     * Kiểm tra sự tồn tại của tài khoản
     * @return
     */
    public boolean checkOfExists(AccountDto accountDto){
        Account account = accountRepository.getAccountByUsername(accountDto.getUsername());
        if(account!=null){
            System.out.println("tai khoan ton tai username: "+ account.getUsername());
            return true;
        }else{
            System.out.println("tai khoan chua ton tai");
            return false;
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
//    public boolean login(AccountDto accountDto){
//        if(checkOfExists(accountDto)){
//
//        }else{
//            addAccount(accountDto);
//            return true;
//        }
//    }
    public short login(AccountDto accountDto){
        Account account = accountRepository.getAccountByUsername(accountDto.getUsername());
        if(account!=null){
            if(accountDto.getPassword().equals(account.getPassword())){
                accountDto.setId(account.getId());
                log.info("usernamedto: "+accountDto.getUsername()+ "pass: "+accountDto.getPassword());
                log.info("username: "+account.getUsername()+ "pass: "+account.getPassword());
                return 1;
            }else{
                log.info("usernamedto: "+accountDto.getUsername()+ "pass: "+accountDto.getPassword());
                log.info("username: "+account.getUsername()+ "pass: "+account.getPassword());
                return 0;
            }
        }else{
            System.out.println("tai khoan khong ton tai");
            return -1;
        }
    }
}
