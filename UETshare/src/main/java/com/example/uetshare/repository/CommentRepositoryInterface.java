package com.example.uetshare.repository;

import com.example.uetshare.entity.Category;
import com.example.uetshare.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepositoryInterface extends JpaRepository<Comment, Integer> {

    @Query(value = "select * from uetshare.comment where uetshare.comment.question_id = ?2 limit 0, ?1", nativeQuery = true)
    List<Comment> getCommentByQuestionId(Integer index, Long question_id);

}
