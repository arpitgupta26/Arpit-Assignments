package com.company;

//Custom Exception
class CustomException extends Exception
{
    public CustomException(String message) {
        super(message);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
public class Question13 {

    void errorFunction()
    {
        try {
            throw new CustomException("Custom Exception is thrown");
        }
        catch (CustomException e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Question13 question13=new Question13();
        question13.errorFunction();
    }

}
