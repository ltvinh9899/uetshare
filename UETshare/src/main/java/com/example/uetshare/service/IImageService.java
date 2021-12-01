package com.example.uetshare.service;

import com.example.uetshare.entity.Image;
import com.example.uetshare.entity.Question;
import com.example.uetshare.response.dto.AccountDto;
import com.example.uetshare.response.dto.ImageDto;

public interface IImageService {
    public ImageDto getImage(Long question);

    public ImageDto putImage(Question question);

    public Image updateImage(Image image);
    public boolean deleteAllImage(Question question);
}
