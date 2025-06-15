public class Problem_14 {
    public static long colazway(long num) {
        int way = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
                way++;
            } else {
                num = num * 3 + 1;
                way++;
            }
        }
        return way;
    }
    public static void main(String[] args) {
        int num = 0;
        long biggestWay = 0;
        for (int i = 1; i < 1000000; i++) {
            if (colazway(i) > biggestWay) {
                biggestWay = colazway(i);
                num = i;
            }
        }
        System.out.println(num);
    }
}
