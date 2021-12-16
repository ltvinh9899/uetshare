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

    @Query(value = "select * from question order by question.id desc limit 0, ?1", nativeQuery = true)
    List<Question> getAllQuestion(Integer index);

    @Query(value = "select * from question where question.category_id = ?1 order by question.time desc limit 0, ?2", nativeQuery = true)
    List<Question> getByCategory( Long category_id, Integer index);

    @Query(value = "select * from question where question.id = ?1", nativeQuery = true)
    Question getQuestionById(Long question_id);

    @Query(value = "select * from question where question.type_content_id = ?1 order by question.time desc limit 0, ?2", nativeQuery = true)
    List<Question> getQuestionByTypeContentId(Long type_content_id, Integer index);

    @Query(value = "select * from question where (question.type_content_id = ?3) and (question.title like ?2 or question.content like ?2) order by question.time desc limit 0, ?1", nativeQuery = true)
    List<Question> getQuestionByText(Integer index, String text, Long type_content_id);

    @Query(value ="select * from question where question.account_id = ?1 order by question.time desc limit 0, ?2", nativeQuery = true)
    List<Question> getQuestionByAccountId(Long account_id, Integer index);

    @Query(value ="select * from question where question.account_id = ?1 and question.type_content_id = ?2 order by question.time desc limit 0, ?3", nativeQuery = true)
    List<Question> getByAccountAndTypeContent(Long account_id, Long type_content_id,Integer index);

    @Query(value = "select  * from question inner join comment on question.id = comment.question_id where comment.id = ?1", nativeQuery = true)
    Question getQuestionByCommentId(Long comment_id);

}
