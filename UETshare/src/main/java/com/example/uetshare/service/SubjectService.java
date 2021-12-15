package com.example.uetshare.service;

import com.example.uetshare.entity.Subject;
import com.example.uetshare.repository.SubjectRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.List;

@Component
public class SubjectService implements SubjectServiceInterface{

    @Autowired
    private SubjectRepositoryInterface subjectRepositoryInterface;

    @Override
    public void createSubject(Subject subject) {

        subjectRepositoryInterface.save(subject);

    }

    @Override
    public List<Subject>getAllSubjectByCategoryId(Long category_id, Integer index) {
        return subjectRepositoryInterface.getAllSubjectByCategoryId(category_id, index);
    }

    @Override
    public List<Subject> getAllSubject(Integer index) {
        return subjectRepositoryInterface.getAllSubject(index);
    }

    @Override
    public List<Subject> getSubjectByText(Integer index, String text) {
        return subjectRepositoryInterface.getSubjectByText(index, text);
    }

    @Override
    public Subject updateSubject(Long id, Subject subject) {
        Subject subjectData = subjectRepositoryInterface.getSubjectById(id);

        if(subject.getSubject_name() != null){
            subjectData.setSubject_name(subject.getSubject_name());
        }

        if(subject.getCategory() != null){
            subjectData.setCategory(subject.getCategory());
        }

        subjectData.setTime(Calendar.getInstance());

        return subjectRepositoryInterface.save(subjectData);

//        return subjectData;
    }

    @Override
    public Subject deleteSubject(Long id) {
        Subject subject = subjectRepositoryInterface.getSubjectById(id);
        subjectRepositoryInterface.deleteBySubjectId(id);

        return subject;
    }
}
