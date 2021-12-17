package com.example.uetshare.response.dto;

import com.example.uetshare.entity.ExamDocumentType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Calendar;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ExamDocumentDto {

    private Long id;
    private String link;
    private String file_name;
    private String name;
    private ExamDocumentType type;
    private Long account_id;
    private Long subject_id;
    private SubjectDto subjectDto;
    private Calendar time;
}
