package graph.undirected.unweighted.adjacencyList.core;

public class Edge {

	int src;
	int dest;
	public Edge(int src, int dest)
	{
		super();
		this.src = src;
		this.dest = dest;
	}
	public int getSrc()
	{
		return src;
	}
	public int getDest()
	{
		return dest;
	}
	
	
	
}
