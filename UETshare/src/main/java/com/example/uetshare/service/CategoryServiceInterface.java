package com.example.uetshare.service;

import com.example.uetshare.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryServiceInterface {
    void createCategory(Category category);
    List<Category> getAllCategory();
    List<Category> getCategoryPagination(Integer index);
    List<Category> getCategoryByText(Integer index, String text);
    Category updateCategory(Long id, Category category);
    Integer totalCategory();
    Integer totalSearchCategory(String text);
}
