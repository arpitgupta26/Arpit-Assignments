@FunctionalInterface
interface Sum{
    int add(int a, int b);
}


public class Answer2 {
    public static void main(String[] args) {
        Sum sum = (a,b)-> a+b;
        
        System.out.println(sum.add(3,5));
    }
}
