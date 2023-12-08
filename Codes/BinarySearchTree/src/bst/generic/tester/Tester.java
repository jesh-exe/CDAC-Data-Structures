package bst.generic.tester;

import bst.generic.core.BinarySearchTree;

public class Tester {

	public static void main(String[] args)
	{
		
		BinarySearchTree<Integer> bstInt = new BinarySearchTree<>();
		BinarySearchTree<Character> bstChar = new BinarySearchTree<>();
//		BinarySearchTree<String> bstString = new BinarySearchTree<>();
		/*
		 * bstChar.insert('J');//10 --> root bstChar.insert('E');//5
		 * bstChar.insert('O');//15 bstChar.insert('C');//3 bstChar.insert('G');//7
		 * bstChar.insert('Q');//17
		 * System.out.println("PreOrder Traversal of Characters");
		 * bstChar.printPreorder(); //10 5 3 7 15 17 ---> Preorder
		 */
		
		
		bstInt.insert(10);
		bstInt.insert(5);
		bstInt.insert(15);
		bstInt.insert(3);
		bstInt.insert(7);
		bstInt.insert(17);
		
		System.out.println("   Binary Search Tree  \n"
						 + "                       \n"
						 + "          10           \n"
				         + "        /    \\         \n"
				         + "       5     15        \n"
				         + "     /   \\     \\       \n"
				         + "    3     7    17      \n");
		
		System.out.println("\nPreOrder Traversal of Integers");
		bstInt.printPreorder();
		System.out.println("\nInOrder Traversal of Integers");
		bstInt.printInorder();
		System.out.println("\nPostOrder Traversal of Integers");
		bstInt.printPostorder();
		System.out.println("\nLevelOrder Traversal of Integers");
		bstInt.printLevelOrder();
		
	}
	
}
