enum CarType{
    MINI, MICRO, SEDAN;
}

enum Location{
    INDIA, SINGAPORE, USA;
}

abstract class Car{
    CarType carType;
    Location location;
    
    public Car(CarType carType, Location location) {
        this.carType = carType;
        this.location = location;
    }

    abstract void construct();
    
    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", location=" + location +
                '}';
    }
}

class Mini extends Car{
    public Mini( Location location) {
        super(CarType.MINI, location);
    }
    
    @Override
    void construct() {
        System.out.println("Constructing Mini Car");
    }
}

class Micro extends Car{
    public Micro( Location location) {
        super(CarType.MICRO, location);
    }
    
    @Override
    void construct() {
        System.out.println("Constructing Micro Car");
    }
}

class Sedan extends Car{
    public Sedan( Location location) {
        super(CarType.SEDAN, location);
    }
    
    @Override
    void construct() {
        System.out.println("Constructing Sedan Car");
    }
}

class IndianCarFactory{
    
    static Car buildCar(CarType carType){
        Car car=null;
        switch(carType){
            case MINI:
                car = new Mini(Location.INDIA);
                break;
            case MICRO:
                car = new Micro(Location.INDIA);
                break;
            case SEDAN:
                car = new Sedan(Location.INDIA);
                break;
        }
        return car;
    }
}

class SingaoreCarFactory{
    
    static Car buildCar(CarType carType){
        Car car=null;
        switch(carType){
            case MINI:
                car = new Mini(Location.SINGAPORE);
                break;
            case MICRO:
                car = new Micro(Location.SINGAPORE);
                break;
            case SEDAN:
                car = new Sedan(Location.SINGAPORE);
                break;
        }
        return car;
    }
}

class USACarFactory{
    
    static Car buildCar(CarType carType){
        Car car=null;
        switch(carType){
            case MINI:
                car = new Mini(Location.USA);
                break;
            case MICRO:
                car = new Micro(Location.USA);
                break;
            case SEDAN:
                car = new Sedan(Location.USA);
                break;
        }
        return car;
    }
}

class CarFactory {
    Car car = null;
    
    static Car buildCar(CarType carType, Location location) {
        Car car = null;
        switch (location) {
            case INDIA:
                car = IndianCarFactory.buildCar(carType);
                break;
            case USA:
                car = USACarFactory.buildCar(carType);
                break;
            case SINGAPORE:
                car = SingaoreCarFactory.buildCar(carType);
                break;
        }
        return car;
    }
}


public class Answer3 {
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.SEDAN, Location.SINGAPORE));
        System.out.println(CarFactory.buildCar(CarType.MINI, Location.USA));
    }
}
