package com.example.uetshare.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Role extends Base{
    @Column
    private String roleName;
    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private List<AccountRole> accountRole;
}
