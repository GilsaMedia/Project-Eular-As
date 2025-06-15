public class Problem_10 {
    public static void main(String[] args) {
        long sum = 0;
        for (long i = 2; i < 2000000; i++) {
            if (Problem_7.isPrime(i)) {
                sum = sum + i;
                System.out.println("Sum: " + sum);
            }
            System.out.println("i: " + i);
        }
    }
}
