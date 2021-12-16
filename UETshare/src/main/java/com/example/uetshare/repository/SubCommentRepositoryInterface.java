package com.example.uetshare.repository;

import com.example.uetshare.entity.Comment;
import com.example.uetshare.entity.Question;
import com.example.uetshare.entity.SubComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubCommentRepositoryInterface extends JpaRepository<SubComment, Integer>{

    @Query(value = "select * from sub_comment where sub_comment.comment_id = ?1 order by sub_comment.time desc limit 0, ?2", nativeQuery = true)
    List<SubComment> getSubCommentByCommentId(Long comment_id, Integer index);

    @Query(value = "select * from sub_comment where sub_comment.time = ?1", nativeQuery = true)
    SubComment getSubCommentById(Long id);


}
