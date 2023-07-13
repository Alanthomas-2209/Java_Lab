package java_lab.other;

import java.util.Arrays;

public class RIPProtocol {
    private static final int INFINITY = 9999;
    private int[][] graph;
    private int numNodes;

    public RIPProtocol(int[][] graph) {
        this.graph = graph;
        this.numNodes = graph.length;
    }

    public void run() {
        // Copy the graph into the distance table
        int[][] distanceTable = Arrays.copyOf(graph, numNodes);

        // Initialize the next hop table with self as the next hop for all nodes
        int[][] nextHopTable = new int[numNodes][numNodes];
        for (int i = 0; i < numNodes; i++) {
            Arrays.fill(nextHopTable[i], i);
        }

        boolean updated;
        int iteration = 1;

        // Run the distance vector algorithm until convergence
        do {
            updated = false;
            System.out.println("Iteration " + iteration++ + ":");

            for (int source = 0; source < numNodes; source++) {
                for (int destination = 0; destination < numNodes; destination++) {
                    if (source == destination) {
                        continue;
                    }

                    int minDistance = INFINITY;
                    int minNode = -1;

                    // Find the minimum distance and next hop for each destination
                    for (int intermediate = 0; intermediate < numNodes; intermediate++) {
                        int distance = distanceTable[source][intermediate] + distanceTable[intermediate][destination];

                        if (distance < minDistance) {
                            minDistance = distance;
                            minNode = intermediate;
                        }
                    }

                    // Update the distance and next hop if a shorter path is found
                    if (minDistance < distanceTable[source][destination]) {
                        distanceTable[source][destination] = minDistance;
                        nextHopTable[source][destination] = minNode;
                        updated = true;
                    }
                }
            }
        } while (updated);

        printRoutingTables(distanceTable, nextHopTable);
    }

    private void printRoutingTables(int[][] distanceTable, int[][] nextHopTable) {
        // Print the routing table for each node individually
        for (int node = 0; node < numNodes; node++) {
            System.out.println("Routing Table for Node " + node + ":");
            System.out.println("Destination  Cost  Next Hop");

            for (int destination = 0; destination < numNodes; destination++) {
                if (node == destination) {
                    continue;
                }

                int cost = distanceTable[node][destination];
                int nextHop = nextHopTable[node][destination];

                System.out.printf("%-12d %-5d %-8d%n", destination, cost, nextHop);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Define the network topology as a graph
        int[][] graph = {
                {0, 3, INFINITY, INFINITY, 2},
                {3, 0, 5, INFINITY, INFINITY},
                {INFINITY, 5, 0, 1, INFINITY},
                {INFINITY, INFINITY, 1, 0, 4},
                {2, INFINITY, INFINITY, 4, 0}
        };

        // Create an instance of RIPProtocol and run the algorithm
        RIPProtocol protocol = new RIPProtocol(graph);
        protocol.run();
    }
}
