public class Problem_9 {
    public static void main(String[] args) {

        int num1 = 1, num2 = 2;
        double num3 = Math.sqrt((Math.pow(num1, 2) + Math.pow(num2, 2)));

        while (num1 < 1000) {
            while (num2 < 1000) {
                if (num3 % 1 == 0) {
                    if (num1 + num2 + num3 == 1000) {
                        System.out.println("a: " + num1 + " b: " + num2 + " c: " + num3);
                        System.out.println((long) (num1 * num2 * num3));
                        break;
                    } else {
                        num2++;
                        num3 = Math.sqrt((Math.pow(num1, 2) + Math.pow(num2, 2)));
                    }
                } else {
                    num2++;
                    num3 = Math.sqrt((Math.pow(num1, 2) + Math.pow(num2, 2)));
                }
            }
            num1++;
            num2 = 2;

        }
    }
}
