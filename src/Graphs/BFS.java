//Graph traversals
//
//        Graph traversal means visiting every vertex and edge exactly once in a well-defined order.
//        While using certain graph algorithms, you must ensure that each vertex of the graph is visited exactly once.
//        The order in which the vertices are visited are important and may depend upon the algorithm or question that you are solving.
//
//        During a traversal, it is important that you track which vertices have been visited.
//        The most common way of tracking vertices is to mark them.
//
//        Breadth First Search (BFS)
//
//        There are many ways to traverse graphs. BFS is the most commonly used approach.
//
//        BFS is a traversing algorithm where you should start traversing from a selected node
//        (source or starting node) and traverse the graph layerwise thus exploring the neighbour nodes
//        (nodes which are directly connected to source node). You must then move towards the next-level neighbour nodes.
//
//        As the name BFS suggests, you are required to traverse the graph breadthwise as follows:
//
//        First move horizontally and visit all the nodes of the current layer
//        Move to the next layer


package Graphs;

import java.util.Iterator;
import java.util.LinkedList;

class BFS
{
    private int noOfVertex;
    private LinkedList<Integer> adjList[];


    BFS(int v)
    {
        noOfVertex = v;
        adjList = new LinkedList[v];

        for (int i=0; i<v; ++i)
            adjList[i] = new LinkedList();
    }


    void addEdge(int v,int w)
    {
       LinkedList list = adjList[v];
        list.add(w);
    }

       // prints Graphs.BFS traversal from a given source s
    void BFSTraversals(int s)
    {
        boolean visited[] = new boolean[noOfVertex];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it .
        visited[s]=true;
        queue.add(s);

        while (queue.size() != 0)
        {
            s = queue.poll();
            System.out.print(s+" ");

            // Get all  neighbouring vertices of the dequeued vertex . If an adjacent vertex has not been visited, then mark it visited and enqueue it
            Iterator<Integer> i = adjList[s].iterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
}
    public static void main(String args[])
    {
        BFS g = new BFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.BFSTraversals(2);
    }


}


