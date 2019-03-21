package com.ttn.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer Id;
    
    @Column(name = "First_Name")
    String firstName;
    
    @Transient
    @Column(name = "Last_Name")
    String lastName;
    
    @Column(name = "Age")
    int age;
    
    @Column(name = "Date_of_Birth")
    @Temporal(TemporalType.DATE)
    Date dob;
    
    @Embedded
    Address address;
    
    @ElementCollection
    List<String> subjects = new LinkedList<>();
    
    @ManyToMany(mappedBy = "author")
//    @JoinColumn(name = "author_join_book")
//    @JoinTable(joinColumns = @JoinColumn(name = "author_id"),
//            inverseJoinColumns = @JoinColumn(name = "book_id"))
    List<Book> book = new LinkedList<>();
    
    public int getId() {
        return Id;
    }
    
    public void setId(int id) {
        Id = id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public Date getDob() {
        return dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }
    
    public Address getAddress() {
        return address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    
    public List<String> getSubjects() {
        return subjects;
    }
    
    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
    
    public List<Book> getBook() {
        return book;
    }
    
    public void setBook(List<Book> book) {
        this.book = book;
    }
    
    @Override
    public String toString() {
        return "Author{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", address=" + address +
                '}';
    }
}
