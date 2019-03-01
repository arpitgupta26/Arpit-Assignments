interface DemoInterface{
    static void displayStatic(){
        System.out.println("Static method in interface");
    }
    
    default void displayDefault(){
        System.out.println("Default method in interface");
    }
}

public class Answer6 implements DemoInterface {
    public static void main(String[] args) {
        DemoInterface.displayStatic();
        Answer6 obj = new Answer6();
        obj.displayDefault();
    }
}
