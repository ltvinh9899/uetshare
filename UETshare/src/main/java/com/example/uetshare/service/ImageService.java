package com.example.uetshare.service;

import com.example.uetshare.entity.Account;
import com.example.uetshare.entity.Image;
import com.example.uetshare.entity.Question;
import com.example.uetshare.repository.ImageRepository;
import com.example.uetshare.response.ImageRespone;
import com.example.uetshare.response.dto.AccountDto;
import com.example.uetshare.response.dto.ImageDto;
import com.example.uetshare.response.mapper.ImageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class ImageService implements IImageService{
    @Autowired
    private ImageRepository imageRepository;
    @Override
    public ImageDto getImage(Long questionId) {
        return null;
    }

    @Override
    public ImageDto putImage(Question question) {
        Image image  =new Image();
        image.setImage("/"+question.getAccount().getUsername()+"/"+question.getId());
        image.setQuestion(question);
        imageRepository.save(image);
        Image imageGet = (Image) imageRepository.getImagesByQuestionId(question.getId());
        ImageDto imageDto = ImageMapper.toImageDto(imageGet);
        return imageDto;
    }

    @Override
    public Image updateImage(Image image) {
        return null;
    }

    @Override
    public boolean deleteAllImage(Question question) {

        return true ;
    }
}
