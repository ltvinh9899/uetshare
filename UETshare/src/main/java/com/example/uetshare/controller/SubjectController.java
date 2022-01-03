package com.example.uetshare.controller;

import com.example.uetshare.entity.Subject;
import com.example.uetshare.response.SubjectResponse;
import com.example.uetshare.response.dto.SubjectDto;
import com.example.uetshare.response.mapper.SubjectMapper;
import com.example.uetshare.service.SubjectServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectServiceInterface subjectServiceInterface;

    private final Integer limit = 10;

    @PostMapping("")
    public ResponseEntity<?> createSubject(@RequestBody Subject subject, SubjectResponse subjectResponse){
        try {
            subject.setTime(Calendar.getInstance());
            Subject subjectCreated =  subjectServiceInterface.createSubject(subject);

            subjectResponse.setSuccess(true);
            subjectResponse.setMessage("create subject success");

            List<SubjectDto> subjectDtoList = new ArrayList<>();
            subjectDtoList.add(SubjectMapper.toSubjectDto(subjectCreated));
            subjectResponse.setSubjectDtoList(subjectDtoList);

            return ResponseEntity.ok(subjectResponse);

        } catch (Exception e){

            subjectResponse.setSuccess(false);
            subjectResponse.setMessage(e.toString());

            return new ResponseEntity<>(subjectResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }

    @GetMapping("category/{id}")
    public ResponseEntity<?> getSubjectByCategory(@PathVariable("id") Long id, @Param("index") Integer index, SubjectResponse subjectResponse) {
        try {

            Integer indexToQuery = index*limit;
            List<Subject> subjectList = subjectServiceInterface.getAllSubjectByCategoryId(id, indexToQuery);

            subjectResponse.setSuccess(true);
            subjectResponse.setMessage("get subject success");

            List<SubjectDto> subjectDtoList = new ArrayList<>();
            for(Subject subject : subjectList) {
                subjectDtoList.add(SubjectMapper.toSubjectDto(subject));
            }
            subjectResponse.setResult_quantity(subjectDtoList.size());
            subjectResponse.setSubjectDtoList(subjectDtoList);

            return ResponseEntity.ok(subjectResponse);

        } catch (Exception e){

            subjectResponse.setSuccess(false);
            subjectResponse.setMessage(e.toString());

            return new ResponseEntity<>(subjectResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    @GetMapping("")
    public ResponseEntity<?> getAllSubject(SubjectResponse subjectResponse) {
        try {

            List<Subject> subjectList = subjectServiceInterface.getAllSubject();

            subjectResponse.setSuccess(true);
            subjectResponse.setMessage("get subject success");

            List<SubjectDto> subjectDtoList = new ArrayList<>();
            for(Subject subject : subjectList) {
                subjectDtoList.add(SubjectMapper.toSubjectDto(subject));
            }
            subjectResponse.setResult_quantity(subjectServiceInterface.totalSubject());
            Integer total_page = subjectServiceInterface.totalSubject()/10 + 1;
            subjectResponse.setTotal_page(total_page);
            subjectResponse.setSubjectDtoList(subjectDtoList);

            return ResponseEntity.ok(subjectResponse);

        } catch (Exception e){

            subjectResponse.setSuccess(false);
            subjectResponse.setMessage(e.toString());

            return new ResponseEntity<>(subjectResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchSubject(@Param("index") Integer index, @Param("text") String text, SubjectResponse subjectResponse) {
        try {
            Integer indexToQuery = (index - 1)*10;

            String textToQuery;

            if (text != null){
                textToQuery = "%" + String.join("%", text.split(" ")) + "%";
            } else {
                textToQuery = "%";
            }

            List<Subject> subjectList = subjectServiceInterface.getSubjectByText(indexToQuery, textToQuery);

            subjectResponse.setSuccess(true);
            subjectResponse.setMessage("get subject success");

            List<SubjectDto> subjectDtoList = new ArrayList<>();
            for(Subject subject : subjectList) {
                subjectDtoList.add(SubjectMapper.toSubjectDto(subject));
            }
            subjectResponse.setResult_quantity(subjectServiceInterface.totalSearchSubject(textToQuery));
            Integer total_page = subjectServiceInterface.totalSearchSubject(textToQuery)/10 + 1;
            subjectResponse.setTotal_page(total_page);
            subjectResponse.setSubjectDtoList(subjectDtoList);

            return ResponseEntity.ok(subjectResponse);

        } catch (Exception e){

            subjectResponse.setSuccess(false);
            subjectResponse.setMessage(e.toString());

            return new ResponseEntity<>(subjectResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateSubject(@PathVariable("id") Long id,@RequestBody Subject subject, SubjectResponse subjectResponse){
        try {

            Subject subjectFromDb =  subjectServiceInterface.updateSubject(id, subject);

            subjectResponse.setSuccess(true);
            subjectResponse.setMessage("update subject success");

            List<SubjectDto> subjectDtoList = new ArrayList<>();
            subjectDtoList.add(SubjectMapper.toSubjectDto(subjectFromDb));
            subjectResponse.setSubjectDtoList(subjectDtoList);

            return ResponseEntity.ok(subjectResponse);

        } catch (Exception e){

            subjectResponse.setSuccess(false);
            subjectResponse.setMessage(e.toString());

            return new ResponseEntity<>(subjectResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSubject(@PathVariable("id") Long id, SubjectResponse subjectResponse){
        return subjectServiceInterface.deleteSubject(id, subjectResponse);
    }

}
