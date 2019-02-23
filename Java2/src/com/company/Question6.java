package com.company;

public class Question6 {

    public void tryCatch()
    {
        try {
            int error=1/0;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Caught");
        }
        catch (Exception e) {
            System.out.println("Exception Caught");
        }
        finally {
            System.out.println("Finally Block");
        }
    }
    public static void main(String[] args) {
        Question6 question6=new Question6();
        question6.tryCatch();
    }
}
