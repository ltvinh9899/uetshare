package com.example.uetshare.service;

import com.example.uetshare.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ImageServiceInterface  {

    Image createImage(Image image);
    List<Image> getImageByQuestionId(Long question_id);

}
