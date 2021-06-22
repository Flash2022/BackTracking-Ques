import java.util.*;

public class TugOfWar{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
         for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        scn.close();
        solve(arr, 1, new ArrayList<>(), new ArrayList<>(), 0, 0);
        System.out.println(ans);
       
    }
    static int min = Integer.MAX_VALUE;
    static String ans = "";

    public static void solve(int[] arr, int level, ArrayList<Integer> set1,ArrayList<Integer> set2,
                             int sumset1, int sumset2 ) {
        if(level == arr.length){
            int delta = Math.abs(sumset1-sumset2);
            if(delta < min){
                min = delta;
                ans = set1 + " " + set2;
            }
            return;
        }

        if(set1.size() < (arr.length+1)/2){
            set1.add(level);
            solve(arr, level+1, set1, set2, sumset1+arr[level], sumset2);
            set1.remove(set1.size()-1);

        }

        if(set2.size() < (arr.length+1)/2){
            set2.add(level);
            solve(arr, level+1, set1, set2, sumset1, sumset2+arr[level]);
            set2.remove(set2.size()-1);

        }
        
    }
}
