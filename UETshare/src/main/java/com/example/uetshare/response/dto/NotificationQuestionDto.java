package com.example.uetshare.response.dto;

import com.example.uetshare.entity.ActionType;
import com.example.uetshare.entity.Question;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class NotificationQuestionDto {

    private Long id;
    private Long question_id;
    private String username;
    private String avatar;
    private Boolean seen;
    private ActionType action_type;
}
