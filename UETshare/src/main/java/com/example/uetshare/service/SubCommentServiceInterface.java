package com.example.uetshare.service;

import com.example.uetshare.entity.SubComment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubCommentServiceInterface {

    public void createSubComment(SubComment subComment);
    public List<SubComment> getSubCommentByCommentId(Long comment_id, Integer index);

}
