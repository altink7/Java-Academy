package at.altin.strukturierteprogrammierung.self_study_o_conclusion.graphs1.shortest_path;

import java.util.Scanner;

public class Main {
    static final double oo = Double.POSITIVE_INFINITY;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[][] graph = new double[n][n];
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                graph[i][j] = oo;
            }
        }

        while (true){
            int n1 = sc.nextInt();
            if(n1 < 0 || n1 >= n)
                break;
            int n2 = sc.nextInt();
            double dist = sc.nextDouble();
            graph[n1][n2] = dist;
        }

        //writegraph(graph);

        int start = sc.nextInt();
        int[] preced = new int[n];
        double[] distance = new double[n];
        dijkstra(graph, preced, distance, start);

        int end = sc.nextInt();;
        int j = end;
        while (j != start) {
            System.out.printf("%c <- ", j+'A');
            j = preced[j];
        }
        System.out.printf("%c (%.1f)", start+'A', distance[end]);

        sc.close();

    }

    public static boolean allselected(int[] selected) {
        int i;
        for (i = 0; i < selected.length; i++)
            if (selected[i] == 0)
                return false;
        return true;
    }

    public static void dijkstra(double graph[][], int[] preced, double[] distance, int start) {
        //
        int[] finalG = new int[graph.length];

        int i, k = -1;
        double dc,smalldist, newdist;
        //init distances
        for (i = 0; i < distance.length; i++)
            distance[i] = oo;


        //init algo
        int current = start;            //select start
        finalG[current] = 1;    //set start final
        distance[current] = 0;        //distance 0 from start to start


        while (!allselected(finalG)) {
            smalldist = oo;
            dc = distance[current];

            for (i = 0; i < finalG.length; i++) {
                if (finalG[i] == 0) {
                    newdist = dc + graph[current][i];
                    if (newdist < distance[i]) {
                        distance[i] = newdist;
                        preced[i] = current;
                    }
                    if (distance[i] < smalldist) {
                        smalldist = distance[i];
                        k = i;
                    }
                }
            }
            current = k;
            finalG[current] = 1;
        }
    }

    public static void writegraph(double graph[][]) {

        System.out.printf("digraph mygraph {\n");
        System.out.printf("node [style = filled, color = black, fontcolor = white]\n");

        for (int i = 0; i < graph.length; i++)
            for (int j = 0; j < graph[i].length; j++)
                if (graph[i][j] != oo)
                    System.out.printf("    %c -> %c [label = %.1f]\n",
                            i + 'A', j + 'A', graph[i][j]);
        System.out.printf("}\n");

    }
}
