import java.math.BigInteger;

public class Problem_16 {
    public static void main(String[] args) {
        long damn = (long)(Math.pow(2, 1000));
        long sum = 0;

        System.out.println(damn);

        while (damn > 0) {
            sum += damn % 10;
            damn /= 10;
        }
        System.out.println(sum);
    }
}
