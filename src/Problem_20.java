import java.math.BigInteger;

public class Problem_20 {
    public static void main(String[] args) {
        long factorialNum = 1;
            long sum = 0;
        for (int i = 100; i > 0; i--) {
            factorialNum *= i;
        }

        while (factorialNum >= 1) {
            sum += factorialNum % 10;
            factorialNum /= 10;
            System.out.println(sum);
        }
    }
}
