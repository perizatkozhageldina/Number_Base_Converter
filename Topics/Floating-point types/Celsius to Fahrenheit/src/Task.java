import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tempInCelcius = scanner.nextDouble();
        double tempInFahrenheit = tempInCelcius * 1.8 + 32;
        System.out.println(tempInFahrenheit);
    }
}
