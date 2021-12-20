package com.example.uetshare.service;

import com.example.uetshare.entity.Subject;
import com.example.uetshare.response.SubjectResponse;
import com.example.uetshare.response.mapper.SubjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubjectServiceInterface {

    public void createSubject(Subject subject);
    public List<Subject> getAllSubjectByCategoryId(Long category_id, Integer index);
    public List<Subject> getAllSubject();
    public List<Subject> getSubjectByText(Integer index, String text);
    public Subject updateSubject(Long id, Subject subject);
    public ResponseEntity<?> deleteSubject(Long id, SubjectResponse subjectResponse);
    public Integer totalSubject();
    public Integer totalSearchSubject(String text);

}
