package com.example.uetshare.repository;

import com.example.uetshare.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepositoryInterface extends JpaRepository<Category, Integer> {
}
