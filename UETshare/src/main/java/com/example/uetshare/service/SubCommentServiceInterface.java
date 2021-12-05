package com.example.uetshare.service;

import com.example.uetshare.entity.Comment;
import com.example.uetshare.entity.SubComment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubCommentServiceInterface {

    public SubComment createSubComment(SubComment subComment);
    public List<SubComment> getSubCommentByCommentId(Long comment_id, Integer index);
    public SubComment updateSubComment(Long id, SubComment subComment);
}
