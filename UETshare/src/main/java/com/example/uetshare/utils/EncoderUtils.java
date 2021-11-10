package com.example.uetshare.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncoderUtils {
    public static String encoderPassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}
