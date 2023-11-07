package at.altin.formatedBsp;

public class FormattedBspAll {


    public static void main(String[] args) {
        //numbers
        byte b = 12;
        int i = 128;
        float f = 12.12f;
        double d = 12.12;

        // buchstaben
        char c = 'a';
        char cAsNumber = 65;
        String s = "65";

        // alles zu String
        String parsedInt = String.valueOf(i);

        //string zu integer
        int parsedString = Integer.parseInt(s);

        float parsedFloat = Float.parseFloat(s);
    }
}
