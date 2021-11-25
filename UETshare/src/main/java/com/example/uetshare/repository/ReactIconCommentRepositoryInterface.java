package com.example.uetshare.repository;

import com.example.uetshare.entity.ReactIconComment;
import com.example.uetshare.entity.ReactIconQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReactIconCommentRepositoryInterface extends JpaRepository<ReactIconComment, Integer> {

    @Query(value = "select * from uetshare.react_icon_comment where uetshare.react_icon_comment.comment_id = ?1 limit 0, ?2", nativeQuery = true)
    List<ReactIconComment> getReactIconByCommentId(Long comment_id, Integer index);

}
