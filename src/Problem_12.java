public class Problem_12 {
    public static void main(String[] args) {
        long i = 1, collect = 0, dividers = 0;

        while (dividers <= 500) {
            collect += i;

            int temp = 0;
            for (int j = 1; j <= collect; j++) {
                if (collect % j == 0) {
                    temp++;
                }
            }
            if (temp > dividers) {
                dividers = temp;
            }
            i++;
            System.out.println("i: " + i);
            System.out.println("sum: " + collect);
            System.out.println("dividers: " + dividers);
        }
    }
}
