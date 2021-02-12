package pk.cui.atd.dp.template;

import java.util.LinkedList;

public class GraphCreation {
	private int vertices;
	private LinkedList<Integer> adjacencyList[];
	public GraphCreation(int v) {
	this.vertices = v;
	adjacencyList = new LinkedList[vertices];
	for (int i = 0; i < vertices; ++i)
	adjacencyList[i] = new LinkedList<Integer>();
	}
	
	void addEdge(int source, int destination){
	adjacencyList[source].add(destination);
	}
	
	public int getVertices() {
	return vertices;
	}
	
	public LinkedList<Integer>[] getAdjacencyList() {
	return adjacencyList;
	}
}
