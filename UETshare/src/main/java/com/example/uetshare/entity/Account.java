package com.example.uetshare.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table
public class Account extends Base{
    @Column(length = 30)
    private String username;
    @Column
    private String password;
    @Column()
    private String avatar;
    @OneToMany(mappedBy = "account",cascade = CascadeType.ALL)
    private List<AccountRole> accountRole;
    @OneToOne(fetch = FetchType.LAZY)
    private UserProfile userProfile;
    @OneToMany(mappedBy = "account",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    private List<Document> document;
//    @OneToMany(mappedBy = "account",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//    private List<Exam> exam;
//    @OneToMany(mappedBy = "account",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Question> question;
    @OneToMany(mappedBy = "account",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Comment> comment;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Account() {

    }
   @OneToMany(mappedBy = "account",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
   private List<ReactIcon> reactIcon;
}
