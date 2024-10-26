package at.altin.strukturierteprogrammierung.class4_strings;

import java.util.Scanner;

public class Isbn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter ISBN: ");
        String isbn = sc.next();
        System.out.printf("valid pattern: %s\n", validatePattern(isbn));
        System.out.printf("valid checkDigit: %s\n", validateCheckDigit(isbn));
        sc.close();
    }

    public static boolean validatePattern(String s) {
        if (s != null && s.matches("[0-9]{13}"))
            return true;
        return false;
    }

    public static boolean validateCheckDigit(String s) {

        if (validatePattern(s) == false)
            return false;

        //loop add "odd" place in one, even in other
        int odd=0;
        int even=0;

        for (int i=0; i<12;i++){
            if (i%2==0)
                odd += Integer.parseInt(s.substring(i, i+1));

            else
                even += Integer.parseInt(s.substring(i, i+1));
        }
        //do calculation
        int result=(10-(odd+3*even)%10)%10;

        //lastDigit - checknumber
        int check=Integer.parseInt(s.substring(12, 13));

        return result == check;



        //below find the elegant solution using char Array (for advanced students)
			/*
			char[] c = s.toCharArray();
			for (int i=0; i<c.length; i++)
				c[i] -= '0';
			int n = (10-(c[0]+c[2]+c[4]+c[6]+c[8]+c[10] + 3*(c[1]+c[3]+c[5]+c[7]+c[9]+c[11])) %10) %10;


			if (n != c[12]) System.out.print( "charr"+false);
			return true;
			*/
    }
}
