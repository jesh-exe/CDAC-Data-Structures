package binaryTree.tester;

import binaryTree.core.BinaryTree;
import binaryTree.core.Node;

public class Tester {

	public static void main(String[] args)
	{
		System.out.println("   Binary Search Tree  \n"
				 + "                       \n"
				 + "          10           \n"
		         + "        /    \\         \n"
		         + "       5     15        \n"
		         + "     /   \\     \\       \n"
		         + "    3     7    17      \n");
		
		BinaryTree treeRoot = new BinaryTree();
		Node root =  treeRoot.buildtree();
		treeRoot.display(root); 	//10 5 3 7 15 17 
	}
	
}
