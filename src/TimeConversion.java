import java.text.SimpleDateFormat;
import java.util.Date;


public class TimeConversion {

    public static void main(String [] args) throws Exception {
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ss a");
        Date date = parseFormat.parse("07:05:45 PM");
        System.out.println(parseFormat.format(date) + " = " + displayFormat.format(date));
    }
}
