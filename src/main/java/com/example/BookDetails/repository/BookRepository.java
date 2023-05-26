package com.example.BookDetails.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.BookDetails.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
    
}
