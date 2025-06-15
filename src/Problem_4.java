public class Problem_4 {

    public static boolean isPalindrome(int num) {
        int reversed = 0;
        int temp = num;
        while (temp != 0) {
            reversed = (reversed * 10) + temp % 10;
            temp /= 10;
        }
        return reversed == num;
    }

    public static void main(String[] args) {
        int biggest = 0;
        for (int i = 1000; i > 0; i--) {
            for (int j = 1000; j > 0; j--) {
                if (isPalindrome(i * j) && i * j > biggest) {
                        biggest = i * j;
                }
            }
        }
        System.out.println(biggest);
    }
}
