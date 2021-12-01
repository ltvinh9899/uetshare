package com.example.uetshare.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/image")
public class ImageController {
    @GetMapping("/{post_id}")
    public ResponseEntity<?> getImage(){

        return ResponseEntity.ok(null);
    }
}
