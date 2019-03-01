package com.company;

import java.util.Scanner;

public class Question2 {

    public void sortStringCharacters(String inputString) {
        String temp = inputString.toLowerCase();
        //converting input string to character array
        char character[] = temp.toCharArray();
        //using bubble sort to arrange the character in the array
        for (int i = 0; i < character.length-1; i++) {
            for (int j = 0; j < character.length - i - 1; j++) {
                if (character[j] > character[j + 1]) {
                    char tempvariable = character[j];
                    character[j] = character[j + 1];
                    character[j + 1] = tempvariable;
                }
            }
        }

        //removing whitespaces for the character array
        temp=new String(character).trim();

        //character array without whitespaces
        character=temp.toCharArray();
        System.out.println("Sorted characters of a string");
        for (int i = 0; i < character.length; i++) {
            System.out.print(character[i]);
        }
    }

    public static void main(String[] args) {
      
        Question2 question2 = new Question2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to be sorted");
        String inputString = scanner.nextLine();
        question2.sortStringCharacters(inputString);
    }
}
