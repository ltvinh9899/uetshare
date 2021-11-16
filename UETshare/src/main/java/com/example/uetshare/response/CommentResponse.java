package com.example.uetshare.response;

import com.example.uetshare.response.dto.CommentDto;
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
public class CommentResponse extends Response{

    private List<CommentDto> commentDtoList;

}
