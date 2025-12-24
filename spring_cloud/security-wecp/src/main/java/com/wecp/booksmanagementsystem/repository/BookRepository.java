package com.wecp.booksmanagementsystem.repository;


import com.wecp.booksmanagementsystem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BookRepository extends JpaRepository<Book,Long>  {
    // extends JpaRepository
}
