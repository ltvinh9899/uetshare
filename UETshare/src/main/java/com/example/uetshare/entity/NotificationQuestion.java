package com.example.uetshare.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class NotificationQuestion extends Base{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;

    @Column(length = 30)
    private String username;

    @Enumerated(EnumType.STRING)
    @Column
    private ActionType action_type;

    @Column
    private String avatar;

    @Column
    private Boolean seen;

}