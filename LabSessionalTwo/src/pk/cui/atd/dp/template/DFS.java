package pk.cui.atd.dp.template;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS extends Graph{
	private int V; // No. of vertices

	// Array of lists for 
	// Adjacency List Representation
	private LinkedList<Integer> adj[];

	// Constructor
	@SuppressWarnings("unchecked") DFS()
	{
		super();
		int v=super.graph.getVertices();
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList();
	}

	// Function to add an edge into the graph
	void addEdge(int v, int w)
	{
		adj[v].add(w); // Add w to v's list.
	}

	// A function used by DFS
	void DFSUtil(int v, boolean visited[])
	{
		// Mark the current node as visited and print it
		visited[v] = true;
		System.out.print(v + " ");

		// Recur for all the vertices adjacent to this
		// vertex
		Iterator<Integer> i = adj[v].listIterator();
		while (i.hasNext()) 
		{
			int n = i.next();
			if (!visited[n])
				DFSUtil(n, visited);
		}
	}

	// The function to do DFS traversal.
	// It uses recursive
	// DFSUtil()
	

	@Override
	public LinkedList<Integer> traverseGraph(int start) {
		// Mark all the vertices as 
				// not visited(set as
				// false by default in java)
				boolean visited[] = new boolean[V];

				// Call the recursive helper 
				// function to print DFS
				// traversal
				DFSUtil(start, visited);
		return null;
	}
}
