import java.util.Scanner;
import java.util.stream.IntStream;

public class RetoSeis {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        IntStream.range(1,11).forEach(i -> {
            int result= N*i;
            System.out.println(N+ " "+ "X" + " " + i+" "+"= "+result);
        });
        for (int i=1; i<=10; i++){
            int result= N*i;
            System.out.println(N + " x " + i + " = " + result);
        }
        scanner.close();
    }
}
