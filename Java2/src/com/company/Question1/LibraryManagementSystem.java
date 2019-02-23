package com.company.Question1;

import java.util.ArrayList;
public class LibraryManagementSystem
{
    public static void main(String[] args)
    {
        Library myLibrary = new Library();
        myLibrary.setLibraryLocation("Karkarduma");
        myLibrary.setOpeningTimeOfLibrary("7 AM");
        myLibrary.setClosingTimeOfLibrary("7 PM");
        Book b1 = new Book("Head First Java", "Eric S", 500.0d);
        Book b3 = new Book("Head First Design Patterns", "Donald Y", 800.0d);
        Book b2 = new Book("Head First HTML5 Programming", "David P", 400.0d);
        Book b4 = new Book("Head First HTML & CSS", "Henry T", 200.0d);

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        myLibrary.setBooksInLibrary(bookList);

        Librarian librarian = new Librarian("Prateek Nagar", 3003);
        myLibrary.setLibrarian(librarian);

        Member m1 = new Member("Lohit", 3001);
        Member m2 = new Member("Gagan Khuswah", 3002);
        Member m3 = new Member("Arpit Gupta", 3003);

        ArrayList<Member> memberList = new ArrayList<>();
        memberList.add(m1);
        memberList.add(m2);
        memberList.add(m3);
        myLibrary.setMembersOfLibrary(memberList);
        myLibrary.getLibraryDetails();
    }
}
