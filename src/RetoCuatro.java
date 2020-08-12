import java.util.Scanner;

public class RetoCuatro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //scan.useDelimiter("\n");
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        String s=" ";
        s= scan.nextLine();
        s+=scan.nextLine();
        scan.close();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
