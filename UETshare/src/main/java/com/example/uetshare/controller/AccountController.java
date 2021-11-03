package com.example.uetshare.controller;

import com.example.uetshare.dto.AccountDto;
import com.example.uetshare.service.AccountService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@Log4j2
@RestController
public class AccountController {
    private AccountService accountService;
    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody AccountDto account){
        System.out.println("controller: /register");
        log.info("controller: /register");
        log.info("username: "+ account.getUsername());
        return ResponseEntity.ok(accountService.register(account));
    }
    @PostMapping("/login")
    public ResponseEntity<?> getInfo(@RequestBody AccountDto accountDto){
        System.out.println("controller: /login");
        log.info("controller: /login");
        return ResponseEntity.ok(true);
    }
    @GetMapping("/user")
    public ResponseEntity<?> getUser(){
        System.out.println("controller: /user");
        log.info("controller: /user");
        return ResponseEntity.ok(true);
    }
}
