public class Problem_19 {
    public static void main(String[] args) {
        int day = 1, month = 1, year;
        int daysToNum = 3;
        long sundays = 0;

        for (year = 1901; year < 2001;) {
            if (month > 12) {
                month = 1;
                year++;
            }
            if (month != 2 && month <= 12) {
                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    if (day > 30) {
                        day = 1;
                        month++;

                    } else {
                        daysToNum++;
                        day++;
                    }
                } else {
                    if (day > 31) {
                        day = 1;
                        month++;
                    } else {
                        daysToNum++;
                        day++;
                    }
                }
            } else if (month == 2) {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    if (day > 29) {
                        day = 1;
                        month++;
                    }
                    else {
                        daysToNum++;
                        day++;
                    }
                } else {
                    if (day > 28) {
                        day = 1;
                        month++;
                    }
                    else {
                        daysToNum++;
                        day++;
                    }
                }
            }

            if (daysToNum > 7) {
                daysToNum = 1;
            }
            if (daysToNum == 1 && day == 1) {
                sundays++;
                System.out.println("day: " + day + " month: " + month + " year: " + year + " day in the week: " + daysToNum + " sundays: " + sundays);
            }
        }
    }
}
