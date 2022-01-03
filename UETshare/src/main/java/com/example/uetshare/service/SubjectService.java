package com.example.uetshare.service;

import com.example.uetshare.entity.Subject;
import com.example.uetshare.repository.SubjectRepositoryInterface;
import com.example.uetshare.response.SubjectResponse;
import com.example.uetshare.response.dto.SubjectDto;
import com.example.uetshare.response.mapper.SubjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Component
public class SubjectService implements SubjectServiceInterface{

    @Autowired
    private SubjectRepositoryInterface subjectRepositoryInterface;

    @Override
    public Subject createSubject(Subject subject) {

        return subjectRepositoryInterface.save(subject);

    }

    @Override
    public List<Subject>getAllSubjectByCategoryId(Long category_id, Integer index) {
        return subjectRepositoryInterface.getAllSubjectByCategoryId(category_id, index);
    }

    @Override
    public List<Subject> getAllSubject() {
        return subjectRepositoryInterface.findAll();
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

//        subjectData.setTime(Calendar.getInstance());

        return subjectRepositoryInterface.save(subjectData);

//        return subjectData;
    }

    @Override
    public ResponseEntity<?> deleteSubject(Long id, SubjectResponse subjectResponse) {

        try {

            Subject subjectUsed = subjectRepositoryInterface.getSubjectUsed(id);

            if(subjectUsed != null) {

                subjectResponse.setSuccess(false);
                subjectResponse.setMessage("this subject is used");

            } else {
                Subject subject = subjectRepositoryInterface.getSubjectById(id);
                subjectRepositoryInterface.deleteBySubjectId(id);

                subjectResponse.setSuccess(true);
                subjectResponse.setMessage("delete subject success");

                List<SubjectDto> subjectDtoList = new ArrayList<>();
                subjectDtoList.add(SubjectMapper.toSubjectDto(subject));
                subjectResponse.setSubjectDtoList(subjectDtoList);
            }

            return ResponseEntity.ok(subjectResponse);

        } catch (Exception e){

            subjectResponse.setSuccess(false);
            subjectResponse.setMessage(e.toString());

            return new ResponseEntity<>(subjectResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    @Override
    public Integer totalSubject() {
        return subjectRepositoryInterface.totalSubject();
    }

    @Override
    public Integer totalSearchSubject(String text) {
        return subjectRepositoryInterface.totalSearchSubject(text);
    }
}
