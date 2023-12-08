package com.bstReborn.tester;

import com.bstReborn.core.BinarySearchTree;

public class Tester {

	public static void main(String[] args)
	{
		BinarySearchTree bstInt = new BinarySearchTree();
		
		int arr[] = {10,5,15,3,7,17};
		int sortedArr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		bstInt.insert(arr);
		
		System.out.println("   Binary Search Tree  \n"
						 + "                       \n"
						 + "          10           \n"
				         + "        /    \\         \n"
				         + "       5     15        \n"
				         + "     /   \\     \\       \n"
				         + "    3     7    17      \n");
		
		System.out.println();
		bstInt.display();
		
		System.out.println(bstInt.height());
		System.out.println(bstInt.balanced());
	}
	
}
