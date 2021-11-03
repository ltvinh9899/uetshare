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
    private Account account;
    private List<Long> categoryIdList;

}
