interface Demo{
    default void display(){
        System.out.println("Interface display method");
    }
}

public class Answer7 implements Demo {
    public void display(){
        System.out.println("Class display method");
    }
    public static void main(String[] args) {
        Answer7 obj = new Answer7();
        obj.display();
    }
}
