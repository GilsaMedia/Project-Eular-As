public class Problem_5 {
    public static boolean devidedTill20(int num) {
        for (int i = 2; i < 20; i++) {
            if (num % i != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int i = 2520;
        while (!devidedTill20(i)) {
            i++;
        }
        System.out.println(i);
    }
}
