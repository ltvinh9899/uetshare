package com.example.uetshare.repository;

import com.example.uetshare.entity.Category;
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

    @Query(value = "select * from exam_document where exam_document.subject_id = ?1 and exam_document.exam_document_type = ?2 order by exam_document.time desc limit 0, ?3", nativeQuery = true)
    List<ExamDocument> getExamDocumentBySubjectIdAndType(Long subject_id, String type, Integer index);

    @Query(value = "select * from exam_document where exam_document.exam_document_type = ?1 order by exam_document.time desc limit ?2, 10", nativeQuery = true)
    List<ExamDocument> getExamDocumentByType(String type, Integer index);

    @Query(value = "select * from exam_document where exam_document.id = ?1", nativeQuery = true)
    ExamDocument getExamDocumentById(Long id);

    @Query(value = "select * from exam_document" +
            " inner join subject on exam_document.subject_id = subject.id" +
            " where (exam_document.name like ?2 or subject.subject_name like ?2)" +
            " order by exam_document.time desc limit ?1, 10", nativeQuery = true)
    List<ExamDocument> getExamDocumentByText(Integer index, String text);

    @Query(value = "select * from exam_document" +
            " inner join subject on exam_document.subject_id = subject.id" +
            " where ((exam_document.name like ?3 or subject.subject_name like ?3) and exam_document.exam_document_type = ?1) " +
            " order by exam_document.time desc limit ?2, 10", nativeQuery = true)
    List<ExamDocument> getExamDocumentByTextAndType(String type, Integer index, String text);

    @Query(value = "select count(*) from exam_document", nativeQuery = true)
    Integer totalExamDocument();

    @Modifying
    @Transactional
    @Query(value = "delete from exam_document where exam_document.id = ?1", nativeQuery = true)
    void deleteByExamDocumentId(Long id);
}
