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
public class SubCommentDto {

    private Long id;
    private String content;
    private String image;
    private Long comment_id;
    private Calendar time;

}
