import static org.junit.Assert.*;

import org.junit.Test;

public class LCABinaryTreeTest {

	public static void main(String[] args)
	{
		LCABinaryTree.Node testNode = LCABinaryTree.createBinaryTree();
	}
	
	@Test
	public void testLCAOutput() 
	{  				
		LCABinaryTree.Node testNode = LCABinaryTree.createBinaryTree();
		assertEquals(1, testNode.data);
	} 
	
	/*public void testNull()
	{
		LCABinaryTree tree = new LCABinaryTree();
		
		int Node = 2, n2 = 3;
		
		assertNull(tree.lca(null, n1, n2));
	}
	
	//public void testEmpty()
	//{
		//BinaryTree tree = new BinaryTree();
		
		//int n1 = 2, n2 = 3;
		
		
	//}
	
	
	*/
} 