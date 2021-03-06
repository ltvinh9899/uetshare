package com.example.uetshare.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class SubComment extends Base{

    @Column
    private String content;

    @Column
    private String image;

    @ManyToOne(fetch = FetchType.LAZY)
    private Comment comment;

}
