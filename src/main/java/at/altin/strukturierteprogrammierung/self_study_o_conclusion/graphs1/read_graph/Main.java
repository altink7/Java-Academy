package at.altin.strukturierteprogrammierung.self_study_o_conclusion.graphs1.read_graph;

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

        writegraph(graph);

        sc.close();

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
