import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


class ResultDos {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
    public static String formatDate(int month, int day, int year){
        Formatter obj = new Formatter();
        String yearconvert = String.valueOf(obj.format("%04d", year));
        String monthconvert = String.valueOf(obj.format("%02d", month));
        String dateconvert = String.valueOf(obj.format("%02d", day));
        LocalDate datebasicIsoDate = LocalDate.parse(dateconvert, DateTimeFormatter.BASIC_ISO_DATE);
        SimpleDateFormat formatJava = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        try {
            date = formatJava.parse(String.valueOf(datebasicIsoDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat formatByCompare = new SimpleDateFormat("EEE, MMM d yyyy");
        formatByCompare.format(date);
        String s=date.toString();
        return s;
    }

    public static String findDay(int month, int day, int year) {
        String[] r = formatDate(month,day,year).split(" ", 5);
        String dayofweek;
        List<String> list = new ArrayList<>();
        for (String a : r) {
            list.add(a);
        }
        String dayweek = list.get(0);
        switch (dayweek) {
            case "Mon":
                dayofweek = "MONDAY";
                break;
            case "Tue":
                dayofweek = "TUESDAY";
                break;
            case "Wed":
                dayofweek = "WEDNESDAY";
                break;
            case "Thu":
                dayofweek = "THURSDAY";
                break;
            case "Fri":
                dayofweek = "FRIDAY";
                break;
            case "Sat":
                dayofweek = "SATURDAY";
                break;
            case "Sun":
                dayofweek = "SUNDAY";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + dayweek);
        }
        return dayofweek;

    }

}
public class ClasePruebDate {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);

        int month = scn.nextInt();

        int day = scn.nextInt();

        int year = scn.nextInt();

        String res = ResultDos.findDay(month, day, year);
        System.out.println(res);

    }
}
