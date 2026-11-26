import java.math.BigInteger;

public class FibonacciFirst100 {
    public static void main(String[] args) {
        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;

        System.out.println("First 100 numbers of the Fibonacci sequence:");

        for (int i = 1; i <= 100; i++) {
            System.out.println(first);

            BigInteger next = first.add(second);
            first = second;
            second = next;
        }
    }
}
