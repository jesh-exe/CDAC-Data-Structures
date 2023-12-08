 package trees.binary.binaryTree.core;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class BinarySearchTree<E extends Comparable<E>> {

	Node<E> root;					//Root Node of the BST
	
	public BinarySearchTree()
	{
		root = null;
	}
	
	public void insert(E val)
	{
		Node<E> newNode = new Node<>(val);
		if(root==null)
			root = newNode;
		else
			insert(root, newNode);
	}
	
	
	/*
	 * 								INSERTION IN BINARY SEARCH TREE
	 * 
	 * 1. Firstly we will check the current NODE is greater or smaller than the NEW NODE
	 * 
	 * 2. If the CURRENT NODE is GREATER , then we need to go to LEFT of TREE, 
	 * 	  as left has smaller value to the root.
	 * 	  a. We will check whether the LEFT CHILD of CURR NODE is NULL?
	 *    b. If it is NULL, then we need to Place the NEW NODE to the LEFT of CURR NODE.
	 *    c. If it ain't NULL, then we will RECURSE the method by passing CURR NODE'S LEFT CHILD and NEW NODE
	 * 
	 * 3. If the CURRENT NODE is SMALLER , then we need to go to RIGHT of TREE, 
	 * 	  as right has greater value to the root.
	 * 	  a. We will check whether the RIGHT CHILD of CURR NODE is NULL?
	 * 	  b. If it is NULL, then we need to Place the NEW NODE to the RIGHT of CURR NODE.
	 *    c. If it ain't NULL, then we will RECURSE the method by passing CURR NODE's RIGHT CHILD and NEW NODE
	 */	  
	
	private void insert(Node<E> node, Node<E> newNode)
	{
		if(node.data.compareTo(newNode.data) >= 1)			//Compare the current node data with new node data
		{
			if(node.left == null)							// If left of CURRENT node is null, 
				node.left = newNode;						// Assign left of node to NEW NODE
			else
				insert(node.left,newNode);					//Recurse for the LEFT child.
		}
		else
		{
			if(node.right == null)
				node.right = newNode;
			else
				insert(node.right,newNode);
		}
				
	}
	
	public void remove(E key) {
        if (this.root == null) {
            throw new NoSuchElementException();
        } else {
            this.remove(this.root, key);
        }
    }

    private void remove(Node<E> node, E key) {
        if (node == null) {
            return;
        } else if (key.compareTo(node.data) == 0) {
            this.delete(node);
        } else if (key.compareTo(node.data) < 0) {
            this.remove(node.left, key);
        } else {
            this.remove(node.right, key);
        }
    }

    private void delete(Node<E> node) {
        if (node.left == null && node.right == null) {
            this.root = null;
        } else if (node.left != null) {
            this.root = node.left;
        } else {
            this.root = node.right;
        }
    }
	public void printInorder()
	{
		printInorder(root);
	}
	
	private void printInorder(Node<E> root)					// LEFT - ROOT - RIGHT
	{
		if(root==null)
			return;
		
		printInorder(root.left);
		System.out.print(root.data+" ");
		printInorder(root.right);
	}
	
	public void printPreorder()
	{
		printPreorder(root);
	}
	
	private void printPreorder(Node<E> root)				// ROOT - LEFT - RIGHT
	{
		if(root==null)
			return;
		
		System.out.print(root.data+" ");
		printPreorder(root.left);
		printPreorder(root.right);
	}
	
	public void printPostorder()
	{
		printPostorder(root);
	}
	
	private void printPostorder(Node<E> root)				// LEFT - RIGHT - ROOT
	{
		if(root==null)
			return;
		
		printPostorder(root.left);
		printPostorder(root.right);
		System.out.print(root.data+" ");
	}
	
	
	/*
	 * 							WORKING OF LEVEL ORDER USING QUEUE
	 * 
	 * 1. We create a Queue.
	 * 2. We firstly add the ROOT NODE to the queue
	 * 3. Loop the queue until it is empty
	 * 4. We Dequeue the head of Queue and print the data of the NODE
	 * 5. Then we check if the LEFT child of the dequeued NODE is empty or not
	 * 6. If it is not empty, then we Enqueue the LEFT child of current NODE to the queue
	 * 7. Same for the RIGHT child. 
	 * 
	 */
	
	public void printLevelOrder()							// BFS (ROW WISE TRAVERSAL)
	{
		Queue<Node<E>> queue = new LinkedList<>();			//Creation of Queue
		queue.add(root);									//Adding ROOT to queue
		while(!queue.isEmpty())								//Traversing till the Queue is Empty
		{
			Node<E> node = queue.poll();					//Store the Head of Queue to Node Object
			System.out.print(node.data+" ");				//Printing the Node's Data			
				
			if(node.left!=null)								
				queue.add(node.left);						//If LEFT of Node is not null, add the Node to Q
			if(node.right!=null)
				queue.add(node.right);						//If RIGHT of Node is not null, add the Node to Q
			
		}
	}
	
	
}
