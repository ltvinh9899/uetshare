package com.example.uetshare.repository;

import com.example.uetshare.entity.AccountRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AccountRoleRepository extends JpaRepository<AccountRole,Long> {
    @Transactional
    @Modifying
    @Query(value = "insert into account_role(account_id,role_id) values (?1,1)",nativeQuery = true)
    public void insertRole(Long accountId);
}
