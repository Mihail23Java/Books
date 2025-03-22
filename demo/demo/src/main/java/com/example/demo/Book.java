package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "books")
public class Book {
    
    
    @Id
    public Long id;
    public String title;
    public String author;
    @Column(name = "yearofpublication")
    public int yearOfPublication;

}
