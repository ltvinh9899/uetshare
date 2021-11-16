package com.example.uetshare.response.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReactIconDto {

    private Long id;
    private Long account_id;
    private Long question_id;
    private Long comment_id;

}
