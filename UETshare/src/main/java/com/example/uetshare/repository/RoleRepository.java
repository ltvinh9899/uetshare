package com.example.uetshare.repository;

import com.example.uetshare.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role,Long> {
    @Query(value = "SELECT role.role_name FROM account inner join account_role inner join role where account.id =account_role.account_id and account_role.role_id=role.id and account.username = ?1",nativeQuery = true)
    public List<String> getRoleNames(String username);
}
