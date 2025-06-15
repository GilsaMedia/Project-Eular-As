public class Problem_23 {
    public static long isAbundant(long n) {
        long dividers = 0;
        for (int i = 1; i < (n/2 + 1); i++) {
            if (n % i == 0) {
                dividers += i;
            }
        }
        if (dividers > n) {
            return n;
        }
        else return 0;
    }
    public static void main(String[] args) {
        int until = 28123;
        long[] arr = new long[until];
        for (long i = 1; i <= until; i++) {
            if (isAbundant(i) != 0) {
                arr[(int)(i-1)] = isAbundant(i);
            }
        }
    }
}
