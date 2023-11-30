package at.altin.it.academy.algorithms;

import java.util.*;

public class DijkstraAlgorithm {

    /**
     * Represents a graph using an adjacency list.
     */
    static class Graph {
        Map<Integer, Map<Integer, Integer>> adjacencyList;

        Graph() {
            adjacencyList = new HashMap<>();
        }

        void addEdge(int source, int destination, int weight) {
            adjacencyList.computeIfAbsent(source, k -> new HashMap<>()).put(destination, weight);
            adjacencyList.computeIfAbsent(destination, k -> new HashMap<>()).put(source, weight);
        }
    }

    /**
     * Finds the shortest paths from a source node to all other nodes using Dijkstra's algorithm.
     *
     * @param graph    The graph represented as an adjacency list.
     * @param source   The source node.
     * @param distance An array to store the shortest distances from the source node.
     */
    static void dijkstra(Graph graph, int source, int[] distance) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        Set<Integer> visited = new HashSet<>();

        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        minHeap.offer(new int[]{source, 0});

        while (!minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            int currentNode = current[0];

            if (visited.contains(currentNode)) {
                continue;
            }

            visited.add(currentNode);

            for (Map.Entry<Integer, Integer> neighbor : graph.adjacencyList.getOrDefault(currentNode, Collections.emptyMap()).entrySet()) {
                int nextNode = neighbor.getKey();
                int edgeWeight = neighbor.getValue();
                int newDistance = distance[currentNode] + edgeWeight;

                if (newDistance < distance[nextNode]) {
                    distance[nextNode] = newDistance;
                    minHeap.offer(new int[]{nextNode, newDistance});
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 7, 8);
        graph.addEdge(1, 2, 8);
        graph.addEdge(1, 7, 11);
        graph.addEdge(2, 3, 7);
        graph.addEdge(2, 8, 2);
        graph.addEdge(2, 5, 4);
        graph.addEdge(3, 4, 9);
        graph.addEdge(3, 5, 14);
        graph.addEdge(4, 5, 10);
        graph.addEdge(5, 6, 2);
        graph.addEdge(6, 7, 1);
        graph.addEdge(6, 8, 6);
        graph.addEdge(7, 8, 7);

        int[] distance = new int[9];
        int sourceNode = 0;

        dijkstra(graph, sourceNode, distance);

        System.out.println("Shortest distances from node " + sourceNode + " to all other nodes:");
        for (int i = 0; i < distance.length; i++) {
            System.out.println("To node " + i + ": " + distance[i]);
        }
    }
}

