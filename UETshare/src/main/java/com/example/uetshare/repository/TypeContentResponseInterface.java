package com.example.uetshare.repository;

import com.example.uetshare.entity.TypeContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeContentResponseInterface extends JpaRepository<TypeContent, Integer> {
}
