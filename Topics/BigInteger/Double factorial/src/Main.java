import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        BigInteger number = BigInteger.valueOf(n);
        BigInteger fact = BigInteger.ONE;

        while (number.compareTo(BigInteger.ZERO) > 0) {
            fact = fact.multiply(number);
            number = number.subtract(BigInteger.ONE).subtract(BigInteger.ONE);
        }
        return fact;
    }
}