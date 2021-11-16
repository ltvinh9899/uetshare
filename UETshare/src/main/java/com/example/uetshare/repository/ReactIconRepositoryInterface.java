package com.example.uetshare.repository;

import com.example.uetshare.entity.Question;
import com.example.uetshare.entity.ReactIcon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReactIconRepositoryInterface extends JpaRepository<ReactIcon, Integer> {

    @Query(value = "select * from uetshare.react_icon where uetshare.react_icon.question_id = ?1 limit 0, ?2", nativeQuery = true)
    List<ReactIcon> getReactIconByQuestionId(Long question_id, Integer index);

    @Query(value = "select * from uetshare.react_icon where uetshare.react_icon.comment_id = ?1 limit 0, ?2", nativeQuery = true)
    List<ReactIcon> getReactIconByCommentId(Long comment_id, Integer index);
}
