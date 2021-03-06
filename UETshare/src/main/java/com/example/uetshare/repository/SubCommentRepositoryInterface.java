package com.example.uetshare.repository;

import com.example.uetshare.entity.Question;
import com.example.uetshare.entity.SubComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubCommentRepositoryInterface extends JpaRepository<SubComment, Integer>{

    @Query(value = "select * from uetshare.sub_comment where uetshare.sub_comment.comment_id = ?1 limit 0, ?2", nativeQuery = true)
    List<SubComment> getSubCommentByCommentId(Long comment_id, Integer index);

}
