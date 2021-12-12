package com.example.uetshare.repository;

import com.example.uetshare.entity.ReactIconComment;
import com.example.uetshare.entity.ReactIconQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ReactIconQuestionRepositoryInterface extends JpaRepository<ReactIconQuestion, Integer> {

    @Query(value = "select * from react_icon_question where react_icon_question.question_id = ?1 order by react_icon_question.id desc limit 0, ?2", nativeQuery = true)
    List<ReactIconQuestion> getReactIconByQuestionId(Long question_id, Integer index);

//    @Query(value = "select * from uetshare.react_icon where uetshare.react_icon.comment_id = ?1 limit 0, ?2", nativeQuery = true)
//    List<ReactIconQuestion> getReactIconByCommentId(Long comment_id, Integer index);

    @Query(value = "select * from react_icon_question where react_icon_question.account_id = ?1 and react_icon_question.question_id = ?2", nativeQuery = true)
    ReactIconQuestion getReactIconQuestionByByAccountAndQuestion(Long account_id, Long question_id);

    @Modifying
    @Transactional
    @Query(value = "delete from react_icon_question where react_icon_question.account_id = ?1 and react_icon_question.question_id = ?2", nativeQuery = true)
    void deleteReactIconQuestion(Long account_id, Long question_id);

}
