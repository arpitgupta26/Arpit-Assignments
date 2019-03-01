interface ParentInterface{
    default void display(){
        System.out.println("Parent Interface display method");
    }
}

interface Child1Interface extends ParentInterface{
    default void display(){
        System.out.println("Child 1 Interface display method");
    }
}

interface Child2Interface extends ParentInterface{
    default void display(){
        System.out.println("Child 2 Interface display method");
    }
}

public class Answer8 implements Child1Interface, Child2Interface{
    public void display(){
        System.out.println("Class display method");
    }
    
    public static void main(String[] args) {
        Answer8 obj = new Answer8();
        obj.display();
    }
}
