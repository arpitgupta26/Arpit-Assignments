package com.company;

import java.util.Scanner;

public class Question7 {
    long days,hours,minutes,seconds;
    public void secondsToDays(long second)
    {
        System.out.println("Conversion of "+second+" seconds is as follows");

        //calculating number of days
        days=second / (24*3600);

        //calculating number of hours
        second=second % (24*3600);
        hours=second / (3600);

        //calculating number of minutes
        second=second % 3600;
        minutes=second / 60;

        //calculating number of seconds
        second=second%60;
        seconds=second;

        System.out.println("Days "+days);
        System.out.println("Hours "+hours);
        System.out.println("Minutes "+minutes);
        System.out.println("Seconds "+seconds);
    }

    public static void main(String[] args) {
        Question7 obj=new Question7();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the time in seconds");
        long time=scanner.nextLong();
        obj.secondsToDays(time);
    }
}
