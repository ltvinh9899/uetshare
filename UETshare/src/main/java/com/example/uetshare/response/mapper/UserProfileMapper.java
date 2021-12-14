package com.example.uetshare.response.mapper;

import com.example.uetshare.entity.UserProfile;
import com.example.uetshare.response.dto.UserProfileDto;

public class UserProfileMapper {
    public static UserProfileDto toUserProfileDto(UserProfile userProfile){
        UserProfileDto userProfileDto = new UserProfileDto();
        userProfileDto.setDepartment(userProfile.getDepartment());
        userProfileDto.setEmail(userProfile.getEmail());
        userProfileDto.setFullname(userProfile.getFullname());
        userProfileDto.setMssv(userProfile.getMssv());
        return userProfileDto;
    }
    public static UserProfile toUserProfile(UserProfileDto userProfileDto){
        UserProfile userProfile = new UserProfile();
        userProfile.setId(userProfileDto.getId());
        userProfile.setDepartment(userProfileDto.getDepartment());
        userProfile.setEmail(userProfileDto.getEmail());
        userProfile.setFullname(userProfileDto.getFullname());
        userProfile.setMssv(userProfileDto.getMssv());
        return userProfile;
    }
}