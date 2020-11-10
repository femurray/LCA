import static org.junit.Assert.*;

import org.junit.Test;

public class DAGTest {

	@Test
	public void testDag()
	{
		DAG graph = new DAG(10);

		graph.addEdge(1, 2);
		graph.addEdge(2, 4);
		graph.addEdge(2, 5);
		graph.addEdge(4, 6);
		graph.addEdge(4, 7);

		assertEquals(1, graph.indegree(4));
		assertEquals(2, graph.outdegree(4));
		assertEquals(5, graph.E());
		assertEquals(10, graph.V());
		String adj = "[6, 7]";
		assertEquals(adj, graph.adj(4).toString());
	}
	
	@Test(expected=Exception.class)
	public void exceptionTest(){
		//test to see if can make graph with less than 0 vertices - should be impossible
		DAG graph = new DAG(-5);
	}
	
	@Test
	public void addEdge()
	{
		DAG graph = new DAG(5);

		graph.addEdge(1,2);

		//As negative, will print a system error and not addEdge
		graph.addEdge(-1, -6);

		//This will not addEdge as 12 > 5
		graph.addEdge(3, 12);

		assertEquals(1, graph.E());
	}

	@Test
	public void testIndegree()
	{

	}
	
	@Test
	public void testOutdegree()
	{

	}

	@Test 
	public void testV()
	{
		DAG graph = new DAG(5);
		assertEquals(5, graph.V());
	}

	@Test
	public void testAdj()
	{

	}
	
	@Test
	public void testforCycle()
	{
		DAG graph = new DAG(10);

		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);

		graph.findCycle(0);

		assertTrue(graph.hasCycle());
	}

	@Test
	public void testAcyclicGraph()
	{
		DAG graph = new DAG(10);

		graph.addEdge(1, 2);
		graph.addEdge(2, 4);
		graph.addEdge(3, 3);

		graph.findCycle(1);
		assertFalse(graph.hasCycle());
	}

}
