import java.util.*;

class FrequencySort implements Comparator<Custom> {
    @Override
    public int compare(Custom o1, Custom o2) {
        if (o1.frequency == o2.frequency) {
            return 0;
        } else if (o1.frequency > o2.frequency) {
            return -1;
        } else {
            return 1;
        }
    }
}

class Custom {
    Character ch;
    Integer frequency;
    
    public Custom(Character ch, Integer frequency) {
        this.ch = ch;
        this.frequency = frequency;
    }
}

public class Answer6 {
    
    public static void main(String[] args) {
        String str = "gagan";
        char arr[] = str.toCharArray();
        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap();
        for (char a : arr) {
            if (linkedHashMap.containsKey(a)) {
                linkedHashMap.put(a, linkedHashMap.get(a) + 1);
            } else {
                linkedHashMap.put(a, 1);
            }
        }
        
        List<Custom> list = new LinkedList<>();
        
        for (Map.Entry<Character, Integer> e : linkedHashMap.entrySet()) {
            list.add(new Custom(e.getKey(), e.getValue()));
        }
        Collections.sort(list, new FrequencySort());
        for (Custom result : list) {
            System.out.println(result.ch + " " + result.frequency);
        }
    }
}
