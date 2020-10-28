import static org.junit.Assert.*;

import org.junit.Test;

public class LowestCommonAncestorTest{

	//1. Insures null is returned if we are asked to find the LCA of an empty Binary Tree
	@Test
	public void testIfEmpty()
	{
		BinaryTree tree = new BinaryTree();
		
		assertNull(null, tree.findLCA(0, 0));
	}

	//2. Testing the '.right' method is working correctly
	@Test
	public void testRightSubtrees()
	{
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.right = new Node (2);
		tree.root.right.right = new Node (3);
		tree.root.right.right.right = new Node(4);

		assertEquals(3, tree.findLCA(3, 4).data); 	
	}
		
	//3. Testing the '.left' method is working correctly
	@Test
	public void testLeftSubtrees()
	{
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(4);
		tree.root.left = new Node(2);
		tree.root.left.left = new Node(5);
		tree.root.left.left.left = new Node(8);
		
		assertEquals(2, tree.findLCA(2, 5).data); 
		
	}

	//4. Testing other random LCA scenarios
	@Test
	public void testLCAfunction()
	{
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.left.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.left.left = new Node(5);
		tree.root.right = new Node(6);
		tree.root.right.left = new Node(7);
		tree.root.right.right = new Node(8);
		
		assertEquals(6, tree.findLCA(7, 8).data); 
		assertEquals(1, tree.findLCA(3, 7).data); 
		assertEquals(2, tree.findLCA(5, 3).data); 
		assertEquals(1, tree.findLCA(1, 6).data); 
	}
		
	//5. Checking the LCA function works if only one node exists in the binary tree
	@Test 
	public void testOneNodeBinaryTree()
	{
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(4);
		
		assertEquals(4, tree.findLCA(4, 4).data); 
	}
}