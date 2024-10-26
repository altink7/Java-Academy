package at.altin.strukturierteprogrammierung.class14_graphs;

public class Dijkstra {

    static final double oo = Double.POSITIVE_INFINITY;

    public static void main(String[] args) {

        double[][] cost = { //
                { 0, 3, 6, 10, 1, oo, oo, oo, oo, oo }, // A
                { 3, 0, 2, oo, oo, 8, 6, oo, oo, oo }, // B
                { 6, 2, 0, 4, oo, oo, 3, oo, oo, oo }, // C
                { 10, oo, 4, 0, 10, oo, 1, 4, 1, oo }, // D
                { 1, oo, oo, 10, 0, oo, oo, oo, 10, oo }, // E
                { oo, 8, oo, oo, oo, 0, 3, oo, 5, oo }, // F
                { oo, 6, 3, 1, oo, 3, 0, 5, oo, 8 }, // G
                { oo, oo, oo, 4, oo, oo, 5, 0, 2, 2 }, // H
                { oo, oo, oo, 1, 10, oo, oo, 2, 0, 9 }, // I
                { oo, oo, oo, oo, oo, 5, 8, 2, 9, 0 }, // J
        };

        final int MAX = cost.length;
        int i;
        int[] preced = new int[MAX];
        double[] distance = new double[MAX];
        dijkstra(cost, preced, distance);

        System.out.printf("%5s %5s %10s\n", "Node", "Cost", "Predecessor");
        char node = 'A';
        for (i = 0; i < MAX; i++){
            char b = 'A';
            b += preced[i];
            System.out.printf("%5s %5.0f %10s\n", node, distance[i], b);
            node++;
        }

        int end = 9;
        int j = end;
        while (j != 0) {
            System.out.printf("%c <- ", j+'A');
            j = preced[j];
        }
        System.out.printf("%c\n", 0+'A');


    }

    public static void dijkstra(double cost[][], int[] preced, double[] distance) {
        int[] selected = new int[cost.length];
        int current = 0, i, k = -1;
        double dc, smalldist, newdist;
        for (i = 0; i < distance.length; i++) // init distances
            distance[i] = oo;
        // init algo
        selected[current] = 1; // first node is final
        distance[0] = 0; // distance to first node is 0
        current = 0; // selected/current node is first node ("A")
        while (!allselected(selected)) {
            smalldist = oo;
            dc = distance[current]; // cost to current node
            for (i = 0; i < selected.length; i++) {
                if (selected[i] == 0) { // search only non-final nodes
                    newdist = dc + cost[current][i];
                    if (newdist < distance[i]) {
                        distance[i] = newdist; // shorter path found
                        preced[i] = current; // via current node
                    }
                    if (distance[i] < smalldist) {
                        smalldist = distance[i]; // search for the next smallest
                        k = i;
                    }
                }
            }
            current = k; // select the next smallest
            selected[current] = 1; // mark it final
        }
    }

    public static boolean allselected(int[] selected) {
        int i;
        for (i = 0; i < selected.length; i++)
            if (selected[i] == 0)
                return false;
        return true;
    }
}
