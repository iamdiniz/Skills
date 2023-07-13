package com.diniz.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diniz.domain.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
