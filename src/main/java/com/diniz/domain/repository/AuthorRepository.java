package com.diniz.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diniz.domain.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{

}
