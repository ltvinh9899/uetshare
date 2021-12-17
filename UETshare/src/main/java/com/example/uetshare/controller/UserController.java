package com.example.uetshare.controller;

import com.example.uetshare.entity.UserProfile;
import com.example.uetshare.response.dto.UserProfileDto;
import com.example.uetshare.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user-profile")
public class UserController {
    @Autowired
    private AccountService accountService;
    @GetMapping("/get/{id}")
    public ResponseEntity<?> getUserProfile(@PathVariable(value = "id") Long id){
        return ResponseEntity.ok(accountService.getUserProfile(id));
    }
    @PutMapping("/update")
    public ResponseEntity<?> updateUserProfile(@RequestBody UserProfileDto userProfileDto){
        return ResponseEntity.ok(accountService.updateUserProfile(userProfileDto));
    }
}
