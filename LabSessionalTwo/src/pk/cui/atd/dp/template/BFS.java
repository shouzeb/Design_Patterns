package pk.cui.atd.dp.template;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class BFS extends Graph{
	
public BFS() {
		super();
	}
private int V = super.graph.getVertices();
	@Override
	public LinkedList<Integer> traverseGraph(int s) {
		{ 
			LinkedList<Integer> order=new LinkedList<>();
			// Mark all the vertices as not visited(By default 
			// set as false) 
			
			boolean visited[] = new boolean[V]; 

			// Create a queue for BFS 
			LinkedList<Integer> queue = new LinkedList<Integer>(); 

			// Mark the current node as visited and enqueue it 
			visited[s]=true; 
			queue.add(s); 

			while (queue.size() != 0) 
			{ 
				// Dequeue a vertex from queue and print it 
				s = queue.poll(); 
				System.out.print(s+" "); 

				// Get all adjacent vertices of the dequeued vertex s 
				// If a adjacent has not been visited, then mark it 
				// visited and enqueue it 
				Iterator<Integer> i = super.graph.getAdjacencyList()[s].listIterator(); 
				
				while (i.hasNext()) 
				{   
					int n = i.next(); 
					order.add(n);
					if (!visited[n]) 
					{   System.out.println(super.graph.getVertices());
						visited[n] = true; 
						queue.add(n); 
					} 
				} 
			}
		return order;
	}

}
	}
