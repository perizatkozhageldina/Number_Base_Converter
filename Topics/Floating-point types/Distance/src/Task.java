import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dist = scanner.nextDouble();
        double time = scanner.nextDouble();
        System.out.println(dist / time);
    }
}
