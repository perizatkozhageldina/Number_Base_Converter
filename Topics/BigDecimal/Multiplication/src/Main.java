import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();
        BigDecimal numberOne = new BigDecimal(first);
        BigDecimal numberTwo = new BigDecimal(second);
        System.out.println(numberOne.multiply(numberTwo));
    }
}