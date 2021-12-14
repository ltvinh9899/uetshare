package com.example.uetshare.repository;

import com.example.uetshare.entity.Category;
import com.example.uetshare.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepositoryInterface extends JpaRepository<Category, Integer> {

    @Query(value = "select * from category where category.id = ?1", nativeQuery = true)
    Category getCategoryById(Long id);

}
