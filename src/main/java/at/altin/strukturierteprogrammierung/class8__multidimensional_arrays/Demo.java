package at.altin.strukturierteprogrammierung.class8__multidimensional_arrays;

public class Demo {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        print(matrix);
    }

    private static void print(int[][] matrix) {
        String text = "";
        for(int row=0; row < matrix.length; row++) {
            for(int column=0; column < matrix[row].length; column++) {
                text += matrix[row][column] + " ";
            }
            text += "\n";
        }

        System.out.print(text);
    }
}
