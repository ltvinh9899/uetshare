package com.example.uetshare.response;

import com.example.uetshare.response.dto.SubCommentDto;
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
public class SubCommentResponse extends Response{

    private List<SubCommentDto> subCommentDtoList;

}
