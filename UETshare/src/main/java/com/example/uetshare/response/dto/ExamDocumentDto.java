package com.example.uetshare.response.dto;

import com.example.uetshare.entity.ExamDocumentType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ExamDocumentDto {

    private Long id;
    private String link;
    private String name;
    private ExamDocumentType type;
    private Long account_id;
    private Long subject_id;

}
