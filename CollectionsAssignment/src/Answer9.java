import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Answer9 {
    
    public static void main(String[] args) {
        Date date = new Date();
        Locale locale1 = new Locale("en", "US");
        Locale locale2 = new Locale("fr", "FRANCE");
        Locale locale3 = new Locale("tr", "TR");
        DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.FULL,locale1);
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.FULL,locale2);
        DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.FULL,locale3);
        System.out.println("Date format of USA " + dateFormat1.format(date));
        System.out.println("Date format of France " + dateFormat2.format(date));
        System.out.println("Date format of Turkey " + dateFormat3.format(date));
        
    }
}
