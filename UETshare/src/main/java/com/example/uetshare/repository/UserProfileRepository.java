package com.example.uetshare.repository;

import com.example.uetshare.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile,Long> {
    public UserProfile getByUsername(String username);
    @Query(value = "update user_profile set fullname = ?2 where id=?1",nativeQuery = true)
    public void updateFullname(String id, String fullname);
    @Query(value = "update user_profile set email = ?2 where id=?1",nativeQuery = true)
    public void updateEmail(String id, String fullname);
    @Query(value = "update user_profile set department = ?2 where id=?1",nativeQuery = true)
    public void updateDepartment(String id, String fullname);
}
