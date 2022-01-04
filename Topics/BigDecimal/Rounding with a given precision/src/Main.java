import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int scale = scanner.nextInt();

        BigDecimal number = new BigDecimal(input);
        number = number.setScale(scale, RoundingMode.HALF_DOWN);
        System.out.println(number);
    }   
}