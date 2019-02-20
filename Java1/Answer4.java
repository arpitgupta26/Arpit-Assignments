import java.util.Scanner;

public class Answer4 {
    
    private int upperCase, lowerCase, special, digit=0;
    
    public void calculate(String str){
        int length = str.length();
        char arr[]= str.toCharArray();
        for (int i = 0; i <arr.length ; i++) {
            if(Character.isUpperCase(arr[i]))
                upperCase++;
            else if(Character.isLowerCase(arr[i]))
                lowerCase++;
            else if(Character.isDigit(arr[i]))
                digit++;
            else
                special++;
        }
        System.out.println("Total UpperCase characters are: "+ upperCase);
        System.out.println("Percentage of occurrence is: "+ (upperCase*100)/length +"%");
        System.out.println("Total LowerCase characters are: "+ lowerCase);
        System.out.println("Percentage of occurrence is: "+ (lowerCase*100)/length +"%");
        System.out.println("Total digits are: "+ digit);
        System.out.println("Percentage of occurrence is: "+ (digit*100)/length +"%");
        System.out.println("Total Special characters letters are: "+ special);
        System.out.println("Percentage of occurrence is: "+ (special*100)/length +"%");
    }
    
    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the pattern");
        str = input.next();
        Answer4 obj = new Answer4();
        obj.calculate(str);
    }
}
