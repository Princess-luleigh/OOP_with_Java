import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// Create The Class
public class TimeConvertor {

    // Create The Method
    // to convert 12hr Time Format to 24hr Time Format
    public static String _12to24 (String time) throws Exception {
        SimpleDateFormat _12Format = new SimpleDateFormat("hh:mm a");
        SimpleDateFormat _24Format = new SimpleDateFormat("HH:mm");
        Date date = _12Format.parse(time);
        return _24Format.format(date);
    }

    // Create The Method
    // to convert 24hr Time Format to 12hr Time Format
    public static String _24to12 (String time) throws Exception {
        SimpleDateFormat _12Format = new SimpleDateFormat("hh:mm a");
        SimpleDateFormat _24Format = new SimpleDateFormat("HH:mm");
        Date date = _24Format.parse(time);

        // Replacing AM/PM to am/pm
        return _12Format.format(date).replace("AM", "am").replace("PM","pm");
    }

    // Create the Main Method
    public static void main(String [] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a time ([h]h:mm [am|pm]):");
        String time = sc.nextLine();

        if (time.endsWith("pm") || time.endsWith("am"))
            System.out.println(_12to24(time));
        else
            System.out.println(_24to12(time));
    }
}




