package com.example.uetshare.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class SessionRespone {
    private boolean isLogin;
    private boolean isLogout;
    private String message;
}
