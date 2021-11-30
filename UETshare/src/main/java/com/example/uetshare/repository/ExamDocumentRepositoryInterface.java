package com.example.uetshare.repository;

import com.example.uetshare.entity.ExamDocument;
import com.example.uetshare.entity.ExamDocumentType;
import com.example.uetshare.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ExamDocumentRepositoryInterface extends JpaRepository<ExamDocument, Integer> {

    @Query(value = "select * from exam_document where exam_document.subject_id = ?1 and exam_document.exam_document_type = ?2 order by exam_document.id limit 0, ?3", nativeQuery = true)
    List<ExamDocument> getExamDocumentBySubjectIdAndType(Long subject_id, String type, Integer index);

    @Query(value = "select * from exam_document where exam_document.id = ?1", nativeQuery = true)
    ExamDocument getExamDocumentById(Long id);

    @Modifying
    @Transactional
    @Query(value = "delete from exam_document where exam_document.id = ?1", nativeQuery = true)
    void deleteByExamDocumentId(Long id);
}
