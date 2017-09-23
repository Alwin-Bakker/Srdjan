
import java.util.*;

class Gregorian {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a year, month and day (in that precise order).");
        int year = scanner.nextInt();
        int monthInput = scanner.nextInt();
        int day = scanner.nextInt();
        System.out.println("Your day is " + day + "/" + monthInput + "/" + year + ", which is a "
                + dateToDay(year, monthInput, day) + ".");
    }

    public static int century(int year) {
        int century = year / 100;
        return century;
    }

    public static int yearpart(int year) {
        int yearpart = year % 100;
        return yearpart;
    }

    public static String dateToDay(int year, int month, int day) {
        if (month < 3) {
            month += 12;
        }
        int numericalDateToDay = (day + (((month + 1) * 26) / 10) + yearpart(year) + (yearpart(year) / 4) + (century(year) / 4) +
                (5 * century(year))) % 7;
        if (numericalDateToDay == 0) {
            return "Saturday";
        }
        if (numericalDateToDay == 1) {
            return "Sunday";
        }
        if (numericalDateToDay == 2) {
            return "Monday";
        }
        if (numericalDateToDay == 3) {
            return "Tuesday";
        }
        if (numericalDateToDay == 4) {
            return "Wednesday";
        }
        if (numericalDateToDay == 5) {
            return "Thursday";
        } else {
            return "Friday";
        }
    }
}