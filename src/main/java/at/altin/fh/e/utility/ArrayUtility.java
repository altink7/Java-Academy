package at.altin.fh.e.utility;

import java.util.Arrays;

public class ArrayUtility {

    public static void main(String[] args) {
        int[] original = new int[5];


        original = extracted(original, 3);

        // mit Arrays.fill wird das ganze array mit val befuellt
        Arrays.fill(original,1);

        //mit Collections Utils kann man auch verschiedene implementierungen benutzen
        // um zu reversen und mehr (fuer Listen nur)...

        // Utility class -> private Constructor -> kein new UtilityClass möglich

        System.out.println(Arrays.toString(original));

    }

    /**
     *
     * @param original das alte Array
     * @param newValues um wieviele neue Stellen es sich erweitert
     * @return das neue Array
     */
    private static int[] extracted(int[] original, int newValues) {
        return Arrays.copyOf(original, original.length + newValues);
    }
}
