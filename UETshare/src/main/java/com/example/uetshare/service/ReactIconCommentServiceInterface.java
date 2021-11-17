package com.example.uetshare.service;

import com.example.uetshare.entity.ReactIconComment;
import com.example.uetshare.entity.ReactIconQuestion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReactIconCommentServiceInterface {

    public void createReactIcon(ReactIconComment reactIcon);
    public List<ReactIconComment> getReactIconByCommentId(Long comment_id, Integer index);

}
