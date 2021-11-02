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

    @Query(value = "select * from uetshare.question limit ?1, 10", nativeQuery = true)
    List<Question> getAllQuestion(Integer index);

    @Query(value = "select * from uetshare.question inner join uetshare.category_question " +
            "on uetshare.question.id = uetshare.category_question.question_id " +
            "where uetshare.category_question.category_id = ?1 limit ?2, 2", nativeQuery = true)
    List<Question> getByCategory( Long category_id, Integer index);

    @Query("select q from Question q where q.id = :id")
    Question getQuestionById(@Param("id") Long question_id);

}
