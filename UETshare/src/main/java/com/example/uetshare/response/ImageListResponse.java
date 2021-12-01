package com.example.uetshare.response;

import com.example.uetshare.response.dto.AccountDto;
import com.example.uetshare.response.dto.ImageDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ImageListResponse {
    private boolean success;
    private String message;
    private List<ImageDto> imageDtos;
}
