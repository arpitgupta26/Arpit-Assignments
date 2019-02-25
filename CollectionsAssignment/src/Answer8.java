import java.text.SimpleDateFormat;
import java.util.Date;

public class Answer8 {
    
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String formattedDate = simpleDateFormat.format(new Date());
        System.out.println(formattedDate);
    }
}
