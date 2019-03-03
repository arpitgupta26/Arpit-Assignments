class SingeltonDummy {
    int id;
    static SingeltonDummy singeltonDummy;
    
    private SingeltonDummy(int id) {
        this.id = id;
    }
    
    static SingeltonDummy getInstance(int id){
        if(singeltonDummy ==null){
            singeltonDummy = new SingeltonDummy(id);
        }
        return singeltonDummy;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}

public class Answer1 {
    public static void main(String[] args) {
        SingeltonDummy singeltonDummy1 = SingeltonDummy.getInstance(100);
        System.out.println(singeltonDummy1.hashCode());
        System.out.println("singektonDummy1 " + singeltonDummy1.id);
        SingeltonDummy singeltonDummy2 = SingeltonDummy.getInstance(200);
        System.out.println(singeltonDummy2.hashCode());
        System.out.println("singektonDummy2 " + singeltonDummy2.id);
        System.out.println("singektonDummy1 " + singeltonDummy1.id);
    
    }
}
