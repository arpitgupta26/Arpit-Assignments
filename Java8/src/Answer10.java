import java.util.Arrays;
import java.util.List;

public class Answer10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,10,20,3,5,30,2);
        System.out.println(list);
        System.out.println(list.stream().filter(e -> e > 5).reduce(0,(x,y)->x+y));
    }
}
