package com.example.uetshare.service;

import com.example.uetshare.entity.Category;
import com.example.uetshare.repository.CategoryRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

//    @Override
//    public Category findCategoryById(Long categoryId) {
//        return categoryRepositoryInterface.findById(categoryId);
//    }
}
