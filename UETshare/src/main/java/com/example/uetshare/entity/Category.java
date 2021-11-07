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
public class Category extends Base{

    @Column
    private String category;

    @ManyToMany(mappedBy = "category")
    private List<Question> questions;
//    private List<Question> question = new ArrayList<>();

}
