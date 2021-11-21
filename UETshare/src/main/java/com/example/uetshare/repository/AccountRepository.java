package com.example.uetshare.repository;

import com.example.uetshare.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
    @Query(value = "select * from account where username= ?1",nativeQuery = true)
    public Account getAccountByUsername(String username);
//    @Query(value = "select * from account a inner join ",nativeQuery = true)
//    public Account getAccountAndRole(String username);

    @Query(value = "select * from account where (username like ?2) limit 0, ?1", nativeQuery = true)
    List<Account> getAccountByText(Integer index, String text);
}