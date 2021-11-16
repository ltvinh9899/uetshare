package com.example.uetshare.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table
public class Question extends Base{

    @Column
    private String content;

    @Column
    private String title;

    @Column
    private String image;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    private Account account;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_content_id")
    private TypeContent type_content;

    @OneToMany(mappedBy = "question", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Comment> comment;

    @ManyToMany
    @JoinTable(name = "category_question",
            joinColumns = @JoinColumn(name = "question_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
//    private List<Category> category = new ArrayList<>();
    private List<Category> category;
//    private List<Category> category = new ArrayList<>();

    @OneToMany(mappedBy = "question",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<ReactIcon> reactIcon;
}
