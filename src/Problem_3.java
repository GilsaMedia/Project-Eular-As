import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sacn = new Scanner(System.in);
        long num = sacn.nextLong();
        long i = 2;
        while (num > 1) {
            if (num % i == 0) {
                num /= i;
            } else {
                i++;
            }
        }
        System.out.println(i);
    }
}
