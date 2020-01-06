import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


public class Main {
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        //DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy - E"); //- переход на русский
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy - E", Locale.ENGLISH);
        Calendar birthday = new GregorianCalendar();
        birthday.set(1988, Calendar.JANUARY, 19);
        System.out.println(dateFormat.format(birthday.getTime()));

        int yearsFirst = birthday.get(Calendar.YEAR);
        int yearLast = calendar.get(Calendar.YEAR);
        int years = yearLast - yearsFirst;
        int y = 0;
        for (int i = 0; i <= years; i++) {
            birthday.add(Calendar.YEAR, y);

            System.out.println(i + " - " + dateFormat.format(birthday.getTime()));
            y = 1;
        }
    }
}
