package com.example.uetshare.service;

import com.example.uetshare.entity.Category;
import com.example.uetshare.response.CategoryResponse;
import com.example.uetshare.response.SubjectResponse;
import org.springframework.http.ResponseEntity;
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
    ResponseEntity<?> deleteCategory(Long id, CategoryResponse categoryResponse);
}
