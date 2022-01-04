import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double result = x * x * x + x * x + x + 1;
        System.out.println(result);
    }
}
