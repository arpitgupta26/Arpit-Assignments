import java.util.LinkedList;
import java.util.List;

interface Component{
    void show();
}

class Leaf implements Component{
    String name;
    int id;
    
    public Leaf(int id, String name) {
        this.name = name;
        this.id = id;
    }
    
    @Override
    public void show() {
            System.out.println("ID: "+ id + " Name: " + name);
    }
}

class Composite implements Component{
    String name;
    List<Component> components = new LinkedList<>();
    
    public Composite(String name) {
        this.name = name;
    }
    
    void add (Component component ){
        components.add(component);
    }
    @Override
    public void show() {
        System.out.println(name);
        for (Component component:components) {
            component.show();
        }
    }
}



public class Answer7 {
    public static void main(String[] args) {
        Composite office = new Composite("Office");
        Composite java = new Composite("JAVA");
        java.add(new Leaf(1,"Arpit"));
        java.add(new Leaf(2,"Gagan"));
        java.add(new Leaf(3,"Prateek"));
        Composite python = new Composite("Python");
        python.add(new Leaf(1,"Aditya"));
        python.add(new Leaf(2,"Lohit"));
        Composite feen = new Composite("FEEN");
        feen.add(new Leaf(1,"Vagish"));
        feen.add(new Leaf(1,"Nitin"));
        office.add(java);
        office.add(python);
        office.add(feen);
        java.show();
    }
}
