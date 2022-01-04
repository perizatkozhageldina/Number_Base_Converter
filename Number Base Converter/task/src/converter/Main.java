package converter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter two numbers in format: {source base} {target base} (To quit type /exit) ");
            String[] inputBase = scanner.nextLine().split(" ");
            if (inputBase[0].equals("/exit")) {
                break;
            } else {
                while (true) {
                    int source = Integer.parseInt(inputBase[0]);
                    int target = Integer.parseInt(inputBase[1]);
                    System.out.print("Enter number in base " + source + " to convert to base " + target + " (To go back type /back) ");
                    String inputNumber = scanner.nextLine();
                    if (inputNumber.equals("/back")) {
                        break;
                    } else {
                        if (inputNumber.contains(".")) {
                            String[] decimalNumber = inputNumber.split("\\.");
                            char[] integerPart = decimalNumber[0].toUpperCase().toCharArray();
                            char[] fractionalPart = decimalNumber[1].toUpperCase().toCharArray();
                            BigInteger decimal = convertToDecimal(integerPart, source);
                            String convertedNumber = convertFromDecimal(decimal, target);
                            BigDecimal decimalFraction = convertFractionToDecimal(fractionalPart, source);
                            String convertedFraction = convertFractionFromDecimal(decimalFraction, target);
                            System.out.println("Conversion result: " + convertedNumber + "." + convertedFraction + "\n");
                        } else {
                            char[] number = inputNumber.toUpperCase().toCharArray();
                            BigInteger decimal = convertToDecimal(number, source);
                            String convertedNumber = convertFromDecimal(decimal, target);
                            System.out.println("Conversion result: " + convertedNumber + "\n");
                        }
                    }
                }
            }
        }
    }

    public static String convertFromDecimal (BigInteger decimal, int base) {
        ArrayList<BigInteger> conversion = new ArrayList<>();
        while (true) {
            if (decimal.compareTo(BigInteger.valueOf(base)) < 0) {
                conversion.add(decimal);
                break;
            } else {
                BigInteger[] val = decimal.divideAndRemainder(BigInteger.valueOf(base));
                conversion.add(val[1]);
                decimal = val[0];
            }
        }

        StringBuilder result = new StringBuilder("");
        for (int i = conversion.size() - 1; i >= 0; i--) {
            BigInteger letter = BigInteger.valueOf(55);
            BigInteger target = conversion.get(i);
            if (target.compareTo(BigInteger.valueOf(9)) > 0) {
                result.append((char) letter.add(target).intValue());
            } else {
                result.append(target);
            }
        }

        return result.toString();
    }

    public static BigInteger convertToDecimal (char[] source, int base) {
        ArrayList<BigInteger> number = new ArrayList<>();
        for (int i = source.length - 1; i >= 0; i--) {
            if (Character.isDigit(source[i])) {
                number.add(BigInteger.valueOf(Character.getNumericValue(source[i])));
            } else {
                number.add(BigInteger.valueOf(source[i] - 55));
            }
        }
        BigInteger decimal = BigInteger.ZERO;
        for (int i = 0; i < number.size(); i++) {
            BigInteger pow = BigInteger.valueOf((long) Math.pow(base, i));
            decimal = decimal.add(number.get(i).multiply(pow));
        }
        return  decimal;
    }

    public static String convertFractionFromDecimal (BigDecimal number, int base) {
        ArrayList<BigDecimal> conversion = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (number.remainder(BigDecimal.ONE).compareTo(BigDecimal.ZERO) == 0) {
                while (conversion.size() != 5) {
                    conversion.add(BigDecimal.ZERO);
                }
                break;
            } else {
                number = number.multiply(BigDecimal.valueOf(base));
                conversion.add(number.setScale(0, RoundingMode.DOWN));
                number = number.remainder(BigDecimal.ONE);
            }
        }

        StringBuilder result = new StringBuilder("");
        BigDecimal letter = BigDecimal.valueOf(55);
        for (BigDecimal target : conversion) {
            if (target.compareTo(BigDecimal.valueOf(9)) > 0) {
                result.append((char) letter.add(target).intValue());
            } else {
                result.append(target);
            }
        }

        return result.toString();
    }

    public static BigDecimal convertFractionToDecimal (char[] source, int base) {
        ArrayList<BigDecimal> number = new ArrayList<>();
        for (char c : source) {
            if (Character.isDigit(c)) {
                number.add(BigDecimal.valueOf(Character.getNumericValue(c)));
            } else {
                number.add(BigDecimal.valueOf(c - 55));
            }
        }
        BigDecimal decimal = BigDecimal.ZERO;
        MathContext mc = new MathContext(10);
        for (int i = 0; i < number.size(); i++) {
            decimal = decimal.add(BigDecimal.valueOf(base).pow((-1) * (i + 1), mc).multiply(number.get(i)));
            System.out.println(number.get(i) + " " + decimal);
        }
        return  decimal.setScale(5, RoundingMode.HALF_DOWN);
    }
}