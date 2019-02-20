public class Answer10 {
    
    public void add(int a, int b){
        System.out.println(a+b);
    }
    
    public void add(double a, double b){
        System.out.println(a+b);
    }
    
    public void multiply(float a, float b){
        System.out.println(a*b);
    }
    
    public void multiply(int a, int b){
        System.out.println(a*b);
    }
    
    public void concate(String a, String b){
        System.out.println(a.concat(b));
    }
    
    public void concate(String a, String b, String c){
        System.out.println(a.concat(b).concat(c));
    }
    
    public static void main(String[] args) {
        Answer10 obj = new Answer10();
        obj.add(3,8);
        obj.add(2.5,4.7);
        obj.multiply(5,10);
        obj.multiply(3.20f,7.70f);
        obj.concate("Arpit"," Gupta");
        obj.concate("Arpit"," Gupta"," MCA");
    }
}
