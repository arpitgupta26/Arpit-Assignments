class Student{
    private int id;
    private String name;
    private int grade;
    private int age;
    private String address;
    private double weight;
    
    public Student(int id, String name, int grade, int age, String address, double weight) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.address = address;
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", weight=" + weight +
                '}';
    }
}

class StudentBuilder{
    private int id;
    private String name;
    private int grade;
    private int age;
    private String address;
    private double weight;
    
    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }
    
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }
    
    public StudentBuilder setGrade(int grade) {
        this.grade = grade;
        return this;
    }
    
    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    
    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
    
    public StudentBuilder setWeight(double weight) {
        this.weight = weight;
        return this;
    }
    
    public Student getStudent(){
        return new Student(id,name,grade,age,address,weight);
    }
    
}

public class Answer4 {
    
    public static void main(String[] args) {
        
        Student student = new StudentBuilder().setName("Arpit").setAge(24).setId(3213)
                .setAddress("Delhi").getStudent();
        System.out.println(student);
    }
}
