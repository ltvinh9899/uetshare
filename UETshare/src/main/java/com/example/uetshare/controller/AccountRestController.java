package com.example.uetshare.controller;

import com.example.uetshare.entity.Account;
import com.example.uetshare.response.AccountListResponse;
import com.example.uetshare.response.SessionRespone;
import com.example.uetshare.response.dto.AccountDto;
import com.example.uetshare.response.dto.BodyFirebaseToken;
import com.example.uetshare.response.mapper.AccountMapper;
import com.example.uetshare.service.AccountService;
import com.example.uetshare.service.FirebaseService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

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

    @Autowired
    private FirebaseService firebaseService;

    private final Integer limit = 10;

    @GetMapping(value = {"/",""})
    public ResponseEntity<?> getHome(){
        return ResponseEntity.ok("home");
    }
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody AccountDto accountDto){
        log.info("/register with username: "+accountDto.getUsername()+" | password: "+ accountDto.getPassword());
        return ResponseEntity.ok(accountService.register(accountDto));
    }
    @GetMapping("/login")
    public ResponseEntity<?> login(){
        SessionRespone sessionRespone = new SessionRespone();
        sessionRespone.setLogin(false);
        return ResponseEntity.ok(sessionRespone);
    }
    @GetMapping("/user")
    public ResponseEntity<?> getUser(){
        log.info("controller: /user");
        return ResponseEntity.ok("user");
    }
    @GetMapping("/login-failed")
    public ResponseEntity<?> loginFailed(){
        SessionRespone sessionRespone = new SessionRespone();
        sessionRespone.setLogin(false);
        return ResponseEntity.ok(sessionRespone);
    }
    @GetMapping("/login-success")
    public ResponseEntity<?> getSuccess(@RequestHeader(value ="cookie") String cookie){
        log.info("controller: login-success");
        return ResponseEntity.ok(accountService.getAccount(cookie));
    }
    @GetMapping("/logout-success")
    public ResponseEntity<?> logoutSuccess(){
        SessionRespone sessionRespone = new SessionRespone();
        sessionRespone.setLogout(true);
        return ResponseEntity.ok(sessionRespone);
    }
    @GetMapping("/403")
    public ResponseEntity<?> accessDenined(){
        SessionRespone sessionRespone = new SessionRespone();
        sessionRespone.setLogin(true);
        return ResponseEntity.ok(sessionRespone);
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

    @PostMapping("/register_firebase_token")
    public ResponseEntity<?> registerFirebaseToken(@RequestBody BodyFirebaseToken requestBody){
        return ResponseEntity.ok(firebaseService.registerFirebaseToken(requestBody));
    }
}
