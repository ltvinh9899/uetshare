package com.example.uetshare.service;

import com.example.uetshare.entity.Category;
import com.example.uetshare.repository.CategoryRepositoryInterface;
import com.example.uetshare.response.CategoryResponse;
import com.example.uetshare.response.SubjectResponse;
import com.example.uetshare.response.dto.CategoryDto;
import com.example.uetshare.response.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@Component
public class CategoryService implements CategoryServiceInterface {

    @Autowired
    private CategoryRepositoryInterface categoryRepositoryInterface;


    @Override
    public void createCategory(Category category) {

        categoryRepositoryInterface.save(category);
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryRepositoryInterface.findAll();
    }

    @Override
    public List<Category> getCategoryPagination(Integer index) {
        return categoryRepositoryInterface.getCategoryPagination(index);
    }

    @Override
    public List<Category> getCategoryByText(Integer index, String text) {
        return categoryRepositoryInterface.getCategoryByText(index, text);
    }

    @Override
    public Category updateCategory(Long id, Category category) {

        Category categoryData = categoryRepositoryInterface.getCategoryById(id);

        if(category.getCategory() != null){
            categoryData.setCategory(category.getCategory());
        }

        categoryData.setTime(Calendar.getInstance());

        System.out.println("hello");
        System.out.println(category.getCategory());
        System.out.println(categoryData);

        return categoryRepositoryInterface.save(categoryData);

    }

    @Override
    public Integer totalCategory() {
        return categoryRepositoryInterface.totalCategory();
    }

    @Override
    public Integer totalSearchCategory(String text) {
        return categoryRepositoryInterface.totalSearchCategory(text);
    }

    @Override
    public ResponseEntity<?> deleteCategory(Long id, CategoryResponse categoryResponse) {
        try {

            Category categoryUsed = categoryRepositoryInterface.getCategoryUsed(id);

            if (categoryUsed != null){
                categoryResponse.setSuccess(false);
                categoryResponse.setMessage("category is used");
            } else {
                Category category = categoryRepositoryInterface.getCategoryById(id);
                categoryRepositoryInterface.delete(category);

                categoryResponse.setSuccess(true);
                categoryResponse.setMessage("update category success");

                List<CategoryDto> categoryDtoList = new ArrayList<>();
                categoryDtoList.add(CategoryMapper.toCategoryDto(category));
                categoryResponse.setCategoryDtoList(categoryDtoList);
            }
            return ResponseEntity.ok(categoryResponse);

        } catch (Exception e) {
            categoryResponse.setSuccess(false);
            categoryResponse.setMessage(e.toString());

            return new ResponseEntity<>(categoryResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//    @Override
//    public Category findCategoryById(Long categoryId) {
//        return categoryRepositoryInterface.findById(categoryId);
//    }
}
