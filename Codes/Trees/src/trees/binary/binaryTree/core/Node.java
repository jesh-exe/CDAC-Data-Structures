package trees.binary.binaryTree.core;

public class Node<E extends Comparable<E>>{

	E data;
	Node<E> left;
	Node<E> right;
	public Node(E data)
	{
		super();
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
//	@Override
//	public int compareTo(Node<E> obj)
//	{
//		int i = 0;
//		if(this.data instanceof Integer)
//			i = ((Integer)this.data).compareTo(((Integer)obj.data));
//
//		if(this.data instanceof Long)
//			i = ((Long)this.data).compareTo(((Long)obj.data));
//		
//		if(this.data instanceof String)
//			i = ((String)this.data).compareTo(((String)obj.data));
//		
//		if(this.data instanceof Double)
//			i = ((Double)this.data).compareTo(((Double)obj.data));
//		
//		if(this.data instanceof Float)
//			i = ((Float)this.data).compareTo(((Float)obj.data));
//		
//		if(this.data instanceof Character)
//			i = ((Character)this.data).compareTo(((Character)obj.data));
//		
//		return i;
//	}
	
}
