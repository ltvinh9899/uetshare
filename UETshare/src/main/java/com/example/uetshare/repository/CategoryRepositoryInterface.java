package com.example.uetshare.repository;

import com.example.uetshare.entity.Category;
import com.example.uetshare.entity.Question;
import com.example.uetshare.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepositoryInterface extends JpaRepository<Category, Integer> {

    @Query(value = "select * from category where category.id = ?1", nativeQuery = true)
    Category getCategoryById(Long id);

    @Query(value = "select * from category order by category.id desc limit 0, ?1", nativeQuery = true)
    List<Category> getCategoryPagination(Integer index);

}
