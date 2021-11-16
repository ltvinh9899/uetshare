package com.example.uetshare.service;

import com.example.uetshare.entity.TypeContent;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TypeContentServiceInterface {

    public void createTypeContent(TypeContent typeContent);
    public List<TypeContent> getAllTypeContent();

}
