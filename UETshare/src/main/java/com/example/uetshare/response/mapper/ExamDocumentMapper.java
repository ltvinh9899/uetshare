package com.example.uetshare.response.mapper;

import com.example.uetshare.entity.ExamDocument;
import com.example.uetshare.entity.Subject;
import com.example.uetshare.response.dto.ExamDocumentDto;
import com.example.uetshare.response.dto.SubjectDto;

public class ExamDocumentMapper {

    public static ExamDocumentDto toExamDocumentDto(ExamDocument examDocument){
        ExamDocumentDto examDocumentDto = new ExamDocumentDto();

        if(examDocument.getId() != null){
            examDocumentDto.setId(examDocument.getId());
        }

        if(examDocument.getLink() != null){
            examDocumentDto.setLink(examDocument.getLink());
        }

        if(examDocument.getName() != null){
            examDocumentDto.setName(examDocument.getName());
        }

        if(examDocument.getExamDocumentType() != null){
            examDocumentDto.setType(examDocument.getExamDocumentType());
        }

        if(examDocument.getAccount() != null){
            if(examDocument.getAccount().getId() != null){
                examDocumentDto.setAccount_id(examDocument.getAccount().getId());
            }
        }

        if ((examDocument.getSubject() != null)){
            if (examDocument.getSubject().getId() != null){
                examDocumentDto.setSubject_id(examDocument.getSubject().getId());
            }
        }

        if (examDocument.getTime() != null){
            examDocumentDto.setTime(examDocument.getTime());
        }

        return examDocumentDto;

    }

}
