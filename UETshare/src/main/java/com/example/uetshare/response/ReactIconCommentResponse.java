package com.example.uetshare.response;

import com.example.uetshare.response.dto.ReactIconCommentDto;
import com.example.uetshare.response.dto.ReactIconQuestionDto;
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
public class ReactIconCommentResponse extends Response{

    private List<ReactIconCommentDto> reactIconCommentDtoList;

}
