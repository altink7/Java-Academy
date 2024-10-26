package at.altin.strukturierteprogrammierung.class3_iteration;

public class Hour {
    public static void main (String[] args) {
        for(int h = 0; h < 24; h++) {
            for(int min = 0; min < 60; min++) {
                System.out.printf("%02d:%02d\n", h, min);
            }
        }
    }
}
