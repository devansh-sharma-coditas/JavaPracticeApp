package org.example.impl.graph;

import com.sun.org.slf4j.internal.LoggerFactory;

import java.util.*;
public class Graph {
    int nodes ;
    int edges ;
    static Scanner scanner = new Scanner(System.in);

    // creating adjancy matrix
    void createAdjacencyMatrix(int nodes, int edges) {

        int[][] matrix = new int[nodes+1][nodes+1];
        for (int i =0 ; i < edges ; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            matrix[x][y] = 1 ;
            matrix[y][x] = 1 ;
        }
        for (int[] row : matrix){
            for(Integer item : row){
                System.out.print(item + "  ");
            }
            System.out.println();
        }
    }

    void createAdjacencyList(int nodes, int edges) {
        Map<Integer , List<Integer>> adjacencyMap = new HashMap<>();
        List<Integer > list = new ArrayList<>();

    }

    public static List<Integer> bfsTraversal(int V, List<List<Integer>> adj){
        // Code here
        int[] visited = new int[V];
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();

        // setting initial in queue
        queue.add(0) ;
        visited[0] = 1 ;

        while(!queue.isEmpty()){
            int numberNode = queue.remove();
            result.add(numberNode);
            if(adj.get(numberNode) != null) {
                for (Integer item : adj.get(numberNode)) {
                    if (visited[item] == 0) {
                        queue.add(item);
                        visited[item] = 1;
                    }
                }
            }
        }
        return result;

    }
}
class Runner{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<List<Integer>> adj = new ArrayList<>(4);
        adj.get(0).add(10);
        System.out.println(adj.get(0));

//        List<Integer> integers = Graph.bfsTraversal(4, adj);
//        System.out.println(integers);
//        Graph graph = new Graph();
//        System.out.println("Enter number of Nodes : ");
//        graph.nodes = scanner.nextInt();
//
//        System.out.println("Enter number of Edges : ");
//        graph.edges = scanner.nextInt();
//
//        graph.createAdjacencyMatrix(graph.nodes , graph.edges);
//        graph.createAdjacencyList(graph.nodes , graph.edges);
    }


}