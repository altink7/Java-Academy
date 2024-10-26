package at.altin.strukturierteprogrammierung.review_class15;

import java.util.Scanner;

//class SharePriceList {
//    SharePrice data;
//    SharePriceList next;
//}

class SharePriceList {
    Node head;
}

class Node {
    SharePrice data;
    Node next;
}

class SharePrice {
    String name, shortName;
    Date date = new Date();
    double open, close, low, high;
    int volume;
}

class Date {
    int day, month, year;
}

public class Portfolio {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //SharePriceList list = new SharePriceList();
        //Node head = null;

        //SharePrice sp = scanSharePrice();
        //printSharePrice(sp);

        //add(list, sp);
        //head = add(head, sp);

        //SharePriceList list = createDemoDataList();
        //print(list);
//
        //SharePrice[] arr = toArray(list);
        //sort(arr);
        //System.out.println("Print sorted Array:");
        //for (SharePrice sp : arr) {
        //    printSharePrice(sp);
        //}
//
        //System.out.println("Print filtered Array:");
        //SharePrice[] filtered = filter(arr, "AAPL");
        //for (SharePrice sp : filtered) {
        //    printSharePrice(sp);
        //}
//
        //System.out.println("Idx von max. Volume: " + maxVolume(filtered, "AAPL"));

        SharePriceList list = createDemoDataList();
        add(list, scanSharePrice());
        System.out.println("Demodata list:");
        print(list);
        SharePrice[] arr = toArray(list);
        SharePrice[] msft = filter(arr, "MSFT");
        sort(msft);
        System.out.println("Sorted MSFT:");
        for (int i = 0; i < msft.length; i++) {
            printSharePrice(msft[i]);
        }

        int idx = maxVolume(arr, "AAPL");
        Date d = arr[idx].date;
        System.out.printf("Max Volume AAPL: %04d.%02d.%02d\n", d.year, d.month, d.day);

