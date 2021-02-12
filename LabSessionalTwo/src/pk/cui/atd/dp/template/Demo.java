package pk.cui.atd.dp.template;

public class Demo {
	public static void main(String args[]) {
		System.out.println("\nBreath First Search");
		Graph g = new BFS();
		g.traverse(3);
		System.out.println("\nDepth First Search");
		Graph g1 = new DFS();
		g1.traverse(3);
	}
}
