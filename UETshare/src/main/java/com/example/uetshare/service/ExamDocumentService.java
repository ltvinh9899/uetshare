package com.example.uetshare.service;

import com.example.uetshare.entity.ExamDocument;
import com.example.uetshare.entity.ExamDocumentType;
import com.example.uetshare.entity.Subject;
import com.example.uetshare.repository.ExamDocumentRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.List;

@Component
public class ExamDocumentService implements ExamDocumentServiceInterface {

    @Autowired
    private ExamDocumentRepositoryInterface examDocumentRepositoryInterface;

    @Override
    public void createExamDocument(ExamDocument examDocument) {
        examDocumentRepositoryInterface.save(examDocument);
    }

    @Override
    public List<ExamDocument> getExamDocumentBySubjectIdAndType(Long subject_id, String type, Integer index) {
        return examDocumentRepositoryInterface.getExamDocumentBySubjectIdAndType(subject_id, type, index);
    }

    @Override
    public ExamDocument updateExamDocument(Long id, ExamDocument examDocument) {

        ExamDocument examDocumentData = examDocumentRepositoryInterface.getExamDocumentById(id);

        if(examDocument.getLink() != null){
            examDocumentData.setLink(examDocument.getLink());
        }

        if (examDocument.getName() != null){
            examDocumentData.setName(examDocument.getName());
        }

        if(examDocument.getExamDocumentType() != null){
            examDocumentData.setExamDocumentType(examDocument.getExamDocumentType());
        }

        if(examDocument.getSubject() != null){
            examDocumentData.setSubject(examDocument.getSubject());
        }

        if(examDocument.getAccount() != null){
            examDocumentData.setAccount(examDocument.getAccount());
        }

        examDocumentData.setTime(Calendar.getInstance());

        return examDocumentRepositoryInterface.save(examDocumentData);

//        return examDocumentData;
    }

    @Override
    public  ExamDocument deleteExamDocument(Long id) {
        ExamDocument examDocument = examDocumentRepositoryInterface.getExamDocumentById(id);
        examDocumentRepositoryInterface.deleteByExamDocumentId(id);

        return examDocument;
    }
}
