package com.example.uetshare.response.dto;

import com.example.uetshare.entity.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Calendar;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDto {

    private Long id;
    private String content;
    private String title;
    private Calendar time;
    private Long account_id;
    private Long type_content_id;
    private Long category_id;
    private List<ImageDto> imageDtoList;

}
