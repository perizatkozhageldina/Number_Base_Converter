import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        BigInteger number = new BigInteger(in);
        BigInteger fact = BigInteger.ONE;

        for (int i = 1; BigInteger.valueOf(i).compareTo(number) < 0; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
            if (fact.compareTo(number) >= 0) {
                System.out.println(i);
                break;
            }
        }
    }
}