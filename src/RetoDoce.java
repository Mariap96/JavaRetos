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
        return LocalDate.of(year,month,day).getDayOfWeek().name();
    }


}

public class RetoDoce {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);

        int month = scn.nextInt();

        int day = scn.nextInt();

        int year = scn.nextInt();

        String res = ResultDos.findDay(month, day, year);
        System.out.println(res);
    }
}
