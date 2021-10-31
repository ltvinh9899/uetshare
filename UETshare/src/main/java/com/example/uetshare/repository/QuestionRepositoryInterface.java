package com.example.uetshare.repository;

import com.example.uetshare.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepositoryInterface extends JpaRepository<Question, Integer> {

}
