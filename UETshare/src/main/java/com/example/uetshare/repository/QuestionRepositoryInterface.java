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

    @Query(value = "select * from uetshare.question limit 0, ?1", nativeQuery = true)
    List<Question> getAllQuestion(Integer index);

    @Query(value = "select * from uetshare.question where uetshare.question.category_id = ?1 limit 0, ?2", nativeQuery = true)
    List<Question> getByCategory( Long category_id, Integer index);

    @Query(value = "select * from uetshare.question where uetshare.question.id = ?1", nativeQuery = true)
    Question getQuestionById(Long question_id);

    @Query(value = "select * from uetshare.question where uetshare.question.type_content_id = ?1 limit 0, ?2", nativeQuery = true)
    List<Question> getQuestionByTypeContentId(Long type_content_id, Integer index);

    @Query(value = "select * from uetshare.question where (uetshare.question.type_content_id = ?3) and (uetshare.question.title like ?2 or uetshare.question.content like ?2) limit 0, ?1", nativeQuery = true)
    List<Question> getQuestionByText(Integer index, String text, Long type_content_id);

    @Query(value ="select * from uetshare.question where uetshare.question.account_id = ?1 limit 0, ?2", nativeQuery = true)
    List<Question> getQuestionByAccountId(Long account_id, Integer index);

}
