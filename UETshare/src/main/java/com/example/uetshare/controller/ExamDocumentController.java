package com.example.uetshare.controller;

import com.example.uetshare.entity.Comment;
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
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

@RestController
@RequestMapping("/exam-document")
@CrossOrigin(origins = "*")
public class ExamDocumentController {

    @Autowired
    private ExamDocumentServiceInterface examDocumentServiceInterface;

    @Value("${file.upload-dir}")
    String FILE_DIRECTORY;

    private final Integer limit = 10;

    @PostMapping("")
    public ResponseEntity<?> createExamDocument(@RequestParam("ExamDocument") String examDocumentJson, @RequestParam("file") MultipartFile file, ExamDocumentResponse examDocumentResponse){

        try {
            ExamDocument examDocument = new ObjectMapper().readValue(examDocumentJson, ExamDocument.class);
            examDocument.setTime(Calendar.getInstance());
            ExamDocument examDocumentFromDb = examDocumentServiceInterface.createExamDocument(examDocument);

            if(file != null) {
                if (!file.isEmpty()) {
                    String pathDirectoryString = FILE_DIRECTORY + "account_" + examDocumentFromDb.getAccount().getId() + "/exam_document_" + examDocumentFromDb.getId() + "/";
                    String pathFileString = CommentController.writeFile(pathDirectoryString, file);
                    examDocumentFromDb.setLink(pathFileString);
                }
            }
            ExamDocument examDocumentAfterUpdate = examDocumentServiceInterface.updateExamDocument(examDocument.getId(),examDocumentFromDb);

            examDocumentResponse.setSuccess(true);
            examDocumentResponse.setMessage("create exam document success");

            List<ExamDocumentDto> examDocumentDtoList = new ArrayList<>();
            examDocumentDtoList.add(ExamDocumentMapper.toExamDocumentDto(examDocumentAfterUpdate));
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

    @GetMapping("")
    public ResponseEntity<?> getExamDocumentByType( @Param("type") String type, @Param("index") Integer index, ExamDocumentResponse examDocumentResponse){
        try {
            Integer indexToQuery = (index - 1)*10;
            List<ExamDocument> examDocumentList = examDocumentServiceInterface.getExamDocumentByType(type, indexToQuery);

            examDocumentResponse.setSuccess(true);
            examDocumentResponse.setMessage("get exam document success");

            List<ExamDocumentDto> examDocumentDtoList = new ArrayList<>();
            for(ExamDocument examDocument : examDocumentList) {
                examDocumentDtoList.add(ExamDocumentMapper.toExamDocumentDto(examDocument));
            }
            examDocumentResponse.setResult_quantity(examDocumentList.size());
            Integer total_page = examDocumentServiceInterface.totalExamDocument()/10 + 1;
            examDocumentResponse.setTotal_page(total_page);
            examDocumentResponse.setExamDocumentDtoList(examDocumentDtoList);

            return ResponseEntity.ok(examDocumentResponse);

        } catch (Exception e){

            examDocumentResponse.setSuccess(false);
            examDocumentResponse.setMessage(e.toString());

            return new ResponseEntity<>(examDocumentResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchExamDocument( @Param("type") String type, @Param("index") Integer index, @Param("text") String text, ExamDocumentResponse examDocumentResponse){
        try {
            Integer indexToQuery = (index - 1)*10;
            String textToQuery;
            if(text != null){
                textToQuery = "%" + String.join("%", text.split(" ")) + "%";
            } else {
                textToQuery = "%";
            }

            List<ExamDocument> examDocumentList = examDocumentServiceInterface.searchExamDocument(type, indexToQuery, textToQuery);

            examDocumentResponse.setSuccess(true);
            examDocumentResponse.setMessage("get exam document success");

            List<ExamDocumentDto> examDocumentDtoList = new ArrayList<>();
            for(ExamDocument examDocument : examDocumentList) {
                examDocumentDtoList.add(ExamDocumentMapper.toExamDocumentDto(examDocument));
            }
            examDocumentResponse.setResult_quantity(examDocumentServiceInterface.totalSearchExamDocument(type, textToQuery));
            Integer total_page = examDocumentServiceInterface.totalSearchExamDocument(type, textToQuery)/10 + 1;
            examDocumentResponse.setTotal_page(total_page);
            examDocumentResponse.setExamDocumentDtoList(examDocumentDtoList);

            return ResponseEntity.ok(examDocumentResponse);

        } catch (Exception e){

            examDocumentResponse.setSuccess(false);
            examDocumentResponse.setMessage(e.toString());

            return new ResponseEntity<>(examDocumentResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateSubject(@PathVariable("id") Long id, @RequestParam("ExamDocument") String examDocumentJson, @RequestParam(value = "file", required = false) MultipartFile file, ExamDocumentResponse examDocumentResponse){
        try {
            ExamDocument examDocument = new ObjectMapper().readValue(examDocumentJson, ExamDocument.class);
            examDocument.setTime(Calendar.getInstance());

            if(file != null) {
                if (!file.isEmpty()) {
                    String pathDirectoryString = FILE_DIRECTORY + "account_" + examDocument.getAccount().getId() + "/exam_document_" + id + "/";
                    String pathFileString = CommentController.writeFile(pathDirectoryString, file);
                    examDocument.setLink(pathFileString);
                }
            }

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
