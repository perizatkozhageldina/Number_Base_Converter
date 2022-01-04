import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double g = 9.8;
        Scanner scanner = new Scanner(System.in);
        double density = scanner.nextDouble();
        double height = scanner.nextDouble();
        double pressure = density * g * height;
        System.out.println(pressure);
    }
}
