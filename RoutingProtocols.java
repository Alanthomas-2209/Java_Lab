package java_lab;

import java.util.HashMap;
import java.util.Map;

// Enum to represent the routing protocol type
enum RoutingProtocolType {
    RIP
}

// Interface for routing protocols
interface RoutingProtocol {
    void addRoute(String source, String destination, int cost);
    void removeRoute(String source, String destination);
    void printRoutingTable();
}

// Record representing the RIP (Routing Information Protocol) routing protocol
record RipRoutingProtocol() implements RoutingProtocol {
    private static Map<String, Map<String, Integer>> routingTable;

    public RipRoutingProtocol() {
        routingTable = new HashMap<>();
    }

    @Override
    public void addRoute(String source, String destination, int cost) {
        Map<String, Integer> routes = routingTable.getOrDefault(source, new HashMap<>());
        routes.put(destination, cost);
        routingTable.put(source, routes);
    }

    @Override
    public void removeRoute(String source, String destination) {
        if (routingTable.containsKey(source)) {
            Map<String, Integer> routes = routingTable.get(source);
            routes.remove(destination);
            if (routes.isEmpty()) {
                routingTable.remove(source);
            }
        }
    }

    @Override
    public void printRoutingTable() {
        for (String source : routingTable.keySet()) {
            System.out.println("Source: " + source);
            Map<String, Integer> routes = routingTable.get(source);
            for (String destination : routes.keySet()) {
                int cost = routes.get(destination);
                System.out.println("Destination: " + destination + ", Cost: " + cost);
            }
            System.out.println("--------------------");
        }
    }
}

public class RoutingProtocols {
    public static void main(String[] args) {
        RoutingProtocol routingProtocol = new RipRoutingProtocol();

        routingProtocol.addRoute("A", "B", 2);
        routingProtocol.addRoute("A", "C", 1);
        routingProtocol.addRoute("B", "A", 3);
        routingProtocol.addRoute("B", "C", 1);
        routingProtocol.addRoute("C", "A", 4);
        routingProtocol.addRoute("C", "B", 2);

        routingProtocol.printRoutingTable();

        routingProtocol.removeRoute("B", "C");
        routingProtocol.printRoutingTable();
    }
}
