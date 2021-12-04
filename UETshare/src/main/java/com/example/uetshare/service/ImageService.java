package com.example.uetshare.service;

import com.example.uetshare.entity.Image;
import com.example.uetshare.repository.ImageRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ImageService implements ImageServiceInterface{

    @Autowired
    private ImageRepositoryInterface imageRepositoryInterface;

    @Override
    public Image createImage(Image image) {
        return imageRepositoryInterface.save(image);
    }

    @Override
    public List<Image> getImageByQuestionId(Long question_id) {
        return imageRepositoryInterface.getImageByQuestionId(question_id);
    }
}
