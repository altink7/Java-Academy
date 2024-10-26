package at.altin.strukturierteprogrammierung.self_study_k_linked_list.compound_data_types.lendItems;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LendItem it1 = new LendItem(), it2 = new LendItem();
        System.out.printf("Welcome to LendApp\n");
        int mode = 0, format = 1;

        String input = "";
        do {
            System.out.printf("enter opcode (9 for usage): ");
            // input = sc.nextInt();
            input = sc.nextLine();
            switch (input) {
                case "1":
                    it1 = scanLendItem(sc);
                    break;
                case "2":
                    it2 = scanLendItem(sc);
                    break;
                case "3":
                    System.out.printf("%s\n", lendItemString(it1, format));
                    System.out.printf("%s\n", lendItemString(it2, format));
                    break;
                case "4":
                    System.out.printf("set compare mode (" + "1=by lend date, " + "2=by return date, " + "3=by lender, "
                            + "4=by owner, " + "all other=by description: ");
                    mode = sc.nextInt();
                    break;
                case "5":
                    int cmp = compare(it1, it2, mode);
                    if (cmp < 0)
                        System.out.printf("LendItem1 is before LendItem2.\n");
                    else if (cmp > 0)
                        System.out.printf("LendItem1 is after LendItem2.\n");
                    else
                        System.out.printf("LendItems are equal.\n");
                    break;
                case "6":
                    System.out.printf("LendItem1 and LendItem2 are %s equal.\n", equals(it1, it2) ? "" : "not");
                    break;
                case "9":
                    System.out.printf("1 enter LendItem1\n" + "2 enter LendItem2\n" + "3 print LendItem1 and 2\n"
                            + "4 set compare mode\n" + "5 compare the LendItems\n" + "6 check equality\n"
                            + "9 display this message\n" + "0 exit\n");
                    break;
                case "0":
                    break;
                default:
                    System.out.println("invalid op code");
            }

        } while (input != null && !input.equals(""));
        sc.close();
        System.out.printf("Thank you for using LendApp.\n");
    }

    /**
     * creates a String representation of a LendItem in a specified format<br>
     *
     * The format is controlled by parameter format:
     * <ul>
     * <li>1: full format</li>
     * <li>2: short format</li>
     * <li>3 (and in all other cases): csv format</li>
     * </ul>
     *
     * Full Format: "&ltdescription> &ltlender> &ltlend date> &ltreturn date>
     * &ltowner>" where
     * <ul>
     * <li>description is exactly 15 characters wide, left aligned</li>
     * <li>lender and owner are exactly 10 characters wide, left aligned</li>
     * <li>dates are in their default format</li>
     * </ul>
     *
     * Short Format: "&ltdescription> &ltlender>" where
     * <ul>
     * <li>description is exactly 15 characters wide, left aligned</li>
     * <li>lender are exactly 10 characters wide, left aligned</li>
     * </ul>
     *
     * CSV Format: "&ltdescription>,&ltlender>,&ltlend date>,&ltreturn
     * date>,&ltowner>" where all String values are surrounded by double quotes and
     * dates are in their default format.
     *
     * @param it
     * @param format
     * @return
     */
    public static String lendItemString(LendItem it, int format) {
        switch (format) {
            case 1:
                return String.format("%-15.15s %-10.10s %s %s %-10.10s", it.description, it.lender, dateString(it.lendDate),
                        dateString(it.returnDate), it.owner);
            case 2:
                return String.format("%-15.15s %-10.10s", it.description, it.lender);
            default:
                return String.format("\"%s\",\"%s\",\"%s\",\"%s\",\"%s\"", it.description, it.lender,
                        dateString(it.lendDate), dateString(it.returnDate), it.owner);
        }

    }

    private static String dateString(Date d) {
        return String.format("%04d.%02d.%02d", d.year, d.month, d.day);
    }

    /**
     * compares two LendItems<br>
     * the method of comparison is controlled by method.
     * <ul>
     * <li>1: compare by lend date</li>
     * <li>2:compare by return date</li>
     * <li>3:compare by lender</li>
     * <li>4:compare by owner</li>
     * <li>all other values:compare by description</li>
     *
     * returns -1 if the it1 is before it2, 1 if the other way round, 0 if they are
     * the same. <br>
     * Note: any two null-LendItems are equal and any null-LendItem goes before any
     * non-LendItem event.
     *
     * @param it1
     * @param it2
     * @return
     */
    public static int compare(LendItem it1, LendItem it2, int method) {
        switch (method) {
            case 1:
                return compareByLendDate(it1, it2);
            case 2:
                return compareByReturnDate(it1, it2);
            case 3:
                return compareByLender(it1, it2);
            case 4:
                return compareByOwner(it1, it2);
            default:
                return compareByDescription(it1, it2);
        }
    }

    /**
     * compares two LendItems by lend date <br>
     * returns -1 if the lend date of it1 is before than of it2, 1 if the other way
     * round, 0 if they are the same.<br>
     * Note: any two null-LendItems are equal and any null-LendItem goes before any
     * non-LendItem event.
     *
     * @param it1
     * @param it2
     * @return
     */
    public static int compareByLendDate(LendItem it1, LendItem it2) {
        if (it1 == null && it2 == null)
            return 0;
        if (it1 == null)
            return -1;
        if (it2 == null)
            return 1;

        return compare(it1.lendDate, it2.lendDate);
    }

    /**
     * compares two LendItems by return date <br>
     * returns -1 if the return date of it1 is before than of it2, 1 if the other
     * way round, 0 if they are the same. <br>
     * Note: any two null-LendItems are equal and any null-LendItem goes before any
     * non-LendItem event.
     *
     * @param it1
     * @param it2
     * @return
     */
    public static int compareByReturnDate(LendItem it1, LendItem it2) {
        if (it1 == null && it2 == null)
            return 0;
        if (it1 == null)
            return -1;
        if (it2 == null)
            return 1;

        return compare(it1.returnDate, it2.returnDate);
    }

    /**
     * compares two LendItems by description<br>
     * returns -1 if the description of it1 is before than of it2, 1 if the other
     * way round, 0 if they are the same. <br>
     * descriptions are compared lexicographically (see String.compareTo) <br>
     * Note: any two null-LendItems are equal and any null-LendItem goes before any
     * non-LendItem event.
     *
     * @param it1
     * @param it2
     * @return
     */
    public static int compareByDescription(LendItem it1, LendItem it2) {
        if (it1 == null && it2 == null)
            return 0;
        if (it1 == null)
            return -1;
        if (it2 == null)
            return 1;

        int res = it1.description.compareTo(it2.description);
        if (res > 0)
            return 1;
        if (res < 0)
            return -1;
        return 0;
    }

    /**
     * compares two Date<br>
     * returns -1 if d1 is before it2, 1 if the other way round, 0 if they are the
     * same. <br>
     * Note: any two null-Dates are equal and any null-Dates goes before any
     * non-null Date.
     *
     * @param d1
     * @param d2
     * @return
     */
    public static int compare(Date d1, Date d2) {
        if (d1 == null && d2 == null)
            return 0;
        if (d1 == null)
            return -1;
        if (d2 == null)
            return 1;

        int res = (d1.day + d1.month * 100 + d1.year * 10000) - (d2.day + d2.month * 100 + d2.year * 10000);

        if (res > 0)
            return 1;
        if (res < 0)
            return -1;
        return 0;

    }

    /**
     * compares two LendItems by lender <br>
     * returns -1 if the lender of it1 is before than of it2, 1 if the other way
     * round, 0 if they are the same. <br>
     * lenders are compared lexicographically (see String.compareTo) <br>
     * Note: any two null-LendItems are equal and any null-LendItem goes before any
     * non-LendItem event.
     *
     * @param it1
     * @param it2
     * @return
     */
    public static int compareByLender(LendItem it1, LendItem it2) {
        if (it1 == null && it2 == null)
            return 0;
        if (it1 == null)
            return -1;
        if (it2 == null)
            return 1;

        int res = it1.lender.compareTo(it2.lender);
        if (res > 0)
            return 1;
        if (res < 0)
            return -1;
        return 0;
    }

    /**
     * compares two LendItems by owner <br>
     * returns -1 if the owner of it1 is before than of it2, 1 if the other way
     * round, 0 if they are the same. <br>
     * owner are compared lexicographically (see String.compareTo) <br>
     * Note: any two null-LendItems are equal and any null-LendItem goes before any
     * non-LendItem event.
     *
     * @param it1
     * @param it2
     * @return
     */
    public static int compareByOwner(LendItem it1, LendItem it2) {
        if (it1 == null && it2 == null)
            return 0;
        if (it1 == null)
            return -1;
        if (it2 == null)
            return 1;

        int res = it1.owner.compareTo(it2.owner);
        if (res > 0)
            return 1;
        if (res < 0)
            return -1;
        return 0;
    }

    /**
     * tests equality of two LendItems<br>
     * two LendItems are equal if and only if ALL their values are equal.
     *
     *
     * @param it1
     * @param it2
     * @return
     */
    public static boolean equals(LendItem it1, LendItem it2) {
        if (it1 == null && it2 == null)
            return true;
        if (it1 == null || it2 == null)
            return false;

        return it1.description.equals(it2.description) && it1.lender.equals(it2.lender) && it1.owner.equals(it2.owner)
                && equals(it1.lendDate, it2.lendDate) && equals(it1.returnDate, it2.returnDate);

    }

    /**
     * tests equality of two Dates<br>
     * two Dates are equal if and only if ALL their values are equal.
     *
     *
     * @param d1
     * @param d2
     * @return
     */
    public static boolean equals(Date d1, Date d2) {
        if (d1 == null && d2 == null)
            return true;
        if (d1 == null || d2 == null)
            return false;

        return d1.day == d2.day && d1.month == d2.month && d1.year == d2.year;
    }

    /**
     * interactively scans a LendItem on the console.<br>
     * this function prompts the user for input for the values of
     * <ul>
     * <li>description</li>
     * <li>lender</li>
     * <li>owner</li>
     * </ul>
     *
     * both description and lender cannot be left empty, in which case input for all
     * of the above values is repeated after a short error message "<field> cannot
     * be empty!".
     *
     * After the first input phase is completed, the lend date is scanned using
     * scanDate.
     *
     * finally a new LendItem instance is returned.
     *
     * @return
     */
    public static LendItem scanLendItem(Scanner sc) {

        String desc = "", lender = "", owner = "";
        do {
            System.out.printf("description: ");
            desc = sc.nextLine();
            // System.out.printf("*** scanned description: %s ***\n", desc);

            System.out.printf("lender: ");
            lender = sc.nextLine();
            // System.out.printf("*** scanned lender: %s ***\n", lender);

            System.out.printf("owner: ");
            owner = sc.nextLine();
            // System.out.printf("*** scanned owner: %s ***\n", owner);

            if (desc.isEmpty()) {
                System.out.printf("description cannot be empty!\n");
                continue;
            }
            if (lender.isEmpty()) {
                System.out.printf("lender cannot be empty!\n");
                continue;
            }

            break;
        } while (true);

        LendItem it = new LendItem();
        it.description = desc;
        it.lender = lender;
        it.owner = owner;
        System.out.printf("lend date:\n");
        it.lendDate = scanDate(sc);
        System.out.printf("return date:\n");
        it.returnDate = scanDate(sc);

        return it;
    }

    /**
     * interactively scans a Date on the console.<br>
     * this function prompts the user for input for the values of
     * <ul>
     * <li>year</li>
     * <li>month</li>
     * <li>day</li>
     * </ul>
     *
     * Only simple input validation is performed. years must be after 1581, months
     * must be out of the range [1-12], and days must be out of the range [1-31].
     * After invalid input, input for all values is repeated (After short error
     * messages for the first invalid value is displayed.)
     *
     *
     * @return
     */
    public static Date scanDate(Scanner sc) {
        int y, m, d;
        do {
            System.out.printf("year: ");
            y = Integer.parseInt(sc.nextLine());
            System.out.printf("month: ");
            m = Integer.parseInt(sc.nextLine());
            System.out.printf("day: ");
            d = Integer.parseInt(sc.nextLine());
            if (y < 1582) {
                System.out.printf("year cannot be before 1582!\n");
                continue;
            }
            if (m < 1 || m > 12) {
                System.out.printf("month must be 1-12!\n");
                continue;
            }
            if (d < 1 || d > 31) {
                System.out.printf("day must be 1-31!\n");
                continue;
            }

            break;
        } while (true);
        Date dat = new Date();
        dat.day = d;
        dat.month = m;
        dat.year = y;
        return dat;
    }

    /**
     * computes whether a LendItem is currently lent (out)<br>
     *
     * if the return date is not set (null) a LendItem is considered to be not
     * returned yet and thus "out"
     *
     * @param li
     * @return
     */
    public static boolean isOut(LendItem li) {
        return li.returnDate == null;
    }
}

