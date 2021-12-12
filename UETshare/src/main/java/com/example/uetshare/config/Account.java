package com.example.uetshare.config;

import com.example.uetshare.response.dto.AccountDto;
import com.example.uetshare.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Account {
    @Autowired
    AccountService accountService;
    @Bean
    public void init(){
        AccountDto accountDto = new AccountDto();
        accountDto.setUsername("admin123");
        accountDto.setPassword("admin123");
        accountService.register(accountDto);
    }
}
