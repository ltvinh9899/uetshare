package com.example.uetshare.response;

import com.example.uetshare.response.dto.AccountDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountResponse extends Response{
    private boolean isSuccess;
    private boolean isLogin;
    private String message;
    private AccountDto accountDto;
}
