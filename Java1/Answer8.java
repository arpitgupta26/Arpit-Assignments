import java.util.SortedMap;

public class Answer8 {
    StringBuffer str =new StringBuffer("Hello welcome to java class");
    StringBuffer reversedStr= new StringBuffer("");
    void reverse(){
        System.out.println(str);
        System.out.println("After reversing");
        for (int i = str.length()-1; i >-1 ; i--) {
            reversedStr.append(str.charAt(i));
        }
        System.out.println(reversedStr);
        reversedStr.delete(4, 10);
        System.out.println("After deleting characters from index 4 to 9");
        System.out.println(reversedStr);
    }
    StringBuffer str2 = new StringBuffer(reversedStr);
    
    public static void main(String[] args) {
        Answer8 obj = new Answer8();
        obj.reverse();
    }
}
