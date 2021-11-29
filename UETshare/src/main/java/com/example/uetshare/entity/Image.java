package com.example.uetshare.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class Image extends Base{

    @Column
    private String image;

    @ManyToOne(fetch = FetchType.LAZY)
    private Question question;

}
