public class Problem_7 {
    public static boolean isPrime(long num) {
        for (long i = 2; i < num / 2 + 1 ; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int place = 2;
        int i = 2;
        do {
            i++;
            if (isPrime(i)) {
                place++;
            }
        } while (place <= 10001);
        System.out.println(i);
    }
}
