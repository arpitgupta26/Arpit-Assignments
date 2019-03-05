class A {
    static int a = 10;
}

class B extends A {
    static {
        a = 20;
        System.out.println("hello");
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println(B.a);
    }
}
