package com.example.uetshare.repository;

import com.example.uetshare.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface QuestionRepositoryInterface extends JpaRepository<Question, Integer> {

//    @Query(value = "select q from Question q join q.category where q.category = :category_id")
    List<Question> getByCategory(@Param("category_id") Integer category_id);

    @Query("select q from Question q where q.id = :id")
    Question getQuestionById(@Param("id") Long question_id);

}
