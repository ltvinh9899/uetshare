package com.example.uetshare.controller;


import com.example.uetshare.entity.Category;
import com.example.uetshare.response.CategoryResponse;
import com.example.uetshare.response.dto.CategoryDto;
import com.example.uetshare.response.dto.SubjectDto;
import com.example.uetshare.response.mapper.CategoryMapper;
import com.example.uetshare.response.mapper.SubjectMapper;
import com.example.uetshare.service.CategoryServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
////
@RestController
@RequestMapping("/category")
@CrossOrigin(origins = "*")
public class CategoryController {

    @Autowired
    private CategoryServiceInterface categoryServiceInterface;

    @PostMapping("create")
    public ResponseEntity<?> createQuestion(@RequestBody Category category, CategoryResponse categoryResponse){


        try {
            category.setTime(Calendar.getInstance());
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

    @GetMapping("/pagination")
    public ResponseEntity<?> getCategoryPagination(CategoryResponse categoryResponse, @Param("index") Integer index){

        try {

            Integer indexToQuery = (index - 1)*10;
            List<Category> categoryList = categoryServiceInterface.getCategoryPagination(indexToQuery);

            List<CategoryDto> categoryDtoList = new ArrayList<>();

            for(Category category : categoryList){
                categoryDtoList.add(CategoryMapper.toCategoryDto(category));
            }

            categoryResponse.setSuccess(true);
            categoryResponse.setMessage("success to get category");
            categoryResponse.setResult_quantity(categoryServiceInterface.totalCategory());
            Integer total_page = categoryServiceInterface.totalCategory()/10 + 1;
            categoryResponse.setTotal_page(total_page);
            categoryResponse.setCategoryDtoList(categoryDtoList);

            return ResponseEntity.ok(categoryResponse);


        } catch (Exception e){

            categoryResponse.setSuccess(false);
            categoryResponse.setMessage(e.toString());

            return new ResponseEntity<>(categoryResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchCategory(CategoryResponse categoryResponse, @Param("index") Integer index, @Param("text") String text){

        try {
            Integer indexToQuery = (index - 1)*10;
            String textToQuery = "%" + String.join("%", text.split(" ")) + "%";
            List<Category> categoryList = categoryServiceInterface.getCategoryByText(indexToQuery, textToQuery);
            List<CategoryDto> categoryDtoList = new ArrayList<>();

            for(Category category : categoryList){
                categoryDtoList.add(CategoryMapper.toCategoryDto(category));
            }

            categoryResponse.setSuccess(true);
            categoryResponse.setMessage("success to get category");
            categoryResponse.setResult_quantity(categoryServiceInterface.totalSearchCategory(textToQuery));
            Integer total_page = categoryServiceInterface.totalSearchCategory(textToQuery)/10 + 1;
            categoryResponse.setTotal_page(total_page);
            categoryResponse.setCategoryDtoList(categoryDtoList);

            return ResponseEntity.ok(categoryResponse);


        } catch (Exception e){

            categoryResponse.setSuccess(false);
            categoryResponse.setMessage(e.toString());

            return new ResponseEntity<>(categoryResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateCategory(@PathVariable("id") Long id, @RequestBody Category category, CategoryResponse categoryResponse){

       try {

           System.out.println(category.getCategory());
           Category categoryAfterUpdate = categoryServiceInterface.updateCategory(id, category);



           categoryResponse.setSuccess(true);
           categoryResponse.setMessage("update category success");

           List<CategoryDto> categoryDtoList = new ArrayList<>();
           categoryDtoList.add(CategoryMapper.toCategoryDto(categoryAfterUpdate));
           categoryResponse.setCategoryDtoList(categoryDtoList);

           return ResponseEntity.ok(categoryResponse);

       } catch (Exception e) {
           categoryResponse.setSuccess(false);
           categoryResponse.setMessage(e.toString());

           return new ResponseEntity<>(categoryResponse, HttpStatus.INTERNAL_SERVER_ERROR);
       }

    }


//    @GetMapping("id/{id}")
//    public  ResponseEntity<?> getCategoryById()

}
