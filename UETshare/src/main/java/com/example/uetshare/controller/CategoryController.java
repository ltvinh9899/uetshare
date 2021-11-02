package com.example.uetshare.controller;


import com.example.uetshare.entity.Category;
import com.example.uetshare.response.CategoryResponse;
import com.example.uetshare.response.dto.CategoryDto;
import com.example.uetshare.response.mapper.CategoryMapper;
import com.example.uetshare.service.CategoryServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryServiceInterface categoryServiceInterface;

    @PostMapping("create")
    public ResponseEntity<?> createQuestion(@RequestBody Category category, CategoryResponse categoryResponse){


        try {

            categoryServiceInterface.createCategory(category);

            categoryResponse.setSuccess(true);
            categoryResponse.setMessage("Create question success");

            List<CategoryDto> categoryDtoList = new ArrayList<>();
            categoryDtoList.add(CategoryMapper.toCategoryDto(category));
            categoryResponse.setCategoryDtoList(categoryDtoList);

            return ResponseEntity.ok(categoryResponse);

        } catch (Exception e){

            categoryResponse.setSuccess(false);
            categoryResponse.setMessage(e.toString());

            return new ResponseEntity<>(categoryResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("")
    public ResponseEntity<?> getAllCategory(CategoryResponse categoryResponse){

        try {
            List<Category> categoryList = categoryServiceInterface.getAllCategory();
            List<CategoryDto> categoryDtoList = new ArrayList<>();

            for(Category category : categoryList){
                categoryDtoList.add(CategoryMapper.toCategoryDto(category));
            }

            categoryResponse.setSuccess(true);
            categoryResponse.setMessage("success to get all question");
            categoryResponse.setCategoryDtoList(categoryDtoList);

            return ResponseEntity.ok(categoryResponse);


        } catch (Exception e){

            categoryResponse.setSuccess(false);
            categoryResponse.setMessage(e.toString());

            return new ResponseEntity<>(categoryResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//    @GetMapping("id/{id}")
//    public  ResponseEntity<?> getCategoryById()

}
