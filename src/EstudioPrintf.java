

public class EstudioPrintf {
    public static void main(String[] args) {
        System.out.printf("Hello %s!%n", "World");
        System.out.printf("Hello %15s%n", "World");
        System.out.printf("Hello %10s%n", "World");
        System.out.printf(" %4d%n", 34);
        System.out.printf(" %04d%n", 34);
        System.out.printf("%-10s%4d%n", "World", 1);
        System.out.printf("Hello %4d%n%-10s%n", 1, "World");
        System.out.printf("Hello %4d%-100s%n", 1, "World");
        System.out.printf("Hello %4d%-10s", 1, " World");
        //https://www.baeldung.com/java-printstream-printf
    }
}
