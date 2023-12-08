package trees.binary.simpleTree.core;

import java.util.Scanner;

public class BinaryTree {

	Scanner scanner = new Scanner(System.in);

	//By User on Runtime;
	
	/*
	 * 								HOW TO BUILD A BINARY TREE BY USER?
	 * 
	 * 1. Create a NULL NODE.
	 * 2. Take input from user and Store in a variable.
	 * 3. Check if the INPUT is -1, then USER wishes to return 1 step back.
	 * 4. If not, then insert the DATA to Node we created at step 1.
	 * 5. Ask for the user to enter value for LEFT node of CURRENT NODE.
	 * 6  Call the recursive function and assign the method's output to the LEFT CHILD of the ROOT.
	 * 7. Similarly for the RIGHT CHILD.
	 * 8. Return the ROOT to the USER, For accessing the NEW TREE CREATED
	 * 
	 */
	
	public Node buildtree()
	{
		Node root = null;
		System.out.print("Enter data: ");
		int val = scanner.nextInt();
		
		if(val == -1)
			return null;
		
		root = new Node(val);
		
		System.out.println("Enter Left for "+val+": ");
		root.left = buildtree();
		System.out.println("Enter Right for "+val+": ");
		root.right = buildtree();
		
		return root;
	}
	
	public void display(Node root)					// PreOrder
	{
		if (root == null)
			return;
		
		System.out.print(root.data+" ");
		display(root.left);
		display(root.right);
	}
	
	
}
