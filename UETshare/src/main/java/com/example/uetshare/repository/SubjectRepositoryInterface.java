package com.example.uetshare.repository;

import com.example.uetshare.entity.Category;
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

    @Query(value = "select * from subject order by subject.time desc limit ?1, 10", nativeQuery = true)
    List<Subject> getAllSubject(Integer index);

    @Query(value = "select * from subject " +
            "inner join category on subject.category_id = category.id " +
            "where (subject.subject_name like ?2 or category.category like ?2) order by subject.time desc limit ?1, 10 ", nativeQuery = true)
    List<Subject> getSubjectByText(Integer index, String text);

    @Query(value = "select * from subject where subject.id = ?1", nativeQuery = true)
    Subject getSubjectById(Long id);

    @Query(value = "select count(*) from subject", nativeQuery = true)
    Integer totalSubject();

    @Query(value = "select " +
            "(select count(*) from subject " +
            "inner join category on subject.category_id = category.id " +
            "where (subject.subject_name like ?1 or category.category like ?1)) " +
            "as \"count\" from subject limit 1", nativeQuery = true)
    Integer totalSearchSubject(String text);

    @Query(value = "select * from subject inner join exam_document ed on subject.id = ed.subject_id where subject.id = 1 limit 1", nativeQuery = true)
    Subject getSubjectUsed(Long id);

    @Modifying
    @Transactional
    @Query(value = "delete from subject where subject.id = ?1", nativeQuery = true)
    void deleteBySubjectId(Long id);

}
