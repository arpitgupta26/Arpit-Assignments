interface Polygons{
    void show();
}

class Square implements Polygons{
    
    @Override
    public void show() {
        System.out.println("Square has 4 sides");
    }
}

class Pentagon implements Polygons{
    @Override
    public void show() {
        System.out.println("Pentagon has 5 sides");
    }
}

class Octagon implements Polygons{
    @Override
    public void show() {
        System.out.println("Octagon has 8 sides");
    }
}

class PolygonFactory{
    
    public Polygons getPolygon(String name){
        if(name.equalsIgnoreCase("square")){
            return new Square();
        }
        else if(name.equalsIgnoreCase("pentagon")){
             return new Pentagon();
        }
        else {
            return new Octagon();
        }
    }
}


public class Answer2 {
    public static void main(String[] args) {
        Polygons polygons = new PolygonFactory().getPolygon("square");
        polygons.show();
        polygons = new PolygonFactory().getPolygon("Pentagon");
        polygons.show();
    
    }
}
