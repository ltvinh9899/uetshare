package com.example.uetshare.repository;

import com.example.uetshare.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile,Long> {
    public UserProfile getByUsername(String username);
    @Modifying
    @Transactional
    @Query(value = "update user_profile set avatar = ?2 where id=?1",nativeQuery = true)
    public void updateAvatar(Long id, String avatar);
}
