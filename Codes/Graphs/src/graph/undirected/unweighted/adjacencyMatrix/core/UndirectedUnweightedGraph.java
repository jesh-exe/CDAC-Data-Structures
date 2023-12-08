package graph.undirected.unweighted.adjacencyMatrix.core;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class UndirectedUnweightedGraph {

	private int[][] arr;
	private int vertices;

	public UndirectedUnweightedGraph(int vertices)
	{
		this.vertices = vertices;
		arr = new int[vertices][vertices];
	}

	public void createGraph()
	{
		arr[0][2] = 1;
		arr[1][2] = 1;
		arr[1][3] = 1;
		arr[2][1] = 1;
		arr[2][3] = 1;
		arr[3][1] = 1;
		arr[3][2] = 1;
		System.out.println("Graph Created!");
	}

	public void createGraph(int src,int dest,int weight) throws GraphCustomException
	{
		if(src>=vertices || dest>=vertices)
			throw new GraphCustomException("No such Vertex Exists!");
		if(weight==0)
			throw new GraphCustomException("Weight cannot be 0!");
		
		arr[src][dest] = weight;
	}

	public void displayNeighbours(int vertex)
	{
		System.out.println("\nVertex: "+vertex);
		for (int i = 0; i < vertices; i++)
		{
			if (arr[vertex][i] != 0) 
				System.out.println("N = "+i+", W = "+arr[vertex][i]);
		}
	}

	public void displayBFS()
	{
		Set<Integer> set= new HashSet<Integer>();
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(arr[0][0]);
		set.add(arr[0][0]);
		
		while(!queue.isEmpty())
		{
			int vertex = queue.poll();
			System.out.print(vertex+" ");
			
			for(int i=0;i<vertices;i++)
			{
				if(arr[vertex][i]==1)
				{
					if(!set.contains(i))
					{
						queue.add(i);
						set.add(i);
					}
				}
			}
		}
	}
}







