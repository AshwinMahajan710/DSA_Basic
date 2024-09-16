package Graph;

import java.util.ArrayList;

public class Graph1 {
    int adjMat[][];
    ArrayList<ArrayList<Integer>> adjList;

    Graph1(int nodes) {
        adjMat = new int[nodes][nodes];
        adjList = new ArrayList<>();

        // Initialize inner arraylist for each index
        for (int i = 0; i < nodes; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdgesInMatrix(int edges[][], boolean isDirected) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            // directed
            if (isDirected)
                adjMat[u][v] = 1;

            // undirected
            else {
                adjMat[u][v] = 1;
                adjMat[v][u] = 1;
            }
        }
    }

    public void addEdgesInList(int edges[][], boolean isDirected) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            // directed
            if (isDirected) {
                adjList.get(u).add(v);
            }

            // undirected
            else {
                adjList.get(u).add(v);
                adjList.get(v).add(u);
            }
        }
    }

    public void printMat() {
        for (int[] row : adjMat) {
            System.out.println();
            for (int col : row) {
                System.out.print(" " + col);
            }
        }
    }

    public static void main(String[] args) {
        int edges[][] = { { 0, 2 }, { 1, 2 }, { 3, 4 }, { 0, 4 } };
        int nodes = 5;
        Graph1 graph = new Graph1(nodes);
        graph.addEdgesInMatrix(edges, false);
        System.out.print("UnDirected graph given by :- ");
        graph.printMat();
    }
}
