package com.company;

//NoClassDefFound error
class ParentClass
{
    void display()
    {
        System.out.println("In Parent Class");
    }
}

public class Question3B {
    public static void main(String[] args) {
        //the program will run smoothly but if the upper parent class did not existed it will give NoClassDefFoundError
        ParentClass parentClass=new ParentClass();
        parentClass.display();
    }
}
