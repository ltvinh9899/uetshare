package com.example.uetshare.service;

import com.example.uetshare.entity.ReactIconQuestion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReactIconServiceInterface {

    public void createReactIcon(ReactIconQuestion reactIcon);
    public List<ReactIconQuestion> getReactIconByQuestionId(Long question_id, Integer index);
//    public List<ReactIconQuestion> getReactIconByCommentId(Long comment_id, Integer index);

}
