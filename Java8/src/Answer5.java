import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Answer5 {
    public static void display(String name){
        System.out.println(name);
    }
     public static Integer incrementValue(){
        return 5+6;
     }
     
     public static boolean isGreater(int number1){
        return number1>5;
     }
     
     public static int addTen(int number1){
         return number1 + 10;
     }
    
    
    public static void main(String[] args) {
        Consumer<String> consumer = Answer5::display;
        consumer.accept("Arpit");
    
        Supplier<Integer> supplier = Answer5::incrementValue;
        System.out.println(supplier.get());
    
        Predicate<Integer> predicate = Answer5::isGreater;
        System.out.println(predicate.test(4));
    
        Function<Integer,Integer> function = Answer5::addTen;
        System.out.println(function.apply(20));
        
        
    }
}
