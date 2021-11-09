package com.example.uetshare.service;

import com.example.uetshare.entity.ReactIcon;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReactIconServiceInterface {

    public void createReactIcon(ReactIcon reactIcon);
    public List<ReactIcon> getReactIconByQuestionId(Long question_id, Integer index);
    public List<ReactIcon> getReactIconByCommentId(Long comment_id, Integer index);

}
