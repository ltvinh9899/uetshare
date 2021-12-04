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
public class ReactIconQuestionDto {

    private Long id;
    private Long account_id;
    private Long question_id;
    private Calendar time;

}
