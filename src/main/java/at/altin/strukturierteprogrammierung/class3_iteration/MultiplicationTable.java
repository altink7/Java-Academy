package at.altin.strukturierteprogrammierung.class3_iteration;

public class MultiplicationTable {
    public static void main (String[] args) {
        for(int z = 1; z <= 20; z++) {
            for(int s = 1; s <= 20; s++) {
                System.out.printf("%3d ", z * s);
            }
            System.out.println();
        }
    }
}
