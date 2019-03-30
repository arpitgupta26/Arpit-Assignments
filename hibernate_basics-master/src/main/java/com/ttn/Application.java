package com.ttn;

import com.ttn.entity.Address;
import com.ttn.entity.Author;
import com.ttn.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Application {
    
    public static void main(String[] args) {
//        Author author = new Author();
//        Author author2 = new Author();
//        author.setId(1);
//        author.setFirstName("Arpit");
//        author.setLastName("Gupta");
//        author.setAge(24);
//        author.setDob(new Date());
//        author2.setId(2);
//        author2.setFirstName("Gagan");
//        author2.setLastName("Kushwaha");
//        author2.setAge(25);
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        //Create
//        session.save(author);
//        session.save(author2);
//        session.getTransaction().commit();
//        session.beginTransaction();
//        //Read
//        System.out.println(session.get(Author.class,1));
//        author.setAge(25);
//        //Update
//        session.update(author);
//        Author author1 = session.get(Author.class,2);
        //Delete
//        session.delete(author1);
//        sessionFactory.close();
//        session.getTransaction().commit();
        List<String> subjects = Arrays.asList("Java","Spring","Hibernate");
        Author author3 = new Author();
        author3.setFirstName("Aditya");
        author3.setLastName("Arora");
        author3.setSubjects(subjects);
        Book book = new Book();
        Book book2 = new Book();
        book.setBookName("Black Book");
        book.getAuthor().add(author3);
        book2.setBookName("Head First");
        book2.getAuthor().add(author3);
        author3.getBook().add(book);
        author3.getBook().add(book2);
        author3.setAge(24);
        Address address = new Address();
        address.setStreetNumber(2);
        address.setLocation("Pitampura");
        address.setState("Delhi");
        author3.setAddress(address);
        session.beginTransaction();
        session.save(author3);
        session.save(book);
        session.save(book2);
        session.getTransaction().commit();
        author3.setFirstName("Arpit");
        session.save(author3);
    }
}
