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
    public ExamDocument createExamDocument(ExamDocument examDocument) {
        return examDocumentRepositoryInterface.save(examDocument);
    }

    @Override
    public List<ExamDocument> getExamDocumentBySubjectIdAndType(Long subject_id, String type, Integer index) {
        return examDocumentRepositoryInterface.getExamDocumentBySubjectIdAndType(subject_id, type, index);
    }

    @Override
    public List<ExamDocument> getExamDocumentByType(String type, Integer index) {
        return examDocumentRepositoryInterface.getExamDocumentByType(type, index);
    }

    @Override
    public List<ExamDocument> searchExamDocument(String type, Integer index, String text) {
        if(type == null){
            return examDocumentRepositoryInterface.getExamDocumentByText(index, text);
        } else {
            return examDocumentRepositoryInterface.getExamDocumentByTextAndType(type, index, text);
        }

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

    @Override
    public Integer totalExamDocument() {
        return examDocumentRepositoryInterface.totalExamDocument();
    }

    @Override
    public Integer totalSearchExamDocument(String type, String text) {
        if(type == null){
            return examDocumentRepositoryInterface.totalExamDocumentSearchByText(text);
        } else {
            return examDocumentRepositoryInterface.totalExamDocumentSearchByTextType(type, text);
        }
    }
}
