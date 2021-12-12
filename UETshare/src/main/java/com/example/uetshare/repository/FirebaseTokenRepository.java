package com.example.uetshare.repository;

import com.example.uetshare.entity.Account;
import com.example.uetshare.entity.Comment;
import com.example.uetshare.entity.FirebaseToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FirebaseTokenRepository extends JpaRepository<FirebaseToken, Integer> {
    @Query(value = "select * from firebase_token where firebase_token.user = :user", nativeQuery = true)
    public List<FirebaseToken> getTokensByUser(@Param("user") String user);
}
