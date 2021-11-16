package com.example.uetshare.service;

import com.example.uetshare.entity.TypeContent;
import com.example.uetshare.repository.TypeContentResponseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class TypeContentService implements TypeContentServiceInterface {

    @Autowired
    private TypeContentResponseInterface typeContentResponseInterface;

    @Override
    public void createTypeContent(TypeContent typeContent) {
        typeContentResponseInterface.save(typeContent);
    }

    @Override
    public List<TypeContent> getAllTypeContent() {
        return typeContentResponseInterface.findAll();
    }
}
