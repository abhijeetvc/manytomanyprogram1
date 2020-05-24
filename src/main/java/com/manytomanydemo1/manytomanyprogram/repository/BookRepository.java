package com.manytomanydemo1.manytomanyprogram.repository;

import com.manytomanydemo1.manytomanyprogram.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends
        JpaRepository<Book,Integer> {

    
}
