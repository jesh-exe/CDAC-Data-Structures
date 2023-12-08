package tree.avl.tester;

import tree.avl.core.AVL;

public class Tester {

	public static void main(String[] args)
	{
		AVL avlTree = new AVL();
		avlTree.insert(1);
		avlTree.insert(2);
		avlTree.insert(3);
		avlTree.insert(4);
		avlTree.insert(5);
		
		avlTree.display();
		System.out.println(avlTree.balanced());
	}
}
