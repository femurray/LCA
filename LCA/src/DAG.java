import java.util.ArrayList;


public class DAG {

	private int V;						//no. vertices
	private int E;						//no. edges
	private ArrayList<Integer>[] adj;   //adj[V] = adjacency list for vertex V
	private int [] indegree;			//indegree[V] = indegree of vertex V
	private boolean [] marked;			//list of visited vertices

	//Returns current vertex
	public int V()
	{
		
	}

	//Adds directed edge from v to w
	public void addEdge(int V, int W)
	{
		
	}

	//Returns number of directed edges from current vertex
	public int indegree(int V)
	{
		return indegree[V];
	}

	//Returns the adjacent vertices to v
	public Iterable<Integer> adj(int V)
	{
		return adj[V];
	}

}
