package com.example.uetshare.repository;

import com.example.uetshare.entity.NotificationComment;
import com.example.uetshare.entity.NotificationQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationCommentRepositoryInterface extends JpaRepository<NotificationComment, Integer> {

    @Query(value = "select * from notification_comment " +
            "inner join comment on notification_comment.comment_id = comment.id " +
            "where comment.account_id = ?1 order by notification_comment.time desc limit 0, ?2", nativeQuery = true)
    List<NotificationComment> getNotificationCommentByAccountAuthorId(Long account_author_id, Integer index);

    @Query(value = "select * from notification_comment " +
            "inner join comment on notification_comment.comment_id = comment.id " +
            "where comment.account_id = ?1 and notification_comment.seen = false order by notification_comment.time desc limit 0, ?2", nativeQuery = true)
    List<NotificationComment> getUnSeenNotification(Long account_author_id, Integer index);

    @Query(value = "select * from notification_comment where notification_comment.id = ?1", nativeQuery = true)
    NotificationComment getNotificationCommentById(Long id);

}
