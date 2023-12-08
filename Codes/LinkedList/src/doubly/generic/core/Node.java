package doubly.generic.core;

public class Node<E> {

	E data;
	Node<E> prev;
	Node<E> next;
	
	public Node(E data)
	{
		this.data = data;
		this.prev = null;
		this.next = null;
	}
	
	
}
