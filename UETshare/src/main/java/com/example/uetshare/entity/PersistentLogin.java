package com.example.uetshare.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "persistent_logins")
public class PersistentLogin extends Base{
    @Column(name = "series", nullable = false)
    private String series;
    @Column(name = "username",nullable = false)
    private String username;
    @Column(name = "token",nullable = false)
    private String token;
    @Column(name = "last_used",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUsed;
}
