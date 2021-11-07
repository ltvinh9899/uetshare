package com.example.uetshare.controller;

import com.example.uetshare.response.dto.AccountDto;
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
    @GetMapping(value = {"/",""})
    public ResponseEntity<?> getHome(){
        return ResponseEntity.ok(true);
    }
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody AccountDto accountDto){
        System.out.println("controller: /register");
        log.info(accountDto.getUsername());
        return ResponseEntity.ok(accountService.register(accountDto));
    }
    @PostMapping("/login")
    public ResponseEntity<?> getInfo(@RequestBody AccountDto accountDto){
        System.out.println("controller: /login");
        log.info("controller: /login");
        return ResponseEntity.ok(accountService.login(accountDto));
    }
    @PostMapping("/user")
    public ResponseEntity<?> getUser(){
        log.info("controller: /user");
        return ResponseEntity.ok(true);
    }
    @GetMapping("/userInfo/")
    public ResponseEntity<?> getUserInfo(){
        System.out.println("controller: /userInfo");
        log.info("controller: /user");
        return ResponseEntity.ok(true);
    }

}
