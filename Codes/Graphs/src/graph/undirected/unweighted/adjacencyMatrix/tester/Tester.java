package graph.undirected.unweighted.adjacencyMatrix.tester;

import java.util.Scanner;

import graph.undirected.unweighted.adjacencyMatrix.core.UndirectedUnweightedGraph;

public class Tester {

	public static void main(String[] args)
	{
		UndirectedUnweightedGraph graph = new UndirectedUnweightedGraph(4);
		Scanner scanner = new Scanner(System.in);
		graph.createGraph();
		boolean exit = false;
		while (!exit)
		{
			System.out.println("\n1. Add New Edge\n"
								+"2. Find Neighbour by Vertex\n"
								+"3. Display All Vertex with Neighbours"
								+"0. EXIT");
			try
			{
				
				switch (scanner.nextInt())
				{
				case 1:
					System.out.print("Enter Source, Destination and Weight: ");
					graph.createGraph(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
					System.out.println("\nEdge Added!\n");
					break;
					
				case 2:
					System.out.print("Enter the Vertex: ");
					graph.displayNeighbours(scanner.nextInt());
					
				case 3:
					graph.displayBFS();
					break;
				default:
					break;
				}
				
			} catch (Exception errMsg)
			{
				System.out.println("\n" + errMsg.getMessage() + "\n");
			}
		}
	}
}
