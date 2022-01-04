// write your answer here 

import java.util.Scanner;

class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double u1 = scanner.nextDouble();
        double u2 = scanner.nextDouble();
        double v1 = scanner.nextDouble();
        double v2 = scanner.nextDouble();
        double scalar = u1 * v1 + u2 * v2;
        double modulus = Math.sqrt((u1 * u1 + u2 * u2) * (v1 * v1 + v2 * v2));
        double cos = scalar / modulus;
        System.out.println((int) Math.toDegrees(Math.acos(cos)));
    }
}