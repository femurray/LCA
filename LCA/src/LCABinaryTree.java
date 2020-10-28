public class LCABinaryTree 
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

	 
	
	public static Node lca(Node root, Node a, Node b) {
		if(root == null)
			return null;
		if(root.data == a.data || root.data == b.data )
			return root;
 
		Node left=lca(root.left,a,b);
		Node right=lca(root.right,a,b);
 
		// If we get left and right not null , it is lca for a and b
		if(left!=null && right!=null)
			return root;
		if(left== null)
			return right;
		else
			return left;
	}
	
	public static void main(String[] args)
	{
		// Creating a binary tree
		Node root=createBinaryTree();
		System.out.println("Lowest common ancestor for nodes with values 2 and 3:");
		Node node2=new Node(2);
		Node node3=new Node(3);
		System.out.println(lca(root,node2,node3).data);
 
	}

	public static Node createBinaryTree()
	{
		Node root = new Node(1); 
		root.left = new Node(2); 
		root.right = new Node(3); 
		root.left.left = new Node(4); 
		root.left.right = new Node(5); 
		root.left.right.left = new Node(6); 
		root.left.right.right = new Node(7); 
		return root;
	}

	public static String printNode (Node node)
	{
		if (node == null) return "";
		else if (node.left == null && node.right == null)
			return "" + Integer.toString(node.data);
		else return "" + printNode(node.left) + Integer.toString(node.data) + printNode(node.right);					
	}	
}	



