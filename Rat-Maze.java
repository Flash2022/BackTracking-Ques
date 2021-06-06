import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();	
		int[][] maze = new int[n][n];
		
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        maze[i][j]=scn.nextInt();
		    }
		        
		}
		boolean[][] visited=new boolean[n][n];
		    
		        
		ArrayList<String> solution = new ArrayList<String>();        
	Printallpath(maze , 0 , 0 , n,  "", solution, visited);
	

	    System.out.println(solution.size());
	
	}
	
	public static void Printallpath(int[][] maze, int r, int c, int n, String psf, ArrayList<String> solution, boolean[][] visited ){
	   if(r>=n || c>=n || r<0 || c<0 || visited[r][c] == true || maze[r][c]==1){
	       return;
	   }else if(r==n-1  && c==n-1){
	       //add psf to solution
	       solution.add(psf);
	       return;
	   }
	   visited[r][c] = true;
	   
	   //up call
	   Printallpath(maze , r-1 , c , n, psf + "U", solution, visited);
	    
	   //down call
	    Printallpath(maze , r+1 , c , n, psf + "D", solution, visited);
	   
	   // left call
	    Printallpath(maze , r , c-1 , n, psf + "L", solution, visited);
	   
	   //right call
	    Printallpath(maze , r , c+1 , n, psf + "R", solution, visited);
	   
	   visited[r][c]=false;
	   
	}
}
