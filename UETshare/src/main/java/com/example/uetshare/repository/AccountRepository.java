package com.example.uetshare.repository;

import com.example.uetshare.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
    public Account getAccountByUsername(String username);
}