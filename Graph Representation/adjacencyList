import java.util.*;


public class adjacencyList {
	
	private static  Map<Integer,List<Integer>> Adjacency_List;	
	
	public adjacencyList(int no_of_vertices){
		Adjacency_List=new HashMap<Integer, List<Integer>>();
		
		for(int i=1;i<=no_of_vertices;i++){
			Adjacency_List.put(i, new ArrayList<Integer>());
		}
		
	}

	
	public static void main(String[] args) {
		int source,destination;
		int no_of_edges,no_of_vertices;
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no. of vertices and edges in the graph: ");
		
		no_of_vertices=s.nextInt();
		no_of_edges=s.nextInt();
		
		adjacencyList al=new adjacencyList(no_of_vertices);
		
		System.out.println("Enter the edges in graph Format : <source index> <destination index>");
		for(int i=0;i<no_of_edges;i++){
			source=s.nextInt();
			destination=s.nextInt();
			Adjacency_List.get(source).add(destination);
			//Adjacency_List.get(destination).add(source);
		}
		for(int i=1;i<=Adjacency_List.size();i++){
			System.out.print(i+"-->");
			for(int j=0;j<Adjacency_List.get(i).size();j++){
				if(j!=Adjacency_List.get(i).size()-1)
				System.out.print(Adjacency_List.get(i).get(j)+",");
				else
					System.out.print(Adjacency_List.get(i).get(j));
				
			}
			System.out.println("");
		}
		
	}

}
