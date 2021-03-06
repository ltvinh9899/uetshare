package com.example.uetshare.response.dto;

import com.example.uetshare.entity.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDto {

    private Long id;
    private String content;
    private String title;
    private String image;
    private Long account_id;
    private Long type_content_id;
    private List<Long> categoryIdList;

}
