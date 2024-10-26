package at.altin.strukturierteprogrammierung.self_study_f_arrays.simple_functions2;

import java.util.Scanner;

public class WeekdayFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter date (yyyymmdd): ");
        int date = sc.nextInt();

        int inDay = date % 100;
        int inMonth = date % 10000 / 100;
        int inYear = date / 10000;

        if(validate(inYear, inMonth, inDay)){
            int W = weekday(inDay, inMonth, inYear);
            String weekday = dayName(W);

            System.out.printf("%s",  weekday);

        }else {
            System.out.printf("invalid date (%d)\n", date);
        }
        sc.close();
    }

    /**
     * returns whether the given date actually exists/existed returns true if
     * date is valid, false otherwise the earliest valid date is Oct. 16th 1582,
     * the last date accepted is Dec, 31st, 2199.
     *
     * @param year
     * @param month
     * @param day
     * @return
     */
    public static boolean validate(int year, int month, int day) {
        if (year == 1582 && month == 10) {
            if (day <= 15)
                return false;
            else if (day <= 31)
                return true;
        }

        return validate(year, month) && day > 0
                && day <= nDays(month,year);
    }

    public static boolean validate(int year, int month) {
        if (year == 1582 && month < 10)
            return false;
        return validate(year) && (month >= 1) && (month <= 12);
    }

    /**
     * returns whether the given year is in the accepted range or exists at all
     * returns true if year is valid, false otherwise the earliest valid date is
     * Oct. 16th 1582, the last date accepted is Dec, 31st, 2199.
     *
     * @param year
     * @return
     */
    public static boolean validate(int year) {
        if (year < 1582 || year > 2199)
            return false;
        return true;
    }

    /**
     * returns the number of days in month of year
     */

    public static int nDays(int month, int year) {
        int nDays = -1;
        boolean isLeap = isLeap(year);
        switch (month) {
            case 2:
                if (isLeap)
                    nDays = 29;
                else
                    nDays = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                nDays = 30;
                break;
            default:
                nDays = 31;
                break;

        }
        return nDays;
    }

    public static boolean isLeap(int inYear) {
        return (inYear % 4 == 0) && (inYear % 100 != 0 || inYear % 400 == 0);
    }

    public static String dayName(int w) {
        switch(w){
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
        }
        return "";
    }

    /**
     * calculates and returns the weekday of a given date using the formula explained before
     the date is passed to the function as three ints.
     returns the weekday according to Table 1
     * @param inDay
     * @param inMonth
     * @param inYear
     * @return
     */
    public static int weekday(int inDay, int inMonth, int inYear) {
        int d=inDay;
        int yy =inYear;
        if (inMonth<3)
            yy--;
        int m=(inMonth+9)%12+1;
        int y = yy%100;
        int c = yy/100;

        int A = d + (int)(2.6*m-0.2) + y + (y/4)+(c/4)-2*c;
        int W = ((A %7)+7)%7;
        return W;
    }
}
