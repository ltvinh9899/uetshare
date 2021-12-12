package com.example.uetshare.repository;

import com.example.uetshare.entity.NotificationQuestion;
import com.example.uetshare.entity.ReactIconQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationQuestionRepositoryInterface extends JpaRepository<NotificationQuestion, Integer> {

    @Query(value = "select * from notification_question " +
            "inner join question on notification_question.question_id = question.id " +
            "where question.account_id = ?1 order by notification_question.id desc limit 0, ?2", nativeQuery = true)
    List<NotificationQuestion> getNotificationQuestionByAccountAuthorId(Long account_author_id, Integer index);

    @Query(value = "select * from notification_question " +
            "inner join question on notification_question.question_id = question.id " +
            "where question.account_id = ?1 and notification_question.seen = false order by notification_question.id desc limit 0, ?2", nativeQuery = true)
    List<NotificationQuestion> getUnseenNotificationQuestion(Long account_author_id, Integer index);

    @Query(value = "select * from notification_question where notification_question.id = ?1", nativeQuery = true)
    NotificationQuestion getNotificationQuestionById(Long id);

}
