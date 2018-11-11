package Tree;

import java.util.Scanner;

public class Testing {

//ALL NEW CODE 
	public static void main(String[] args) 
	{
		System.out.println("\nCreating a treee that looks like this:\n");
	  	System.out.println("     c5      ");
	        System.out.println("   /   \\   "); // '\\' is the escape character for backslash
	        System.out.println("  c4    c4   ");
	        System.out.println(" / \\   / \\");
	        System.out.println("a1  b1 a1  b1 ");
	        System.out.println();

		//get height
		 System.out.println("How high are your treeees?");
		Scanner scan = new Scanner( System.in );
		int x = scan.nextInt();
		// Create a tree
		
		System.out.println("Constructing a test tree ...");
		BinaryTree<String> testTree = new BinaryTree<String>();
		createTree1(testTree, x);
		
//		BinaryTree<String> testTree = MMExtra.createRecursiveTree(3);
		
		// Display some statistics about it
		System.out.println("\nSome statistics about the test tree ...");
		displayStats(testTree);
		
		// Perform in-order traversal
		System.out.println("\nIn-order traversal of the test tree, printing each node when visiting it ...");
		testTree.inorderTraverse();
		
		// Perform pre-order traversal
		System.out.println("\npre-order traversal of the test tree, printing each node when visiting it ...");
		testTree.preorderTraverse();
		
		// Perform post-order traversal
		System.out.println("\npost-order traversal of the test tree, printing each node when visiting it ...");
		testTree.postorderTraverse();
				
		// Perform breadth-first traversal
		System.out.println("\nbreadth-first traversal of the test tree, printing each node when visiting it ...");
		testTree.breadthFirstTraverse();
		
	} // end of main
	
	
	public static void createTree1(BinaryTree<String> tree, int height)
	{
		
		
	       
	        if(height > 1){
	        	BinaryTree<String> leftNode = new BinaryTree<String>("a " + (height-1));
	        	BinaryTree<String> rightNode = new BinaryTree<String>("b" + (height-1));
				
				height--;
				
				createTree1(leftNode, (height));
				createTree1(rightNode, (height));
				tree.setTree("c "+ (height+1), leftNode, rightNode);
				
			}
	       
    	        // First the leaves
		
	} // end createTree1
	
	public static void displayStats(BinaryTree<String> tree)
	{
		if (tree.isEmpty())
			System.out.println("The tree is empty");
		else
			System.out.println("The tree is not empty");
		
		System.out.println("Root of tree is " + tree.getRootData());
		System.out.println("Height of tree is " + tree.getHeight());
		System.out.println("No. of nodes in tree is " + tree.getNumberOfNodes());
	} // end displayStats 
}
