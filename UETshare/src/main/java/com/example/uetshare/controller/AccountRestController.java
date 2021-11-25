package com.example.uetshare.controller;

import com.example.uetshare.entity.Account;
import com.example.uetshare.response.AccountListResponse;
import com.example.uetshare.response.AccountResponse;
import com.example.uetshare.response.QuestionResponse;
import com.example.uetshare.response.dto.AccountDto;
import com.example.uetshare.response.mapper.AccountMapper;
import com.example.uetshare.service.AccountService;
import com.example.uetshare.service.UserDetailsServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.*;
import java.util.stream.Collectors;

@Log4j2
@RestController
public class AccountRestController {
    private AccountService accountService;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    public AccountRestController(AccountService accountService) {
        this.accountService = accountService;
    }

    private final Integer limit = 10;

    @GetMapping(value = {"/",""})
    public ResponseEntity<?> getHome(){
        return ResponseEntity.ok("home");
    }
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody AccountDto accountDto){
        System.out.println("controller: /register");
        log.info(accountDto.getUsername());
        return ResponseEntity.ok(accountService.register(accountDto));
    }
//    @PostMapping("/login")
//    public ResponseEntity<?> getInfo(@RequestBody AccountDto accountDto){
//        System.out.println("controller: /login");
//        log.info("controller: /login");
//        return ResponseEntity.ok(accountService.login(accountDto));
//    }
    @GetMapping("/user")
    public ResponseEntity<?> getUser(){
        log.info("controller: /user");
        return ResponseEntity.ok("user");
    }
    @GetMapping("/login-failed")
    public ResponseEntity<?> loginFailed(){
        log.info("controller: /login-failed");
        return ResponseEntity.ok(false);
    }
    @GetMapping("/login-success")
    public ResponseEntity<?> getSuccess(@RequestHeader(value ="cookie") String cookie){
        log.info("controller: login-success");
        return ResponseEntity.ok(accountService.getAccount(cookie));
    }
    @GetMapping("/logout-success")
    public ResponseEntity<?> logoutSuccess(){
        System.out.println("controller: /out");
        log.info("controller: /logout-success");
        return ResponseEntity.ok(true);
    }
    @GetMapping("/403")
    public ResponseEntity<?> accessDenined(){
        return ResponseEntity.ok("Access denined!");
    }

    @GetMapping("/getAccount")
    public ResponseEntity<?> getAcount(@RequestHeader(value ="cookie") String cookie) {
        return ResponseEntity.ok(accountService.getAccount(cookie));

    }

    @GetMapping("/account/search")
    public ResponseEntity<?> searchAccount(AccountListResponse accountListResponse, @Param("index") Integer index, @Param("text") String text){

        try {

            Integer indexToQuery = index*limit;

            String textToQuery = "%" + String.join("%", text.split(" ")) + "%";

            List<Account> accountList = accountService.getAccountByText(indexToQuery, textToQuery);
            List<AccountDto> accountDtoList = new ArrayList<>();

            for(Account account : accountList){
                accountDtoList.add(AccountMapper.toAccountDto(account));
            }

            accountListResponse.setSuccess(true);
            accountListResponse.setMessage("get account success");
            accountListResponse.setResult_quantity(accountDtoList.size());
            accountListResponse.setAccountDtoList(accountDtoList);

            return ResponseEntity.ok(accountListResponse);

        } catch (Exception e) {

            accountListResponse.setSuccess(false);
            accountListResponse.setMessage(e.toString());

            return new ResponseEntity<>(accountListResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

}
