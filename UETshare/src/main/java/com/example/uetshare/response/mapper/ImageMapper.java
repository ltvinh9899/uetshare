package com.example.uetshare.response.mapper;

import com.example.uetshare.entity.Image;
import com.example.uetshare.response.dto.ImageDto;

public class ImageMapper {

    public static ImageDto toImageDto(Image image){

        ImageDto imageDto = new ImageDto();

        if(image.getId() != null){
            imageDto.setId(image.getId());
        }

        if(image.getImage() != null){
            imageDto.setImage(image.getImage());
        }

        return imageDto;
    }

}
