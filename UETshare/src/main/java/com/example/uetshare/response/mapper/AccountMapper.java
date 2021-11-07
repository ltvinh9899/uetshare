package com.example.uetshare.response.mapper;

import com.example.uetshare.entity.Account;
import com.example.uetshare.entity.Category;
import com.example.uetshare.response.dto.AccountDto;
import com.example.uetshare.response.dto.CategoryDto;

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
        return accountDto;

    }
}
