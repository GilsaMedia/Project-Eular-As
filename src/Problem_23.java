import java.util.Arrays;

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
        long[] arr = new long[6965]; // it started as until and then change it to this to save wasted space
        int index = 0;
        for (long i = 1; i <= until; i++) {
            if (isAbundant(i) != 0) {
                arr[index] = isAbundant(i);
                index++;
            }
        }
        long sum = 0;
        boolean add = true;
        int z = 0;
        long tempSum;
        for (int i = 1; i < until; i++) {
            for (int j = 1; j < index; j++) {
                if (j != z) {
                    tempSum = arr[z] + arr[j];
                } else {
                    break;
                }
                if (i == tempSum) {
                    add = false;
                    break;
                }
            }
            if (add) {
                sum += i;
            }
            if (z < 6964) {
                z++;
            }
        }
        System.out.println(sum);
    }
}
