@FunctionalInterface
interface MethodReference {
    void arithematic(int a, int b);
}


public class Answer3 {
    void add(int a, int b){
        System.out.println(a+b);
    }
    
    void subtract(int a, int b){
        System.out.println(a-b);
    }
    
    static void multiply(int a, int b){
        System.out.println(a*b);
    }
    
    public static void main(String[] args) {
        MethodReference methodReference = new Answer3()::add;
        methodReference.arithematic(10,20);
        methodReference = new Answer3()::subtract;
        methodReference.arithematic(100,50);
        methodReference = Answer3::multiply;
        methodReference.arithematic(5,5);
    }
}
