package com.example.uetshare.response.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Calendar;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {

    private Long id;
    private String content;
    private String image;
    private Long question_id;
    private Long account_id;
    private Calendar time;
    private AccountDto accountDto;
    private Integer like_quantity;
    private Integer sub_comment_quantity;
    private Boolean liked;
}
