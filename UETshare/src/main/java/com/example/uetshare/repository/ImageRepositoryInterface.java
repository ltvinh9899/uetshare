package com.example.uetshare.repository;

import com.example.uetshare.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepositoryInterface extends JpaRepository<Image, Integer> {

    @Query(value = "select * from image where image.question_id = ?1 order by image.id desc", nativeQuery = true)
    List<Image> getImageByQuestionId(Long question_id);

}
