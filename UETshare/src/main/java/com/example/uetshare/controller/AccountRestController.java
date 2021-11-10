package com.example.uetshare.controller;

import com.example.uetshare.response.dto.AccountDto;
import com.example.uetshare.service.AccountService;
import com.example.uetshare.service.UserDetailsServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
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
    @GetMapping(value = {"/",""})
    public ResponseEntity<?> getHome(){
        return ResponseEntity.ok("home");
    }
    @GetMapping("/welcome")
    public ResponseEntity<?> welcome(){
        System.out.println(userDetailsService.loadUserByUsername("ducpm").toString());
        return ResponseEntity.ok("welcome");
    }
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody AccountDto accountDto){
        System.out.println("controller: /register");
        //UserDetailsServiceImpl userDetailsService = new UserDetailsServiceImpl();
        System.out.println(userDetailsService.loadUserByUsername("ducpm").toString());
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
        return ResponseEntity.ok(true);
    }
//    @GetMapping("/userInfo/")
//    public ResponseEntity<?> getUserInfo(){
//        System.out.println("controller: /userInfo");
//        log.info("controller: /user");
//        return ResponseEntity.ok(true);
//    }
    @GetMapping("/login-failed")
    public ResponseEntity<?> loginFailed(){
        System.out.println("controller: /login");
        log.info("controller: /login-failed");
        return ResponseEntity.ok(false);
    }
    @GetMapping("/login-succcess")
    public ResponseEntity<?> getSuccess(){
        System.out.println("controller: /login-succcess");
        log.info("controller: /login-success");
        return ResponseEntity.ok(true);
    }
    @GetMapping("/logout-succcess")
    public ResponseEntity<?> logoutSuccess(){
        System.out.println("controller: /out");
        log.info("controller: /logout-success");
        return ResponseEntity.ok(true);
    }
    @GetMapping("/403")
    public ResponseEntity<?> accessDenined(){
        return ResponseEntity.ok("Access denined!");
    }
}
