import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first= scanner.next();
        String second = scanner.next();
        String third = scanner.next();
        BigDecimal number1 = new BigDecimal(first);
        BigDecimal number2 = new BigDecimal(second);
        BigDecimal number3 = new BigDecimal(third);

        BigDecimal result = number1.add(number2).add(number3);
        BigDecimal divisor = new BigDecimal(3);
        result = result.divide(divisor, 0, RoundingMode.DOWN);
        System.out.println(result);

    }
}