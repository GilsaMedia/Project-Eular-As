public class Problem_2 {
    public static void main(String[] args) {
        int num1 = 1, num2= 1, sum = 0;
        while (num1 <= 4000000 && num2 <= 4000000) {
            num1 += num2;
            num2 += num1;
            if (num1 % 2 == 0) {
                sum += num1;
            }
            if (num2 % 2 == 0) {
                sum += num2;
            }
        }
        System.out.println(sum);
    }
}
