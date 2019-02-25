import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    Double score;
    Double age;
    
    public Student(String name, Double score, Double age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }
    
}

class ScoreComparator implements Comparator<Student>{
    
    public int compare(Student o1, Student o2) {
        if(o1.score == o2.score){
            int result = o1.name.compareToIgnoreCase(o2.name);
            if(result > 1){
                return 1;
            }
            else {
                return -1;
            }
        }
        else if(o1.score > o2.score){
            return 1;
        }
        else {
            return -1;
        }
    }
}


public class Answer5 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Arpit",85.5d,24d));
        list.add(new Student("Gagan",82.45d,24d));
        list.add(new Student("Prateek",82.45d,24d));
        list.add(new Student("Lohit",74.23d,24d));
        list.add(new Student("Aditya",78.9d,24d));
        Collections.sort(list,new ScoreComparator());
    
        for (Student st:list) {
            System.out.println("Name :" + st.name +" Score: "+ st.score +" Age: "+ st.age);
        }
        
    }
}
