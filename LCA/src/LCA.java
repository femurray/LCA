public class BinaryTree 
{ 
	public static class Node 
	{ 
		int data; 
		Node left, right; 

		Node(int item) 
		{ 
			data = item; 
			left = right = null; 
		} 
	} 

	Node root; 
	
	/* Function to find LCA of n1 and n2. The function assumes that both 
	n1 and n2 are present in BST */
	Node lca(Node root, int n1, int n2) 
	{ 
		if (root == null) 
			return null; 

		// If both n1 and n2 are smaller than root, then LCA lies in left 
		if (root.data > n1 && root.data > n2) 
			return lca(root.left, n1, n2); 

		// If both n1 and n2 are greater than root, then LCA lies in right 
		if (root.data < n1 && root.data < n2) 
			return lca(root.right, n1, n2); 

		return root; 
	} 
	
	 /*public static void main(String args[])  
	    { 
	        // Let us construct the BST shown in the above figure 
	        BinaryTree tree = new BinaryTree(); 
	    }    */
	
	public static void main(String[] args)
	{
		// Creating a binary tree
		Node root=createBinaryTree();
		System.out.println("Lowest common ancestor for node 5 and 30:");
		Node node5=new Node(5);
		Node node30=new Node(30);

	}

	public static Node createBinaryTree()
	{

		Node rootNode =new Node(40);
		Node node20=new Node(20);
		Node node10=new Node(10);
		Node node30=new Node(30);
		Node node60=new Node(60);
		Node node50=new Node(50);
		Node node70=new Node(70);
		Node node5=new Node(5);
		Node node45=new Node(45);
		Node node55=new Node(55);

		rootNode.left=node20;
		rootNode.right=node60;

		node20.left=node10;
		node20.right=node30;

		node60.left=node50;
		node60.right=node70;

		node10.left=node5;
		node50.right=node55;
		return rootNode;
	}

	public static String printNode (Node node)
	{
		if (node == null) return "";
		else if (node.left == null && node.right == null)
			return "" + Integer.toString(node.data);
		else return "" + printNode(node.left) + Integer.toString(node.data) + printNode(node.right);					
	}	
}	



