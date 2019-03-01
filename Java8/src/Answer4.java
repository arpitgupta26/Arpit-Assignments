@FunctionalInterface
interface ConstructorReference{
    Employee createEmployee(String name, int age, String city);
}

class Employee{
    String name;
    int age;
    String city;
    
    public Employee(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}


public class Answer4 {
    
    public static void main(String[] args) {
        ConstructorReference constructorReference = Employee::new;
        Employee employee = constructorReference.createEmployee("Arpit", 24, "Delhi");
        System.out.println(employee);
    }
}
