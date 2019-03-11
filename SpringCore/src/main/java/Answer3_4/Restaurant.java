package Answer3_4;

public class Restaurant {
    HotDrink tea;
    HotDrink expressTea;
    
    public Restaurant(HotDrink hotDrink) {
        this.expressTea = hotDrink;
    }
    
    public void setTea(HotDrink tea) {
        this.tea = tea;
    }
    
    void prepareHotDrink(){
        tea.prepareHotDrink();
    }
}
