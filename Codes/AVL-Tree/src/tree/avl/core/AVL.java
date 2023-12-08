package tree.avl.core;

public class AVL {

	Node root;

	public AVL() {
		this.root = null;
	}

	public void insert(int value) {
		root = insert(root, new Node(value));
	}
	
	/*
	 * 											Insertion in AVL Tree
	 * 1.	Firstly we create a terminating condition for the method , by checking if the current node is null or not,
	 * 		if it is NULL then we return the NEW NODE created by the user
	 * 2.	Then we check if the VALUE of CURRENT NODE is GREATER than the USER NODE VALUE
	 * 		if TRUE, then we send the Left Child of Current node to same method by recursion and assign that method to left child
	 * 3.	Same goes for the Right Side
	 * 4. 	While we assign method to LEFT AND RIGHT, it wont affect the original TREE , as it will eventually return the same value
	 * 		after adding the new Node; 
	 * 5.	As we Insert the Node, we Update the Height for every previous Nodes of the Assigned node.
	 * 6. 	It will be updated while the Stack of Recursion goes back step by step
	 * 7.	Finally, we check the Root is Balanced or NOT!
	 * 8.	We will invoke the rotate() method on every Node, while in recursion.
	 * 
	 */

	private Node insert(Node currNode, Node newNode) {
		if (currNode == null)
			return newNode;
		if (currNode.data > newNode.data)
			currNode.left = insert(currNode.left, newNode);
		if (currNode.data < newNode.data)
			currNode.right = insert(currNode.right, newNode);

		currNode.height = Math.max(height(currNode.left), height(currNode.right)) + 1;
		return rotate(currNode);
	}
	
	
	/*
	 * 
	 * 										ROTATE THE NODE IF REQUIRED
	 * 
	 * 1.	As we know AVL is a self balancing tree, and a sub form of BST.
	 * 2.	AVL tree's every node's height must be either 0,1,-1.
	 * 3.	If not, then the Tree is unbalanced and we need to perform rotations on the Unbalanced NODE.
	 * 4.	There are FOUR types of ROTATIONS
	 * 		a. LEFT LEFT (LL).	-->		When the Right Side of the Tree has more Nodes than Left.
	 * 		b. RIGHT LEFT (RL).	-->		When the Right Side of the Tree and then Left of Right has more Nodes.
	 * 		c. RIGHT RIGHT (RR).-->		When the Left Side of the Tree has more nodes than the right side.
	 * 		d. LEFT RIGHT (LR). -->		When the Left side and then the Right of Left side has more Nodes.
	 * 
	 *  
	 * a.			 10                               15                                        
	 * 		 	   /    \                            /  \                                  
	 * 			  5     15         ------>         10    17                            
	 *                 /  \          LL           /  \     \                           
	 *                12   17                    5   12     19                              
	 *                       \   
	 *                        19                                                     
	 * 					
	 *		1. The above tree Node = 10 was having height(LEFT - RIGHT) = -2, hence we know we need to rotate it to LEFT to balance.
	 * 		2. In this case the the 10's RIGHT RIGHT child is unbalanced, hence we will use LEFT LEFT, not RIGHT LEFT.
	 * 		3. So basically here we will check if height(10.right.left) - height(10.right.right) < 0?
	 * 		4. Then we just need to rotate LEFT once.
	 * 
	 * 
	 * 
	   
	   b.            10                                   10                                     12
	                /  \                                 /  \                                  /    \ 
			       5    15      Right Rotate (y)        5    12         Left Rotate(z)       10      15
			           / \       - - - - - - - - ->         /  \       - - - - - - - ->     /  \    /  \
			          12  17                               11   15                         5    11 13   17
	                 / \                                       /  \
	               11   13                                    13   17
	 					
	 *		1. Above Tree has 10's Node height = -2, hence we know we need to rotate the tree to LEFT to balance it
	 *		2. Here we can see that the Unbalanced is caused due to the 10-right-left NODE.
	 *		3. We will check whether height(10.right.left) - height(10.right.right) > 1?
	 *		4. If true, then we will rotate the 10.right Node to RIGHT, 
	 *		   and then we will rotate the main node to LEFT
	 *
	 *
	 * c. and d. Are similar to a and b, But will be Opposite to Each other.
	 *
	 * 			REFER FOR DIAGRAM ---> https://www.geeksforgeeks.org/insertion-in-an-avl-tree/
	 *
	 *
	 *
	 */

	public Node rotate(Node node) {
		if (height(node.left) - height(node.right) > 1) // Left Heavy
		{
			if (height(node.left.left) - height(node.left.right) > 0) // Left Left Heavy
			{
				return rightRotate(node);
			}
			if (height(node.left.left) - height(node.left.right) < 0) // Left Right Heavy
			{
				node.left = leftRotate(node);
				return rightRotate(node);
			}
		}

		if (height(node.left) - height(node.right) < -1) // Right Heavy
		{
			if (height(node.right.left) - height(node.right.right) < 0) // Left Left
			{
				return leftRotate(node);
			}
			if (height(node.right.left) - height(node.right.right) > 0) // Right Right
			{
				node.right = rightRotate(node.right);
				return leftRotate(node);
			}
		}

		return node;
	}

	
	public Node rightRotate(Node parent) {
		Node child = parent.left;
		Node linkOfChild = child.right;
		
		child.right = parent;
		parent.left = linkOfChild;
		
		parent.height = Math.max(height(parent.left), height(parent.right)) + 1;
		child.height = Math.max(height(child.left), height(child.right)) + 1;
		
		return child;
	}
	
	
	/*							LEFT ROTATE WORKING
	 * 
	 * 
	 * 	 			 10 -> Parent                             15 ->Child                                
	 * 		 	   /    \                           Parent\  /  \                                  
	 * 			  5     15 ->Child         ------>         10    17                            
	 *                 /  \                  LL           /  \     \                           
	 *         Link <-12   17                            5   12     19                              
	 *          of          \                                |
	 *         Child         19                            Link of                  
	 * 						                                Child

	 * 
	 */
	
	

	public Node leftRotate(Node parent) {
		Node child = parent.right;
		Node linkOfChild = child.left;

		child.left = parent;
		parent.right = linkOfChild;

		parent.height = Math.max(height(parent.left), height(parent.right)) + 1;
		child.height = Math.max(height(child.left), height(child.right)) + 1;

		return child;
	}

	public int height() {
		return height(root);
	}

	private int height(Node node) {
		if (node == null)
			return -1;

		return node.height;
	}

	public boolean balanced() {
		return balanced(root);
	}

	private boolean balanced(Node node) {
		if (node == null)
			return true;

		return (Math.abs(height(node.left) - height(node.right)) <= 1) && balanced(node.left) && balanced(node.right);
	}

	public boolean isEmpty() {
		return root == null ? true : false;
	}

	public void display() {
		display(root, "ROOT : ");
	}

	public void display(Node node, String detail) {
		if (node == null)
			return;

		System.out.println(detail + node.data);
		display(node.left, "Left Node of " + node.data + ": ");
		display(node.right, "Right Node of " + node.data + ": ");
	}

}
