import java.util.ArrayList;


public class DAG {

	private int V;						//no. vertices
	private int E;						//no. edges
	private ArrayList<Integer>[] adj;   //adj[V] = adjacency list for vertex V
	private int [] indegree;			//indegree[V] = indegree of vertex V
	private int [] outdegree;			//outdegree[V] = outdegree of vertex V
	private boolean marked [];			//list of visited vertices
	private boolean hasCycle;			//True if graph has cycle
	private boolean stack [];
	
	
	//DAG constructor
	public DAG(int V)
	{
		if(V < 0)
		{
			throw new IllegalArgumentException("Number of vertices must be greater than 0");
		}
		this.V = V;
		this.E = 0;
		indegree = new int[V];
		marked = new boolean[V];
		stack = new boolean[V];
		adj = (ArrayList<Integer>[]) new ArrayList[V];

		for(int v = 0; v < V; v++)
		{
			adj[v] = new ArrayList<Integer>();
		}
	}

	//Returns current vertex
	public int V()
	{
		return V;
	}

	//Returns current edge
	public int E()
	{
		return E;
	}

	//Adds directed edge from v to w
	public void addEdge(int v, int w)
	{
		if((validateVertex(v) > 0) && (validateVertex(w) > 0))
		{
			adj[v].add(w);
			indegree[w]++;
			E++;
		}
		else
		{
			System.out.println("Please enter numbers between 0 and " + (V-1));
		}		
	}
	
	private int validateVertex(int v)
	{
		if(v < 0 || v >= V)
			return -1;
		else
			return 1;
	}

	//Returns number of directed edges from current vertex
	public int indegree(int v)
	{
		if(validateVertex(v) > 0)
		{
			return indegree[v];
		}
		else
		{
			return -1;
		}
	}
	
	//Returns number of directed edges from vertex v
	public int outdegree(int v)
	{
		if(validateVertex(v) > 0)
		{
			return adj[v].size();
		}
		else
		{
			return -1;
		}
	}
		
	//Returns the adjacent vertices to v
	public Iterable<Integer> adj(int v)
	{
		return adj[v];
	}

	public boolean hasCycle()
	{
		return hasCycle;
	}
	
	public void findCycle(int v)
	{
		marked[v] = true;
		stack[v] = true;

		for(int w: adj(v))
		{
			if(!marked[w])
			{
				findCycle(w);
			}
			else if(stack[w])
			{
				hasCycle = true;
				return;
			}
		}
		stack[v] = false;
	} 
	
	//Method to implement lowest common ancestor
	public int findLCA(int v, int w)
	{
		return -1;
	}

	//Prints BFS(Breadth-Frist search) from source s
	public ArrayList<Integer> BFS(int s)
	{
		ArrayList<Integer> order = new ArrayList<Integer>();
		return order;
	}

	//Reverse DAG
	public DAG reverse()
	{
		DAG reverse = new DAG(V);
		return reverse;
	}
}
