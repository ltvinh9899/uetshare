package com.example.uetshare.response.dto;

import com.example.uetshare.entity.Account;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Getter
@Setter
@NoArgsConstructor
public class UserProfileDto {
    private Long id;
    private String fullname;
    private String mssv;
    private String department;
    private String email;
    private String avatar;
}
