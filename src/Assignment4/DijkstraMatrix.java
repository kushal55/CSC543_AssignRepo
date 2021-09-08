package Assignment4;
import java.util.*;

public class DijkstraMatrix {

	class Edge
	{
	    int source, dest, weight;
	 
	    public Edge(int source, int dest, int weight)
	    {
	        this.source = source;
	        this.dest = dest;
	        this.weight = weight;
	    }
	}
	 
	
	class Node
	{
	    int vertex, weight;
	 
	    public Node(int vertex, int weight)
	    {
	        this.vertex = vertex;
	        this.weight = weight;
	    }
	}
	 
	
	class Graph
	{
	    
	    List<List<Edge>> adjList = null;
	 
	    
	    Graph(List<Edge> edges, int N)
	    {
	        adjList = new ArrayList<>();
	 
	        for (int i = 0; i < N; i++) {
	            adjList.add(new ArrayList<>());
	        }
	 
	        // add edges to the undirected graph
	        for (Edge edge: edges) {
	            adjList.get(edge.source).add(edge);
	        }
	    }
	}
	 
	class Main
	{
	    private static void getRoute(int[] prev, int i, List<Integer> route)
	    {
	        if (i >= 0)
	        {
	            getRoute(prev, prev[i], route);
	            route.add(i);
	        }
	    }
	 
	    
	    public static void findShortestPaths(Graph graph, int source, int N)
	    {
	        
	        PriorityQueue<Node> minHeap;
	        minHeap = new PriorityQueue<>(Comparator.comparingInt(node -> node.weight));
	        minHeap.add(new Node(source, 0));
	 
	        
	        List<Integer> dist;
	        dist = new ArrayList<>(Collections.nCopies(N, Integer.MAX_VALUE));
	 
	        
	        dist.set(source, 0);
	 
	        
	        boolean[] done = new boolean[N];
	        done[source] = true;
	 
	       
	        int[] prev = new int[N];
	        prev[source] = -1;
	 
	        List<Integer> route = new ArrayList<>();
	 
	        
	        while (!minHeap.isEmpty())
	        {
	            
	            Node node = minHeap.poll();
	 
	            
	            int u = node.vertex;
	 
	            
	            for (Edge edge: graph.adjList.get(u))
	            {
	                int v = edge.dest;
	                int weight = edge.weight;
	 
	                
	                if (!done[v] && (dist.get(u) + weight) < dist.get(v))
	                {
	                    dist.set(v, dist.get(u) + weight);
	                    prev[v] = u;
	                    minHeap.add(new Node(v, dist.get(v)));
	                }
	            }
	 
	            
	            done[u] = true;
	        }
	 
	        for (int i = 1; i < N; i++)
	        {
	            if (i != source && dist.get(i) != Integer.MAX_VALUE)
	            {
	                getRoute(prev, i, route);
	                System.out.printf("Path (%d —> %d): Minimum cost = %d, Route = %s\n",
	                                source, i, dist.get(i), route);
	                route.clear();
	            }
	        }
	    }
	 
	    public static void main(String[] args)
	    {
	        
	        List<Edge> edges = Arrays.asList(
	                new Edge(0, 1, 10), new Edge(0, 4, 3),
	                new Edge(1, 2, 2), new Edge(1, 4, 4),
	                new Edge(2, 3, 9), new Edge(3, 2, 7),
	                new Edge(4, 1, 1), new Edge(4, 2, 8),
	                new Edge(4, 3, 2)
	        );
	 
	        
	        final int N = 5;
	 
	        
	        Graph graph = new Graph(edges, N);
	 
	        int source = 0;
	        findShortestPaths(graph, source, N);
	    }
	}
}



