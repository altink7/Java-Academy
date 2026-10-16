package at.altin.fh.eww2026;

/**
 * The Main class serves as the entry point for the application.
 * It contains the main method which executes when the program starts.
 */
public class HelloWorld {

    public static void main(String[] args) {
        String name = "Jakob";
        char gender = 'm';
        int age = 20;
        float height = 1.75f;
        float temperature = 19.2f;

        // das ist ein Kommentar
        //

        /*
        hier kommt was drin
         */
        System.out.println("\"Hello World\"");
        System.out.println("Hello World");

        System.out.println("Hello EWW!");


        // 2. Printf simple
        System.out.printf("Hello, \n\n");
        System.out.printf("Jakob");
        System.out.println("20%%\n");
        System.out.printf("''");
        System.out.println(0);


        // 3. Printf (formatted date, strings, etc.)
        System.out.printf("Name: %s, Gender: %c, Age: %d, Height: %.1f\n",name, gender, age, height);
        System.out.printf("Name: %s, Gender: %c, Age: %d, Height: %.2f\n",name, gender, age, height);

        // Today's date
        System.out.printf("Thursday, 15.10.2026\n");
        System.out.printf("Thursday, %d.%d.%d\n", 15, 10, 2026);
        // CR7 + Year
        /*
        placeholder output
        %5d minimum width 5 (" 123")
        %05d leading zeros (“00123”)
        %+5d print sign (" +123")
         */
        System.out.printf("Thursday, 07.07.2026\n");
        System.out.printf("Thursday, %+03d.%02d.%d\n", 7, 7, 2026);


        // 4. String formating options

        // 4a. Side quest
        System.out.printf("\t* N\n");
        System.out.printf("    * N\n");

        System.out.printf("(%.1f)\n", temperature);
        System.out.printf("(%f)\n", temperature);
        System.out.printf("(%.2f)\n", temperature);
        System.out.printf("(\t  %.2f)\n", temperature);
        System.out.printf("(%+010.2f)\n", temperature);

        System.out.println("--------------------");

        //AirTicketFormat
        //Write a program AirTicketFormat that creates an airline ticket style formatting of name
        //and salutation.
        //The format is <NAME><FIRSTNAME><SALUTATION> (without brackets) and all capitals
        //        where
        // * NAME is at most 11 charcters wide
        // * FIRSTNAME is at most 2 characters wide
        // * SALUTATION is either MRS or MR
        //Modify the format strings of this code
        // * System.out.printf("%S%S%S\n", "Mandl", "Thomas", "MR");
        // * System.out.printf("%S%S%S\n", "Hinteroberegginger", "Yolanda", "MRS");
        //to produce:
        //        MANDLTHMR
        //        HINTEROBEREYOMRS

        System.out.printf("%.11S%.2S%S\n", "Mandl", "Thomas", "MR");
        System.out.printf("%.11S%.2S%S\n", "Hinteroberegginger", "Yolanda", "MRS");

    }
}