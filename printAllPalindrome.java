
import java.io.*;
import java.util.*;

class GFG {
    public static boolean isPalendrome(String str){
        int n= str.length();
        int i=0;
        while(i != n &&  i < n){
            char front = str.charAt(i);
            char back = str.charAt(n-1);
            if(front != back) return false;
            
            i++;
            n--;
        }
        
        return true;
    }
	public static void main (String[] args) {
	 Scanner scn = new Scanner(System.in);
	 String str = scn.nextLine();
	 ArrayList<String> solution = new ArrayList<>();
	 solve(str, solution, "");
	 
	 for(int i=0;i<solution.size();i++){
	     System.out.println(solution.get(i));
	 }
	    
	}
	public static void solve(String str, ArrayList<String> solution, String asf){
	    if(str.length() == 0){
	        asf= asf.substring(1);
	        solution.add(asf);
	        return;
	    }
	    
	    for(int i=0;i<str.length();i++){
	        String prefix = str.substring(0, i+1);
	        String ros = str.substring(i+1);
	        if(isPalendrome(prefix)){
	            solve(ros, solution, asf+" "+prefix);
	        }
	    }
	    
	}
}
