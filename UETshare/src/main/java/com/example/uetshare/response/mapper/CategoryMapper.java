package com.example.uetshare.response.mapper;

import com.example.uetshare.entity.Category;
import com.example.uetshare.response.dto.CategoryDto;

import java.util.Calendar;

public class CategoryMapper {

    public static CategoryDto toCategoryDto(Category category){
        CategoryDto categoryDto = new CategoryDto();

        if(category.getId() != null){
            categoryDto.setId(category.getId());
        }

        if (category.getCategory() != null){
            categoryDto.setCategory(category.getCategory());
        }

        if (category.getTime() != null){
            category.getTime().roll(Calendar.HOUR_OF_DAY, 7);
            categoryDto.setTime(category.getTime());
        }

        return categoryDto;

    }

}
