package com.example.uetshare.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "account_role")
public class AccountRole extends Base {
    @ManyToOne
    private Account account;
    @ManyToOne(fetch = FetchType.EAGER)
    private Role role;
}
