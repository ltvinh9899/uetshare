package com.example.uetshare.repository;

import com.example.uetshare.entity.PersistentLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersistentLoginsRepository extends JpaRepository<PersistentLogin,String> {
    @Query(value = "select username from persistent_logins where series = ?1",nativeQuery = true)
    public String getUsernameBySeries(String series);
}
