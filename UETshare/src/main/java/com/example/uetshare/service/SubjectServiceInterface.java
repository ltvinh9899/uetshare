package com.example.uetshare.service;

import com.example.uetshare.entity.Subject;
import com.example.uetshare.response.mapper.SubjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubjectServiceInterface {

    public void createSubject(Subject subject);
    public List<Subject> getAllSubjectByCategoryId(Long category_id, Integer index);
    public Subject updateSubject(Long id, Subject subject);
    public Subject deleteSubject(Long id);

}