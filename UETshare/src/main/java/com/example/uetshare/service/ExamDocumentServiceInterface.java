package com.example.uetshare.service;

import com.example.uetshare.entity.ExamDocument;
import com.example.uetshare.entity.ExamDocumentType;
import com.example.uetshare.entity.Subject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExamDocumentServiceInterface {

    public ExamDocument createExamDocument(ExamDocument examDocument);
    public List<ExamDocument> getExamDocumentBySubjectIdAndType(Long subject_id, String type, Integer index);
    public List<ExamDocument> getExamDocumentByType(String type, Integer index);
    public List<ExamDocument> searchExamDocument(String type, Integer index, String text);
    public ExamDocument updateExamDocument(Long id, ExamDocument examDocument);
    public ExamDocument deleteExamDocument(Long id);
    public Integer totalExamDocument();
    public Integer totalSearchExamDocument(String type, String text);
}
