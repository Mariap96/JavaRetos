import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class RetoTrece {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nf.format(payment);
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = nf2.format(payment);
        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nf3.format(payment);
        NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nf4.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
