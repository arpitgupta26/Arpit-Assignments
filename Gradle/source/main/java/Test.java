import org.apache.commons.lang3.StringUtils;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String name = new String("Arpit");
        System.out.println(name);
        String rev = StringUtils.reverse(name);
        System.out.println(rev);
    }
}
