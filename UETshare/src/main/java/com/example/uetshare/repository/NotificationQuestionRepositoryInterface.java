package com.example.uetshare.repository;

import com.example.uetshare.entity.NotificationQuestion;
import com.example.uetshare.entity.ReactIconQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationQuestionRepositoryInterface extends JpaRepository<NotificationQuestion, Integer> {

    @Query(value = "select * from uetshare.notification_question " +
            "inner join uetshare.question on uetshare.notification_question.question_id = uetshare.question.id " +
            "where uetshare.question.account_id = ?1 limit 0, ?2", nativeQuery = true)
    List<NotificationQuestion> getNotificationQuestionByAccountAuthorId(Long account_author_id, Integer index);

    @Query(value = "select * from uetshare.notification_question where uetshare.notification_question.id = ?1", nativeQuery = true)
    NotificationQuestion getNotificationQuestionById(Long id);

}
