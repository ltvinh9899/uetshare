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
public interface ReactIconCommentRepositoryInterface extends JpaRepository<ReactIconComment, Integer> {

    @Query(value = "select * from react_icon_comment where react_icon_comment.comment_id = ?1 limit 0, ?2", nativeQuery = true)
    List<ReactIconComment> getReactIconByCommentId(Long comment_id, Integer index);

    @Query(value = "select * from react_icon_comment where react_icon_comment.id = ?1", nativeQuery = true)
    ReactIconComment getReactIconCommentById(Long id);

    @Modifying
    @Transactional
    @Query(value = "delete from react_icon_comment where react_icon_comment.id = ?1", nativeQuery = true)
    void deleteByReactIconId(Long id);

}
