@FunctionalInterface
interface Greater{
    boolean isGreater(int a, int b);
}

@FunctionalInterface
interface Increase{
    int increment(int a);
}

@FunctionalInterface
interface Concatination{
    String concate(String str1, String s2);
}

@FunctionalInterface
interface UpperCare{
    String toUpper(String s1);
}


public class Answer1 {
    
    public static void main(String[] args) {
        Greater greater = (a, b) -> a > b;
        
        System.out.println(greater.isGreater(5, 3));
        
        Increase increase = a -> ++a;
        
        System.out.println(increase.increment(3));
        
        Concatination concatination = (str1, str2) -> str1.concat(str2);
        
        System.out.println(concatination.concate("Arp", "it"));
        
        UpperCare upperCare = s1 -> s1.toUpperCase();
        
        System.out.println(upperCare.toUpper("arpit"));
    }
}
