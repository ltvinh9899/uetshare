package com.example.uetshare.controller;

import com.example.uetshare.entity.ExamDocument;
import com.example.uetshare.entity.ExamDocumentType;
import com.example.uetshare.entity.Subject;
import com.example.uetshare.response.ExamDocumentResponse;
import com.example.uetshare.response.dto.ExamDocumentDto;
import com.example.uetshare.response.dto.SubjectDto;
import com.example.uetshare.response.mapper.ExamDocumentMapper;
import com.example.uetshare.response.mapper.SubjectMapper;
import com.example.uetshare.service.ExamDocumentServiceInterface;
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
@RequestMapping("/exam-document")
public class ExamDocumentController {

    @Autowired
    private ExamDocumentServiceInterface examDocumentServiceInterface;

    private final Integer limit = 10;

    @PostMapping("")
    public ResponseEntity<?> createExamDocument(@RequestBody ExamDocument examDocument, ExamDocumentResponse examDocumentResponse){

        try {
            examDocument.setTime(Calendar.getInstance());
            examDocumentServiceInterface.createExamDocument(examDocument);

            examDocumentResponse.setSuccess(true);
            examDocumentResponse.setMessage("create exam document success");

            List<ExamDocumentDto> examDocumentDtoList = new ArrayList<>();
            examDocumentDtoList.add(ExamDocumentMapper.toExamDocumentDto(examDocument));
            examDocumentResponse.setExamDocumentDtoList(examDocumentDtoList);

            return ResponseEntity.ok(examDocumentResponse);

        } catch (Exception e){
            examDocumentResponse.setSuccess(false);
            examDocumentResponse.setMessage(e.toString());

            return new ResponseEntity<>(examDocumentResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("subject/{id}")
    public ResponseEntity<?> getExamDocumentBySubjectIdAndType(@PathVariable("id") Long id, @Param("type") String type, @Param("index") Integer index, ExamDocumentResponse examDocumentResponse){
        try {

            Integer indexToQuery = index*limit;
            List<ExamDocument> examDocumentList = examDocumentServiceInterface.getExamDocumentBySubjectIdAndType(id, type, indexToQuery);

            examDocumentResponse.setSuccess(true);
            examDocumentResponse.setMessage("get exam document success");

            List<ExamDocumentDto> examDocumentDtoList = new ArrayList<>();
            for(ExamDocument examDocument : examDocumentList) {
                examDocumentDtoList.add(ExamDocumentMapper.toExamDocumentDto(examDocument));
            }
            examDocumentResponse.setResult_quantity(examDocumentList.size());
            examDocumentResponse.setExamDocumentDtoList(examDocumentDtoList);

            return ResponseEntity.ok(examDocumentResponse);

        } catch (Exception e){

            examDocumentResponse.setSuccess(false);
            examDocumentResponse.setMessage(e.toString());

            return new ResponseEntity<>(examDocumentResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateSubject(@PathVariable("id") Long id, @RequestBody ExamDocument examDocument, ExamDocumentResponse examDocumentResponse){
        try {

            ExamDocument examDocumentFromDb =  examDocumentServiceInterface.updateExamDocument(id, examDocument);

            examDocumentResponse.setSuccess(true);
            examDocumentResponse.setMessage("update exam document success");

            List<ExamDocumentDto> examDocumentDtoList = new ArrayList<>();
            examDocumentDtoList.add(ExamDocumentMapper.toExamDocumentDto(examDocumentFromDb));
            examDocumentResponse.setExamDocumentDtoList(examDocumentDtoList);

            return ResponseEntity.ok(examDocumentResponse);

        } catch (Exception e){

            examDocumentResponse.setSuccess(false);
            examDocumentResponse.setMessage(e.toString());

            return new ResponseEntity<>(examDocumentResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteExamDocument(@PathVariable("id") Long id, ExamDocumentResponse examDocumentResponse){
        try {

            ExamDocument examDocument = examDocumentServiceInterface.deleteExamDocument(id);

            examDocumentResponse.setSuccess(true);
            examDocumentResponse.setMessage("delete exam document success");

            List<ExamDocumentDto> examDocumentDtoList = new ArrayList<>();
            examDocumentDtoList.add(ExamDocumentMapper.toExamDocumentDto(examDocument));
            examDocumentResponse.setExamDocumentDtoList(examDocumentDtoList);

            return ResponseEntity.ok(examDocumentResponse);

        } catch (Exception e){

            examDocumentResponse.setSuccess(false);
            examDocumentResponse.setMessage(e.toString());

            return new ResponseEntity<>(examDocumentResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }
}
