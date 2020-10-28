public class LowestCommonAncestor {
	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

		System.out.println("LCA(4, 5) = " + tree.findLCA(4, 5).data);
		System.out.println("LCA(4, 6) = " + tree.findLCA(4, 6).data);
		System.out.println("LCA(3, 4) = " + tree.findLCA(3, 4).data);
		System.out.println("LCA(2, 4) = " + tree.findLCA(4, 5).data);
	}

}

class BinaryTree 
{ 
	Node root;
	
	Node findLCA(int n1, int n2) {
		return findLCA(root, n1, n2);
	}
	
	Node findLCA(Node root, int n1, int n2) {
		if(root == null)
			return null;
 
		else if(root.data == n1 || root.data == n2)  
		return root;
		
		Node leftNode_LCA = findLCA(root.left, n1, n2);   
		Node rightNode_LCA = findLCA(root.right, n1, n2); 
		
		if(leftNode_LCA!= null && rightNode_LCA!=null) 
		return root;                        

		return (leftNode_LCA != null) ? leftNode_LCA : rightNode_LCA;
	}
}	

class Node 
{ 
	int data; 
	Node left, right; 

	Node(int item) 
	{ 
		data = item; 
		left = right = null; 
	} 
} 
	
	
