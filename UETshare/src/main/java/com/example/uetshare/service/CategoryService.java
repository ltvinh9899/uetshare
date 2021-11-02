package com.example.uetshare.service;

import com.example.uetshare.entity.Category;
import com.example.uetshare.repository.CategoryRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

//    @Override
//    public Category findCategoryById(Long categoryId) {
//        return categoryRepositoryInterface.findById(categoryId);
//    }
}
