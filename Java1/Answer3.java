import java.util.Scanner;

public class Answer3 {
    
    String str ="Arpit Gupta";
    void count(char search){
        int occurence = str.split(String.valueOf(search),-1).length-1;
        System.out.println("Number of occurrence of " + search + " is " + occurence);
        
    }
    
    public static void main(String[] args) {
        char a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character to count");
        a = input.next().charAt(0);
        Answer3 obj = new Answer3();
        obj.count(a);
    }
}
