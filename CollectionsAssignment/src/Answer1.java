import java.util.ArrayList;
import java.util.List;

public class Answer1 {
    private List<Float> floatList = new ArrayList();
    private float total;
    
    void calculate(){
        for (Float i:floatList){
            total += i;
        }
    }
    public static void main(String[] args) {
        Answer1 obj = new Answer1();
        obj.floatList.add(2.13f);
        obj.floatList.add(5.55f);
        obj.floatList.add(8.21f);
        obj.floatList.add(3.25f);
        obj.floatList.add(4.12f);
        obj.calculate();
        System.out.println(obj.total);
    }
}
