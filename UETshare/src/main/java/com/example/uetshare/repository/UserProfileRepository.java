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

    @Modifying
    @Transactional
    @Query(value = "update user_profile set fullname = ?2 where id=?1",nativeQuery = true)
    public void updateFullname(Long id, String fullname);


    @Modifying
    @Transactional
    @Query(value = "update user_profile set department = ?2 where id=?1",nativeQuery = true)
    public void updateDepartment(Long id, String department);

    @Modifying
    @Transactional
    @Query(value = "update user_profile set email = ?2 where id=?1",nativeQuery = true)
    public void updateEmail(Long id, String email);


    @Modifying
    @Transactional
    @Query(value = "update user_profile set mssv = ?2 where id=?1",nativeQuery = true)
    public void updateMssv(Long id, String mssv);
}
