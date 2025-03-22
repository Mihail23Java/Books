package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/books")
public class Controller_book {
    
    @Autowired
    public BookRepository bookRepository;


    
    @GetMapping
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Book> getBook(@PathVariable Integer id) {
        return bookRepository.findById(id);
    }



    @PostMapping
    public Book createBook(@RequestBody Book book){
        return bookRepository.save(book);
    }


    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Integer id){
        bookRepository.deleteById(id);
    }
    
    



}
