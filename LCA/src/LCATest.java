import static org.junit.Assert.*;

import org.junit.Test;

public class LCATest {

	//idk what point of @test is - find out
	public void testLCAOutput() 
	{  
		BinaryTree tree = new BinaryTree(); 
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
		tree.root.left.right.left = new Node(6); 
		tree.root.left.right.right = new Node(7); 
	
		int n1 = tree.root.left.data, n2 = tree.root.right.data;
				
		Node testNode = tree.lca(tree.root, n1, n2);
	
		assertEquals(1, testNode.data);
	} 
	
	public void testNull()
	{
		BinaryTree tree = new BinaryTree();
		
		int n1 = 2, n2 = 3;
		
		assertNull(tree.lca(null, n1, n2));
	}
	
	//public void testEmpty()
	//{
		//BinaryTree tree = new BinaryTree();
		
		//int n1 = 2, n2 = 3;
		
		
	//}
	
	
	
} 