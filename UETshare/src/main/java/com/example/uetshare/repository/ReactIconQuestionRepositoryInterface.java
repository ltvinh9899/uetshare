package com.example.uetshare.repository;

import com.example.uetshare.entity.ReactIconQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReactIconQuestionRepositoryInterface extends JpaRepository<ReactIconQuestion, Integer> {

    @Query(value = "select * from uetshare.react_icon_question where uetshare.react_icon_question.question_id = ?1 limit 0, ?2", nativeQuery = true)
    List<ReactIconQuestion> getReactIconByQuestionId(Long question_id, Integer index);

//    @Query(value = "select * from uetshare.react_icon where uetshare.react_icon.comment_id = ?1 limit 0, ?2", nativeQuery = true)
//    List<ReactIconQuestion> getReactIconByCommentId(Long comment_id, Integer index);
}