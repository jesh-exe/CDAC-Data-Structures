package graph.undirected.unweighted.adjacencyList.core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class UndirectedUnweightedGraph {
	
	private int vertices;
	ArrayList<Edge> arr[];
	
	public UndirectedUnweightedGraph(int vertices)
	{
		this.vertices = vertices;
		arr = new ArrayList[vertices];
	}

	public void createGraph()
	{
		for(int i=0;i<vertices;i++)
		{
			arr[i] = new ArrayList<>();
		}
		
		arr[0].add(new Edge(0,1));
		arr[0].add(new Edge(0,2));
		
		arr[1].add(new Edge(1,0));
		arr[1].add(new Edge(1,3));
		
		arr[2].add(new Edge(2,0));
		arr[2].add(new Edge(2,4));
		
		arr[3].add(new Edge(3,1));
		arr[3].add(new Edge(3,4));
		arr[3].add(new Edge(3,5));
		
		arr[4].add(new Edge(4,2));
		arr[4].add(new Edge(4,3));
		arr[4].add(new Edge(4,5));

		arr[5].add(new Edge(5,3));
		arr[5].add(new Edge(5,4));
		arr[5].add(new Edge(5,6));
		
	}

	public void displayNeighbours(int vertex)
	{
		System.out.println("Neighbours of "+vertex+": ");
		for(int i=0;i<arr[vertex].size();i++)
		{
			System.out.print(arr[vertex].get(i).getDest()+" ");
		}
	}
	
	public void display()
	{
		for(int i=0;i<vertices;i++)
		{
			ArrayList<Edge> list= arr[i];
			System.out.println("\n\nVertex: "+list.get(0).getSrc());
			System.out.print("Neighbours: ");
			for(int j=0;j<list.size();j++)
			{
				System.out.print(list.get(j).getDest()+", ");
			}
		}
	}
	
	public void displayBFS()
	{
		Set<Integer> set= new HashSet<Integer>();
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(arr[0].get(0).getSrc());
		set.add(arr[0].get(0).getSrc());
		
		while(!queue.isEmpty())
		{
			int vertex=queue.poll();
			System.out.print(vertex+" ");
			for(Edge obj : arr[vertex])
			{
				int v = obj.getDest();
				if(!set.contains(v))
				{
					queue.add(v);
					set.add(v);
				}
			}
		}
		
	}
	
	public void displayDFS()
	{
		Set<Integer> set = new HashSet<Integer>();
		dfs(arr, arr[0].get(0).getSrc(), set);
	}
	
	private void dfs(ArrayList<Edge> arr[],int visited,Set<Integer> set)
	{
		System.out.print(visited+" ");
		set.add(visited);
		for(Edge obj : arr[visited])
		{
			int vertex = obj.getDest();
			if(!set.contains(vertex))
			{
				dfs(arr, vertex, set);
			}
		}
	}

}
