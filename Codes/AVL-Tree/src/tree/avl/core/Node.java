package tree.avl.core;

public class Node {

	int data;
	int height;
	Node left;
	Node right;
	
	public Node(int data)
	{
		super();
		this.data = data;
	}
	
	public int getData()
	{
		return data;
	}
	public int getHeight()
	{
		return height;
	}
	
	
	
}
