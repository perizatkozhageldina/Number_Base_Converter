// write your answer here 

import java.util.Scanner;

class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = b * b - 4 * a * c;
        double x1 = ((-1) * b + Math.sqrt(d)) / (2 * a);
        double x2 = ((-1) * b - Math.sqrt(d)) / (2 * a);
        System.out.println(Math.min(x1, x2) + " " + Math.max(x1, x2));
    }
}
