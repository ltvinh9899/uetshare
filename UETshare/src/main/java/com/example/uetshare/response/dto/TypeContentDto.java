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
public class TypeContentDto {

    private Long id;
    private String type_content;
    private Calendar time;

}
