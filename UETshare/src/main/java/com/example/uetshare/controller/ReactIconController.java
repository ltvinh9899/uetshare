package com.example.uetshare.controller;

import com.example.uetshare.entity.Question;
import com.example.uetshare.entity.ReactIcon;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/react-icon")
public class ReactIconController {

    
    @PostMapping("/question/{id}")
    public ResponseEntity<?> createReactInQuestion(@RequestBody ReactIcon reactIcon, @PathVariable Long id) {

        return null;

    }

    @PostMapping("/comment/{id}")
    public ResponseEntity<?> createReactInComment(@RequestBody ReactIcon reactIcon, @PathVariable Long id) {

        return null;

    }

    @GetMapping("/question/{id}")
    public ResponseEntity<?> getReactByQuestionId(@RequestBody ReactIcon reactIcon, @PathVariable Long id) {

        return null;

    }

    @GetMapping("/comment/{id}")
    public ResponseEntity<?> getReactByCommentId(@RequestBody ReactIcon reactIcon, @PathVariable Long id) {

        return null;

    }

}
