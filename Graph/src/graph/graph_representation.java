package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class graph_representation {
	private LinkedList<Integer> adjacency[];
	public graph_representation(int vertices) {
		adjacency=new LinkedList[vertices];
		for(int i=0;i<vertices;i++) {
			adjacency[i]=new LinkedList<Integer>();
			 
		}
		
	}
	public void insertedge(int source,int dest) {
		adjacency[source].add(dest);
		adjacency[dest].add(source);
		
	}
	
	
	//BREADTH F.S TRAVERSING
	public void bfs(int source) {
		
		//declaring and initializing the traversal nodes
		boolean visitedNodes[]=new boolean[adjacency.length];
		int parentNodes[]=new int[adjacency.length];
		Queue<Integer> queue=new LinkedList<>();
		queue.add(source);
		visitedNodes[source]=true;
		parentNodes[source]=-1;
		
		
		while(!queue.isEmpty()) {
			//polling out elements from queue
			int p=queue.poll();
			System.out.print(p+" ");
			
			//for checking adjacenct nodes if not present in queue the adding 
			for(int i:adjacency[p]) {
				if(visitedNodes[i]!=true) {
				
					visitedNodes[i]=true;
					
					parentNodes[i]=p;
					queue.add(i);
					
				}
			}
		}
		
	}
	//DEPTH FIRST SEARCH
public void dfs(int source) {
		
		//declaring and initializing the traversal nodes
		boolean visitedNodes[]=new boolean[adjacency.length];
		int parentNodes[]=new int[adjacency.length];
		Stack<Integer> stack=new Stack<>();
		stack.add(source);
		visitedNodes[source]=true;
		parentNodes[source]=source;
		
		
		while(!stack.isEmpty()) {
			//polling out elements from queue
			int p=stack.pop();
			System.out.print(p+" ");
			
			//for checking adjacenct nodes if not present in queue the adding 
			for(int i:adjacency[p]) {
				if(visitedNodes[i]!=true) {
					visitedNodes[i]=true;
					parentNodes[i]=p;
					stack.add(i);}
					
			}
		}
		
	}
	
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbr of vertices and edges");
		int vertices=sc.nextInt();
		int edges=sc.nextInt();
		graph_representation g=new graph_representation(vertices);
		System.out.println("enter the edges");
		for(int i=0;i<edges;i++) {
			int source=sc.nextInt();
			int dest=sc.nextInt();
			g.insertedge(source, dest);
			
		}
		System.out.println("enter the source to start traversing ");
		
		g.bfs(sc.nextInt());
		System.out.println();
		g.dfs(sc.nextInt());
		

	}

}
