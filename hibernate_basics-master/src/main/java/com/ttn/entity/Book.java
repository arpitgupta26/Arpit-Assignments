package com.ttn.entity;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer Id;
    
    @Column(name = "Book_Name")
    String bookName;
    
    @ManyToMany
    List<Author> author = new LinkedList<>();
    
    public Integer getId() {
        return Id;
    }
    
    public void setId(Integer id) {
        Id = id;
    }
    
    public String getBookName() {
        return bookName;
    }
    
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    
    public List<Author> getAuthor() {
        return author;
    }
    
    public void setAuthor(List<Author> author) {
        this.author = author;
    }
    
    @Override
    public String toString() {
        return "Book{" +
                "Id=" + Id +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
