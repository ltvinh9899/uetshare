package com.example.uetshare.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table
public class TypeContent extends Base{

    @Column
    private String type_content;

    @OneToMany(mappedBy = "type_content",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Question> question;

}
