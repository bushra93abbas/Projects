package Graphs;


//Depth First Search (DFS)
//
//        The DFS algorithm is a recursive algorithm that uses the idea of backtracking. It involves exhaustive searches of all the nodes by going ahead, if possible, else by backtracking.
//
//        Here, the word backtrack means that when you are moving forward and there are no more nodes along the current path, you move backwards on the same path to find nodes to traverse. All the nodes will be visited on the current path till all the unvisited nodes have been traversed after which the next path will be selected.
//
//        This recursive nature of DFS can be implemented using stacks. The basic idea is as follows:
//        Pick a starting node and push all its adjacent nodes into a stack.
//        Pop a node from stack to select the next node to visit and push all its adjacent nodes into a stack.
//        Repeat this process until the stack is empty. However, ensure that the nodes that are visited are marked. This will prevent you from visiting the same node more than once. If you do not mark the nodes that are visited and you visit the same node more than once, you may end up in an infinite loop.
//
//        Pseudocode
//
//        DFS-iterative (G, s):                                   //Where G is graph and s is source vertex
//        let S be stack
//        S.push( s )            //Inserting s in stack
//        mark s as visited.
//        while ( S is not empty):
//        //Pop a vertex from stack to visit next
//        v  =  S.top( )
//        S.pop( )
//        //Push all the neighbours of v in stack that are not visited
//        for all neighbours w of v in Graph G:
//        if w is not visited :
//        S.push( w )
//        mark w as visited
//
//
//        DFS-recursive(G, s):
//        mark s as visited
//        for all neighbours w of s in Graph G:
//        if w is not visited:
//        DFS-recursive(G, w)
// Java program to print DFS traversal from a given given graph
import java.io.*;
import java.util.*;

// This class represents a directed graph using adjacency list
// representation
class DFS
{
    private int V; // No. of vertices

    // Array of lists for Adjacency List Representation
    private LinkedList<Integer> adj[];

    // Constructor
    DFS(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    //Function to add an edge into the graph
    void addEdge(int v, int w)
    {
        adj[v].add(w); // Add w to v's list.
    }

    // A function used by DFS
    void DFSUtil(int v,boolean visited[])
    {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v+" ");

        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n,visited);
        }
    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    void DFS()
    {
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V];

        // Call the recursive helper function to print DFS traversal
        // starting from all vertices one by one
        for (int i=0; i<V; ++i)
            if (visited[i] == false)
                DFSUtil(i, visited);
    }

    public static void main(String args[])
    {
        DFS g = new DFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal");

        g.DFS();
    }
}
// This code is contributed by Aakash Hasija
