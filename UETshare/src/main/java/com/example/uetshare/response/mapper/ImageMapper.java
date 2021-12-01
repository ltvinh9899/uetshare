package com.example.uetshare.response.mapper;

import com.example.uetshare.entity.Image;
import com.example.uetshare.response.dto.ImageDto;

public class ImageMapper {
    public static ImageDto toImageDto(Image image){
        ImageDto imageDto = new ImageDto();
        imageDto.setImage(image.getImage());
        imageDto.setQuestion(image.getQuestion());
        imageDto.setTime(image.getTime());
        return imageDto;
    }
}
