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
	public void addEdge(int v, int w)
	{
		validateVertex(v);
		validateVertex(w);
		adj[v].add(w);
		indegree[w]++;
		E++;
	}
	
	private void validateVertex(int v)
	{
		if(v < 0 || v >= V)
		{
			throw new IllegalArgumentException("Vertex " + v + " is not between 0 and " + (V-1));
		}
	}

	//Returns number of directed edges from current vertex
	public int indegree(int v)
	{
		validateVertex(v);
		return indegree[V];
	}

	//Returns the adjacent vertices to v
	public Iterable<Integer> adj(int v)
	{
		return adj[v];
	}

}
