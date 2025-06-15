public class Problem_21 {
    public static long dividers(long a) {
        long dividers = 0;
        long dividers2 = 0;
        for (long j = 1; j < a; j++) {
            if (a % j == 0) {
                dividers += j;
            }
        }
        for (long j = 1; j < dividers; j++) {
            if (dividers % j == 0) {
                dividers2 += j;
            }
        }
        if (dividers2 == a && dividers != a) {
            return dividers;
        }
        else return 0;
    }
    public static void main(String[] args) {
        long sum = 0;
        boolean addNo  = false;
        int a = 0;
        for (long i = 10000; i >= 100; i--) {
            long temp = dividers(i);
            sum += temp;
            if (dividers(i) != 0) {
                System.out.println("first num: " + i + " second num: " + dividers(i));
            }
        }
        // dividing by two because i dont filter out the same num
        System.out.println(sum);
    }
}
