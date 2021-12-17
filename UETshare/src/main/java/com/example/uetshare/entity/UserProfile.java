package com.example.uetshare.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class UserProfile extends Base {
    @Column
    private String username;
    @Column
    private String fullname;
    @Column
    private String mssv;
    @Column
    private String department;
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "userProfile")
//    @JsonBackReference(value = "account-userProfile")
    private Account account;
    @Column
    private String email;
}
