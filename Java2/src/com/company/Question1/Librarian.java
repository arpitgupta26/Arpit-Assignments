package com.company.Question1;

class Librarian implements User
{
    private String librarianName;
    private int librarianID;

    Librarian(String name, int id)
    {
        this.librarianName = name;
        this.librarianID = id;
    }
    
    public void getUser()
    {
        System.out.println("Name of the librarian " + librarianName);
        System.out.println("ID of the librarian " + librarianID);
    }
}