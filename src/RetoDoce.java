import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar calendar= Calendar.getInstance();
        calendar.set(month, day,year);
        String s = calendar.getTime().toString();
        String [] r = s.split(" ",5);
        String dayofweek;
        List<String> list = new ArrayList<>();
        for (String a:r) {
            list.add(a);
        }
        String date = list.get(0);
        switch (date){
            case "Mon":
                dayofweek="MONDAY";
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
                throw new IllegalStateException("Unexpected value: " + date);
        }
        return dayofweek;
    }


}

public class RetoDoce {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
