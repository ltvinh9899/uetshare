package com.example.uetshare.repository;

import com.example.uetshare.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image,Long> {
    @Query(value = "select * from image where question_id=?1", nativeQuery = true)
    public List<Image> getImagesByQuestionId(Long questionId);
    public void deleteAllByQuestionId(Long questionId);
    
}
