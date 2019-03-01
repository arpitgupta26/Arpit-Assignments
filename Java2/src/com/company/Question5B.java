package com.company;

class CopyConstructor
{
    int a;
    
    CopyConstructor(int a)
    {
        this.a=a;
    }
    
    CopyConstructor(CopyConstructor obj)
    {
        a=obj.a;
    }
}
public class Question5B {
    public static void main(String[] args) {
        CopyConstructor obj1=new CopyConstructor(9);
        CopyConstructor obj2=new CopyConstructor(obj1);
        System.out.println("Value of instance variable in the other object "+obj2.a);
    }
}
