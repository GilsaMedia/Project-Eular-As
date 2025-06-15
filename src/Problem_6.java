public class Problem_6 {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i <= 100; i++) {
            sum1 += i;
            sum2 += Math.pow(i, 2);
        }
        System.out.println((sum1 * sum1) - sum2);
    }
}
