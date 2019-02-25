import java.util.HashSet;
import java.util.Set;

public class Answer2 {
    
    public static void main(String[] args) {
        String str = "Arpit Gupta MCA To The New";
        char arr[]=str.toCharArray();
        Set<Character> unique = new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            unique.add(arr[i]);
        }
        System.out.println("Unique characters are : ");
        System.out.println(unique);
    }
}
