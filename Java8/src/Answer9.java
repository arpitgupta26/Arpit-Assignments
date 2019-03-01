import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Answer9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9,8,7,6,5,4,3,2,1);
        System.out.println(list);
        System.out.println(list.stream().filter(e -> e%2 == 0).collect(Collectors.toList()));
    }
}
