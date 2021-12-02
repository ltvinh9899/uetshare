package com.example.uetshare.response.mapper;

import com.example.uetshare.entity.Category;
import com.example.uetshare.entity.Subject;
import com.example.uetshare.response.dto.CategoryDto;
import com.example.uetshare.response.dto.SubjectDto;

public class SubjectMapper {
    public static SubjectDto toSubjectDto(Subject subject){
        SubjectDto subjectDto = new SubjectDto();

        if(subject.getId() != null){
            subjectDto.setId(subject.getId());
        }

        if(subject.getSubject_name() != null){
            subjectDto.setSubject_name(subject.getSubject_name());
        }

        if (subject.getCategory() != null){
            if (subject.getCategory().getId() != null) {
                subjectDto.setCategory_id(subject.getCategory().getId());
            }
        }

        if (subject.getTime() != null){
            subjectDto.setTime(subject.getTime());
        }

        return subjectDto;

    }
}
