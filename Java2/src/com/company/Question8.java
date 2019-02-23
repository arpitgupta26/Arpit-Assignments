package com.company;

import java.util.Scanner;

public class Question8 {

    public void checkWhile()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String word = scanner.next();
        while (!word.equals("done"))
        {
            if(word.charAt(0) == word.charAt(word.length()-1))
                System.out.println("First and the last character are equals for :" + word);
            else
                System.out.println("First and the last character are not equals for :" + word);
            word=scanner.next();
        }
    }

    public void checkDoWhile()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String word = scanner.next();
        do
        {
            if(word.charAt(0) == word.charAt(word.length()-1))
                System.out.println("First and the last character are equals for :" + word);
            else
                System.out.println("First and the last character are not equals for :" + word);
            word=scanner.next();
        }while (!word.equals("done"));
    }

    public static void main(String[] args) {
        Question8 question8=new Question8();
        question8.checkWhile();
        question8.checkDoWhile();
    }
}
