package graph.undirected.unweighted.adjacencyList.tester;

import graph.undirected.unweighted.adjacencyList.core.UndirectedUnweightedGraph;

public class Tester {
	
	public static void main(String[] args)
	{
		UndirectedUnweightedGraph graph = new UndirectedUnweightedGraph(7);
		
		/*
		 * 
		 *            1 -- 3
		 * 			 /     | \
		 * 			0      |  5 -- 6
		 *           \     | /
		 *            2 -- 4
		 * 
		 */
		
		graph.createGraph();
		System.out.print("BFS: ");
		graph.displayBFS();
		System.out.println();
		System.out.print("DFS: ");
		graph.displayDFS();
	}

}
