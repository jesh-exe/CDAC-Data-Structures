package circular.generic.core;

public class Node<E>{

	E data;
	Node<E> next;
	
	public Node(E data)
	{
		this.data = data;
		this.next = null;
	}
	
}