        // SharePrice[] aapl = filter(arr, "AAPL");
        // sort(aapl);
        // System.out.println("Sorted AAPL:");
        // for (int i = 0; i < aapl.length; i++) {
        //     printSharePrice(aapl[i]);
        // }
    }

    public static void printSharePrice(SharePrice s) {
        //Date d = s.date;
        System.out.printf("%s (%s) - %04d.%02d.%02d - %f, %f, %f, %f. (%d)\n", s.name, s.shortName, s.date.year, s.date.month, s.date.day, s.open, s.high, s.low, s.close, s.volume);
    }

    public static void print(SharePriceList list) {
        for(Node cur = list.head; cur != null; cur = cur.next){
            printSharePrice(cur.data);
        }
    }

    public static SharePrice[] toArray(SharePriceList list) {
        int len = length(list);
        SharePrice[] arr = new SharePrice[len];

        // Variante 1
        Node cur = list.head;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cur.data;
            cur = cur.next;
        }

        // Variante 2
        // int i = 0;
        // for(Node cur = list.head; cur != null; cur = cur.next){
        //     arr[i] = cur.data;
        //     i++;
        // }

        return arr;
    }

    public static SharePrice[] filter(SharePrice[] s, String k) {
        // count ellements that fit k
        int cnt = 0;
        for (int i = 0; i < s.length; i++) {
            if(s[i].name.equals(k) || s[i].shortName.equals(k))
                cnt++;
        }

        // add elements to new array
        SharePrice[] filtered = new SharePrice[cnt];
        int i2 = 0;
        for (int i = 0; i < s.length; i++) {
            if(s[i].name.equals(k) || s[i].shortName.equals(k)) {
                filtered[i2] = s[i];
                i2++;
            }
        }
        return filtered;
    }

    public static void sort(SharePrice[] shares) {
        /* i is the first idx of unsorted partition */
        for (int i = 1; i < shares.length; i++) {
            int j = i;
            /* tmp holds value of next element to insert */
            SharePrice tmp = shares[i];
            /* find correct position for tmp */
            // use compare function to check if it has to be swapped
            while (j > 0 && compare(tmp, shares[j - 1]) < 0) {
                /* on the way there shift right */
                shares[j] = shares[j - 1];
                j--;
            }
            shares[j] = tmp;
        }
    }

    public static int compare(SharePrice s1, SharePrice s2){
        int year = Integer.compare(s1.date.year, s2.date.year);
        if (year != 0)
            return year;

        int month = Integer.compare(s1.date.month, s2.date.month);
        if (month != 0)
            return month;

        return Integer.compare(s1.date.day, s2.date.day);
    }

    public static int maxVolume(SharePrice[] s, String k) {
        int idx = -1;
        int maxVolume = -1;
        for (int i = 0; i < s.length; i++) {
            if((s[i].name.equals(k) || s[i].shortName.equals(k)) && s[i].volume > maxVolume) {
                maxVolume = s[i].volume;
                idx = i;
            }
        }
        return idx;
    }

    public static int length(SharePriceList list){
        int cnt = 0;
        for(Node cur = list.head; cur != null; cur = cur.next){
            cnt++;
        }
        return cnt;
    }

    public static SharePrice scanSharePrice(){
        SharePrice sp = new SharePrice();
        System.out.print("Name : ");
        sp.name = sc.nextLine();
        System.out.print("Kürzel : ");
        sp.shortName = sc.nextLine();
        while(sp.shortName.matches("[A-Z]{4}") == false){
            System.out.print("Kürzel: ");
            sp.shortName = sc.nextLine();
        }

        // schöne Variante
        System.out.print("Date (dd.mm.yyyy) : ");
        String[] date = sc.nextLine().split("\\.");
        sp.date.day = Integer.parseInt(date[0]);
        sp.date.month = Integer.parseInt(date[1]);
        sp.date.year = Integer.parseInt(date[2]);

        // einfache Variante
        // System.out.print("Tag: ");
        // sp.date.day = sc.nextInt();
        // System.out.print("Monat: ");
        // sp.date.month = sc.nextInt();
        // System.out.print("Jahr: ");
        // sp.date.year = sc.nextInt();

        System.out.print("Open: ");
        sp.open = sc.nextDouble();
        System.out.print("Close: ");
        sp.close = sc.nextDouble();
        System.out.print("High: ");
        sp.high = sc.nextDouble();
        System.out.print("Low: ");
        sp.low = sc.nextDouble();
        System.out.print("Volume: ");
        sp.volume = sc.nextInt();
        return sp;
    }

    public static void add(SharePriceList list, SharePrice s) {
        Node n = new Node();
        n.data = s;
        n.next = list.head;
        list.head = n;
    }

    // public static Node add(Node head, SharePrice s) {
    //     Node n = new Node();
    //     n.data = s;
    //     n.next = head;
    //     return n;
    // }

    public static SharePriceList createDemoDataList(){
        SharePriceList list = new SharePriceList();
        add(list, createSharePrice("Apple Inc.", "AAPL", 2019, 02, 21, 171.800003, 172.369995, 170.300003, 171.059998, 17249700));
        add(list, createSharePrice("Microsoft Corporation", "MSFT", 2019, 02, 11, 106.199997, 106.580002, 104.970001, 105.250000, 18914100));
        add(list, createSharePrice("Microsoft Corporation", "MSFT", 2019, 02, 14, 106.309998, 107.290001, 105.660004, 106.900002, 21784700));
        add(list, createSharePrice("Microsoft Corporation", "MSFT", 2019, 02, 15, 107.910004, 108.300003, 107.360001, 108.220001, 26606900));
        add(list, createSharePrice("Microsoft Corporation", "MSFT", 2019, 02, 20, 107.860001, 107.940002, 106.290001, 107.150002, 21607700));
        add(list, createSharePrice("Microsoft Corporation", "MSFT", 2019, 02, 21, 106.900002, 109.480003, 106.870003, 109.410004, 29063200));
        add(list, createSharePrice("Apple Inc.", "AAPL", 2019, 02, 15, 171.250000, 171.699997, 169.750000, 170.419998, 24626800));
        add(list, createSharePrice("Microsoft Corporation", "MSFT", 2019, 02, 27, 111.690002, 112.360001, 110.879997, 112.169998, 21487100));
        add(list, createSharePrice("Microsoft Corporation", "MSFT", 2019, 02, 12, 106.139999, 107.139999, 105.480003, 106.889999, 25056600));
        add(list, createSharePrice("Microsoft Corporation", "MSFT", 2019, 03, 07, 111.400002, 111.550003, 109.870003, 110.389999, 25339000));
        add(list, createSharePrice("Apple Inc.", "AAPL", 2019, 03, 05, 175.940002, 176.000000, 174.539993, 175.529999, 19737400));
        add(list, createSharePrice("Microsoft Corporation", "MSFT", 2019, 03, 11, 110.989998, 112.930000, 110.989998, 112.904999, 12513920));
        add(list, createSharePrice("Apple Inc.", "AAPL", 2019, 02, 11, 171.050003, 171.210007, 169.250000, 169.429993, 20993400));
        add(list, createSharePrice("Microsoft Corporation", "MSFT", 2019, 02, 25, 111.760002, 112.180000, 111.260002, 111.589996, 23750600));
        add(list, createSharePrice("Apple Inc.", "AAPL", 2019, 02, 12, 170.100006, 171.000000, 169.699997, 170.889999, 22283500));
        add(list, createSharePrice("Microsoft Corporation", "MSFT", 2019, 02, 13, 107.500000, 107.779999, 106.709999, 106.809998, 18394900));
        add(list, createSharePrice("Apple Inc.", "AAPL", 2019, 02, 13, 171.389999, 172.479996, 169.919998, 170.179993, 22490200));
        add(list, createSharePrice("Apple Inc.", "AAPL", 2019, 02, 14, 169.710007, 171.259995, 169.380005, 170.800003, 21835700));
        add(list, createSharePrice("Apple Inc.", "AAPL", 2019, 02, 25, 174.160004, 175.869995, 173.949997, 174.229996, 21873400));
        add(list, createSharePrice("Apple Inc.", "AAPL", 2019, 02, 19, 169.710007, 171.440002, 169.490005, 170.929993, 18972800));
        add(list, createSharePrice("Microsoft Corporation", "MSFT", 2019, 02, 28, 112.040001, 112.879997, 111.730003, 112.029999, 29083900));
        add(list, createSharePrice("Apple Inc.", "AAPL", 2019, 02, 20, 171.190002, 173.320007, 170.990005, 172.029999, 26114400));
        add(list, createSharePrice("Microsoft Corporation", "MSFT", 2019, 03, 04, 113.019997, 113.250000, 110.800003, 112.260002, 26608000));
        add(list, createSharePrice("Microsoft Corporation", "MSFT", 2019, 03, 06, 111.870003, 112.660004, 111.430000, 111.750000, 17687000));
        add(list, createSharePrice("Microsoft Corporation", "MSFT", 2019, 02, 19, 107.790001, 108.660004, 107.779999, 108.169998, 18038500));
        add(list, createSharePrice("Apple Inc.", "AAPL", 2019, 02, 22, 171.580002, 173.000000, 171.380005, 172.970001, 18913200));
        return list;
    }

    private static SharePrice createSharePrice(String name, String shortName, int year, int month, int day, double open, double high, double low, double close, int volume) {
        SharePrice sp = new SharePrice();
        sp.name = name;
        sp.shortName = shortName;
        sp.date.year = year;
        sp.date.month = month;
        sp.date.day = day;
        sp.open = open;
        sp.high = high;
        sp.low = low;
        sp.close = close;
        sp.volume = volume;
        return sp;
    }
}
