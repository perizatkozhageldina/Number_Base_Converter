import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstValue = scanner.nextDouble();
        double secondValue = scanner.nextDouble();
        double diff = secondValue - firstValue;
        System.out.println(diff);
    }
}
