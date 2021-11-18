package com.example.uetshare.repository;

import com.example.uetshare.entity.NotificationComment;
import com.example.uetshare.entity.NotificationQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationCommentRepositoryInterface extends JpaRepository<NotificationComment, Integer> {

    @Query(value = "select * from uetshare.notification_comment " +
            "inner join uetshare.comment on uetshare.notification_comment.comment_id = uetshare.comment.id " +
            "where uetshare.comment.account_id = ?1 limit 0, ?2", nativeQuery = true)
    List<NotificationComment> getNotificationCommentByAccountAuthorId(Long account_author_id, Integer index);

    @Query(value = "select * from uetshare.notification_comment where uetshare.notification_comment.id = ?1", nativeQuery = true)
    NotificationComment getNotificationCommentById(Long id);

}
