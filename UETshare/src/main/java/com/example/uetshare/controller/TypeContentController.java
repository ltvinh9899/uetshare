package com.example.uetshare.controller;

import com.example.uetshare.entity.TypeContent;
import com.example.uetshare.response.TypeContentResponse;
import com.example.uetshare.response.dto.TypeContentDto;
import com.example.uetshare.response.mapper.TypeContentMapper;
import com.example.uetshare.service.TypeContentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/type-content")
public class TypeContentController {

    @Autowired
    private TypeContentServiceInterface typeContentServiceInterface;

    @PostMapping("/create")
    public ResponseEntity<?> createTypeContent(@RequestBody TypeContent typeContent, TypeContentResponse typeContentResponse){
        try {

            typeContentServiceInterface.createTypeContent(typeContent);

            typeContentResponse.setSuccess(true);
            typeContentResponse.setMessage("success to get all type content");

            List<TypeContentDto> typeContentDtoList = new ArrayList<>();
            typeContentDtoList.add(TypeContentMapper.toTypeContentDto(typeContent));

            typeContentResponse.setTypeContentDto(typeContentDtoList);

            return ResponseEntity.ok(typeContentResponse);

        } catch (Exception e){
            typeContentResponse.setSuccess(false);
            typeContentResponse.setMessage(e.toString());

            return new ResponseEntity<>(typeContentResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("")
    public ResponseEntity<?> getAllTypeContent(TypeContentResponse typeContentResponse) {

        try {

            List<TypeContent> typeContentList = typeContentServiceInterface.getAllTypeContent();
            List<TypeContentDto> typeContentDtoList = new ArrayList<>();

            for (TypeContent typeContent : typeContentList) {
                typeContentDtoList.add(TypeContentMapper.toTypeContentDto(typeContent));
            }

            typeContentResponse.setSuccess(true);
            typeContentResponse.setMessage("success to get all type content");
            typeContentResponse.setTypeContentDto(typeContentDtoList);

            return ResponseEntity.ok(typeContentResponse);

        } catch (Exception e) {
            typeContentResponse.setSuccess(false);
            typeContentResponse.setMessage(e.toString());

            return new ResponseEntity<>(typeContentResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

