class Bank{
    String name;
    float rateOfInterest;
    void getDetails(){
        System.out.println(name + " rate of interest is " + rateOfInterest + "%");
    }
}

class SBI extends Bank{
   SBI(String name, float rate){
       this.name=name;
       this.rateOfInterest=rate;
   }
}

class ICICI extends Bank{
    ICICI(String name, float rate){
        this.name=name;
        this.rateOfInterest=rate;
    }
}

class BOI extends Bank{
    BOI(String name, float rate){
        this.name=name;
        this.rateOfInterest=rate;
    }
}

public class Answer11 {
    public static void main(String[] args) {
        SBI obj = new SBI("SBI",4.25f);
        ICICI obj1 = new ICICI("ICICI",5.50f);
        BOI obj2 = new BOI("BOI",6.70f);
        obj.getDetails();
        obj1.getDetails();
        obj2.getDetails();
    }
}
