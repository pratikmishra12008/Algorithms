import java.util.*;
public class adjacencyMatrix {
	
	public static void main(String[] args) {
    	boolean arr[][]=new boolean[10][10];
		int x,y,nodes,edges;
		System.out.print("check 1");
		for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                arr[i][j]=false;
            }
        }
        Scanner s=new Scanner(System.in);
        nodes=s.nextInt();
        edges=s.nextInt();
        System.out.println("Enter the node pairs to create edges : ");
        for(int i=0;i<edges;i++){
        	x=s.nextInt();
        	y=s.nextInt();
        	arr[x][y]=true;
        }
        for(int i=0;i<nodes;i++){
        	System.out.print("[ ");
        	for(int j=0;j<nodes;j++)
        	System.out.print(arr[i][j]+"  ");
        	System.out.println(" ]");
        }
	}

}
