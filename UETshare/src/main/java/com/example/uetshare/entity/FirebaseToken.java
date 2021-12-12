package com.example.uetshare.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "firebase_token")
public class FirebaseToken extends Base {
    @Column
    private String token;
    @Column
    private String user;

    public FirebaseToken(String token, String user) {
        this.token = token;
        this.user = user;
    }
}
