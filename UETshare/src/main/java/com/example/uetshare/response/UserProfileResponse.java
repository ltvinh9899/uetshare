package com.example.uetshare.response;

import com.example.uetshare.response.dto.UserProfileDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserProfileResponse{
    private boolean success;
    private String message;
    private UserProfileDto userProfileDto;
}
