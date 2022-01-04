import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal money = new BigDecimal(scanner.next());
        BigDecimal rate = new BigDecimal(scanner.next());
        int years = scanner.nextInt();

        BigDecimal finalAmount = money.multiply(BigDecimal.ONE.add(rate.divide(BigDecimal.TEN.multiply(BigDecimal.TEN))).pow(years));
        System.out.println("Amount of money in the account: " + finalAmount.setScale(2, RoundingMode.CEILING));

    }
}