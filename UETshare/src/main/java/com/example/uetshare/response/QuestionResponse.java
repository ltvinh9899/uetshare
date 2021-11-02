package com.example.uetshare.response;


import com.example.uetshare.entity.Account;
import com.example.uetshare.entity.Comment;
import com.example.uetshare.entity.Question;
import com.example.uetshare.response.dto.QuestionDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class QuestionResponse {

        private boolean success;
        private String message;
        private List<QuestionDto> questionDtoList;
}
