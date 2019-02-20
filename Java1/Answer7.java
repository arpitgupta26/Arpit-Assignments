public class Answer7 {
    static String firstName = "Arpit";
    static String lastName = "Gupta";
    static int age = 24;
    
    static{
        System.out.println("Inside static block");
        System.out.println(firstName + " " + lastName + " " + age);
    }
    
    static void show(){
        System.out.println("Inside static method");
        System.out.println(firstName + " " + lastName + " " + age);
    }
    
    public static void main(String[] args) {
        Answer7.show();
    }
}
