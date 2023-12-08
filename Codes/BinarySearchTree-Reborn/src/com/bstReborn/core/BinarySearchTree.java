package com.bstReborn.core;


public class BinarySearchTree {

	Node root;
	
	public BinarySearchTree()
	{
		root = null;
	}
	
	public void insert(int value)
	{
		root = insert(root,new Node(value));
	}
	
	public void insert(int[] arr)
	{
		for(int itr : arr)
			root = insert(root, new Node(itr));
		
	}
	
	private Node insert(Node currentNode, Node newNode)
	{
		if(currentNode == null)
		{
			return newNode;
		}
		
		if(currentNode.data > newNode.data )
			currentNode.left = insert(currentNode.left, newNode);
		
		if(currentNode.data < newNode.data )
			currentNode.right = insert(currentNode.right, newNode);
		
		currentNode.height = Math.max(height(currentNode.left), height(currentNode.right)) + 1;
		
		return currentNode;
		
	}
	
	public int height()
	{
		return height(root);
	}
	
	public int height(Node node)
	{
		if(node == null)
			return -1;
		
		return node.height;
	}
	
	public String balanced()
	{
		return balanced(root) ? "Balanced!" : "Not Balanced!";
	}
	
	public boolean balanced(Node node)
	{
		if(node == null)
			return true;
		
		return (Math.abs(height(node.left) - height(node.right)) <= 1) && balanced(node.left) && balanced(node.right);
	}
	
	
	public boolean isEmpty()
	{
		return root == null ? true : false;
	}
	
	public void display()
	{
		display(root,"Root = ");
	}
	
	private void display(Node node, String details)
	{
		if(node == null)
			return;
		
		System.out.println(details+node.data);
		display(node.left, "Left Child of "+node.data+": ");
		display(node.right, "Right Child of "+node.data+": ");
		
	}
	
}
