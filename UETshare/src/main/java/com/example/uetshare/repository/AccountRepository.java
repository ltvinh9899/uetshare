package com.example.uetshare.repository;

import com.example.uetshare.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
    @Query(value = "select * from account where username= ?1",nativeQuery = true)
    public Account getAccountByUsername(String username);
    @Query(value = "select * from account where id= ?1",nativeQuery = true)
    public Account getAccountById(Long id);
//    @Query(value = "select * from account a inner join ",nativeQuery = true)
//    public Account getAccountAndRole(String username);

    @Query(value = "select * from account where (username like ?2) limit 0, ?1", nativeQuery = true)
    List<Account> getAccountByText(Integer index, String text);
    @Modifying
    @Transactional
    @Query(value = "update account set password = ?2 where username = ?1", nativeQuery = true)
    public void changePassword(String username, String password);
//    @Modifying
//    @Transactional
//    @Query(value = "update account set avatar = ?2 where username = ?1", nativeQuery = true)
//    public void updateAvatar(String username, String avatarPath);
    @Modifying
    @Transactional
    @Query(value = "update account set avatar = ?2 where id=?1",nativeQuery = true)
    public void updateAvatar(Long id, String avatar);
}