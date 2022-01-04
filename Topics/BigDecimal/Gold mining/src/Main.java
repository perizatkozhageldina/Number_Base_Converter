import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        String input2 = scanner.next();
        String input3 = scanner.next();
        BigDecimal number1 = new BigDecimal(input1);
        BigDecimal number2 = new BigDecimal(input2);
        BigDecimal number3 = new BigDecimal(input3);
        System.out.println(number1.add(number2).add(number3));

    }
}