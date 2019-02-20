
enum House{
    BHK1("20lakhs"), BHK2("35lakhs"),BHK3("50lakhs");
    private String price;
    
    public String getPrice(){
        return this.price;
    }
    
    House(String price){
        this.price=price;
    }
}


public class Answer9 {
    
    public static void main(String[] args) {
        House houses[] = House.values();
        for (House house: houses) {
            System.out.println(house.name()+ " price is " + house.getPrice());
        }
    }
}
