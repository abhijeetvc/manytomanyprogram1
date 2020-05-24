package com.manytomanydemo1.manytomanyprogram.controller;

import com.manytomanydemo1.manytomanyprogram.domain.Book;
import com.manytomanydemo1.manytomanyprogram.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping(value="/save")
    public String saveBook(@RequestBody Book book){
        bookRepository.save(book);
        return "Book Saved";
    }
}
