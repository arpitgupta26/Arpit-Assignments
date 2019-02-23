package com.company;

class Singleton
{
    private static Singleton singleton=null;
    int a;
    private Singleton()
    {
        a=0;
    }

    public static Singleton getInstance()
    {
        if(singleton == null)
            singleton=new Singleton();
        return singleton;
    }
}
public class Question4 {
    public static void main(String[] args) {
        //Intializing object 1
        Singleton object1=Singleton.getInstance();
        //Intializing object 2
        Singleton object2=Singleton.getInstance();

        System.out.println("Singleton 1 "+ object1.a);
        System.out.println("Singleton 2 "+ object2.a);

    }
}
