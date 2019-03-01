import java.util.Arrays;
import java.util.List;

public class Answer12 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5,6,7);
        System.out.println(list);
        System.out.println(list.stream().filter(number->number>3).filter(number->number%2==0).findFirst());
    }
}
