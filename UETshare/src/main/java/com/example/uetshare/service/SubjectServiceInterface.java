package com.example.uetshare.service;

import com.example.uetshare.entity.Subject;
import com.example.uetshare.response.mapper.SubjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubjectServiceInterface {

    public void createSubject(Subject subject);
    public List<Subject> getAllSubjectByCategoryId(Long category_id, Integer index);
    public List<Subject> getAllSubject(Integer index);
    public List<Subject> getSubjectByText(Integer index, String text);
    public Subject updateSubject(Long id, Subject subject);
    public Subject deleteSubject(Long id);
    public Integer totalSubject();
    public Integer totalSearchSubject(String text);

}
