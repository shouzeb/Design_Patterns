package pk.cui.atd.dp.template;

import java.util.ArrayList;
import java.util.LinkedList;


public abstract class Graph {

		
	protected GraphCreation graph ;
//hook method
	public Graph() {
		graph= new GraphCreation(4); 
		graph.addEdge(0, 1); 
		graph.addEdge(0, 2); 
		graph.addEdge(1, 2); 
		graph.addEdge(2, 0); 
		graph.addEdge(2, 3); 
		graph.addEdge(3, 3); 
		//System.out.println("Successfully Created");
	}
//concrete Method
	public void printTraversalOrder(LinkedList<Integer> order) {
		//System.out.println(order);
	}
//Abstract Method
	public abstract LinkedList<Integer> traverseGraph(int start);
	
//Template Method
	public final void traverse(int startingVertex){
		//hook method for creating a graph
		//createGraph();
		int start = startingVertex;
		if(start<0||start>graph.getVertices()-1)
		start = 0;
		//abstract method
		LinkedList<Integer> order = traverseGraph(start);
		//concrete method to print the graph
		printTraversalOrder(order);
		}
	
}
