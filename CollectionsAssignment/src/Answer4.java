import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparator<Employee> {
    String name;
    Double age;
    Double salary;
    
    public Employee(){
    
    }
    
    public Employee(String name, Double age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.salary == o2.salary){
            return 0;
        }
        else if(o1.salary > o2.salary){
            return -1;
        }
        else {
            return 1;
        }
    }
}

public class Answer4 {
    public static void main(String[] args) {
        List<Employee> employeeList =  new ArrayList<>();
        employeeList.add(new Employee("Arpit",24d,35000d));
        employeeList.add(new Employee("Gagan",24d,15000d));
        employeeList.add(new Employee("Prateek",24d,17000d));
        employeeList.add(new Employee("Lohit",24d,12500d));
        Collections.sort(employeeList,new Employee());
        for (Employee emp:employeeList){
            System.out.println(emp.name + " " +emp.age+ " " +emp.salary);
        }
    }
    
    
}
