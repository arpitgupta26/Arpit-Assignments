package com.company;

public class Question3A {
    public static void main(String[] args) {
        try {
            //ClassNotFoundException
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
