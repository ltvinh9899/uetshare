package com.example.uetshare.response.mapper;

import com.example.uetshare.entity.Account;
import com.example.uetshare.entity.Category;
import com.example.uetshare.response.dto.AccountDto;
import com.example.uetshare.response.dto.CategoryDto;

import java.util.Calendar;

public class AccountMapper {
    public static AccountDto toAccountDto(Account account){
        AccountDto accountDto= new AccountDto();

        if(account.getId() != null){
            accountDto.setId(account.getId());
        }

        if (account.getUsername() != null){
            accountDto.setUsername(account.getUsername());
        }

        if (account.getAvatar() != null){
            accountDto.setAvatar(account.getAvatar());
        }

        if (account.getTime() != null){
            account.getTime().roll(Calendar.HOUR_OF_DAY, 7);
            accountDto.setTime(account.getTime());
        }

        return accountDto;

    }
}
