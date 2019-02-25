import java.util.LinkedHashMap;
import java.util.Map;

public class Answer3 {
    
    void countOccurence(String str){
        char arr[] = str.toCharArray();
        LinkedHashMap<Character,Integer> linkedHashMap = new LinkedHashMap();
        for (char a : arr) {
            if(linkedHashMap.containsKey(a)){
                linkedHashMap.put(a, linkedHashMap.get(a)+1);
            }
            else {
                linkedHashMap.put(a, 1);
            }
        }
        for (Map.Entry<Character,Integer> e: linkedHashMap.entrySet()) {
            System.out.println("Character " + e.getKey() + " Frequency " + e.getValue());
        }
        
    }
    
    public static void main(String[] args) {
        String str = "Hello World this To The New";
        Answer3 obj = new Answer3();
        obj.countOccurence(str);
    
    }
}
