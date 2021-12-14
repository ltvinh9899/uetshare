package com.example.uetshare.repository;

import com.example.uetshare.entity.Category;
import com.example.uetshare.entity.Comment;
import com.example.uetshare.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepositoryInterface extends JpaRepository<Comment, Integer> {

    @Query(value = "select * from comment where comment.question_id = ?2 order by comment.id desc limit 0, ?1", nativeQuery = true)
    List<Comment> getCommentByQuestionId(Integer index, Long question_id);

    @Query(value = "select * from comment where comment.id = ?1", nativeQuery = true)
    Comment getCommentById(Long id);

}
