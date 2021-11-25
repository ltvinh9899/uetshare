package com.example.uetshare.response;

import com.example.uetshare.response.dto.ExamDocumentDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class ExamDocumentResponse extends Response{

    private List<ExamDocumentDto> examDocumentDtoList;

}
