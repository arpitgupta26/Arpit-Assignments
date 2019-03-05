//Implementor
interface Colours{
    String color();
}

//Concrete implementor
class Red implements Colours{
    @Override
    public String color() {
        return "Red";
    }
}

//Concrete Implementor
class Blue implements Colours{
    @Override
    public String color() {
        return "Blue";
    }
}

//Abstraction
abstract class Shape{
    String shape;
    Colours colours;
    
    public Shape(String shape, Colours colours) {
        this.shape = shape;
        this.colours = colours;
    }
}

//Refined Abstraction
class ShapeSides extends Shape{
    int totalSides;
    
    public ShapeSides(String shape, Colours colours, int totalSides) {
        super(shape, colours);
        this.totalSides = totalSides;
    }
    
    public void show(){
        System.out.println(shape+colours.color());
    }
}

public class Answer5 {
    
    public static void main(String[] args) {
        ShapeSides square = new ShapeSides("Square",new Red(),4);
        ShapeSides pentagon = new ShapeSides("Pentagon", new Blue(),5);
        square.show();
        pentagon.show();
    }
}
