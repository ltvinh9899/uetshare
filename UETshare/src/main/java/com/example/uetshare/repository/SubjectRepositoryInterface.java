package com.example.uetshare.repository;

import com.example.uetshare.entity.Question;
import com.example.uetshare.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface SubjectRepositoryInterface extends JpaRepository<Subject, Integer> {

    @Query(value = "select * from subject where subject.category_id = ?1 limit 0, ?2", nativeQuery = true)
    List<Subject> getAllSubjectByCategoryId(Long category_id, Integer index);

    @Query(value = "select * from subject order by subject.id desc limit ?1, 10", nativeQuery = true)
    List<Subject> getAllSubject(Integer index);

    @Query(value = "select * from subject where subject.id = ?1", nativeQuery = true)
    Subject getSubjectById(Long id);

    @Modifying
    @Transactional
    @Query(value = "delete from subject where subject.id = ?1", nativeQuery = true)
    void deleteBySubjectId(Long id);

}
