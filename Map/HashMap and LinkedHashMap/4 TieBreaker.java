//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //Taking input using class Scanner
		Scanner sc = new Scanner(System.in);
		
		//taking total count of testcases
		int t=sc.nextInt();
		while(t-->0)
		{
		    //taking total count of elements
		    int n=sc.nextInt();
		    
		    //Declaring and Initializing an ArrayList
		    ArrayList<String>names=new ArrayList<>();
		    
		    //adding elements to the ArrayList
		    for(int i=0;i<n;i++)
		    {
		        names.add(sc.next());
		    }
		    Solution ob = new Solution();
		    //calling TieBreak method and printing the result
		    System.out.println(ob.TieBreak(names,n));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution{
        public static String TieBreak(ArrayList<String>names, int n)
    {
        //Your code here
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i=0;i<names.size();i++){
            //if( !hm.containsKey(names.get(i))) wrong it shouldn't be checked!
                hm.put(names.get(i), hm.getOrDefault(names.get(i),0)+1);
        }
        
        String winner = "";
        Integer maxVotes = 0;
        
        //System.out.println(hm);
        
        for(Map.Entry<String,Integer> m: hm.entrySet()){

            if(maxVotes < m.getValue() || ((m.getValue() == maxVotes)&&(m.getKey().compareTo(winner)<0)))
            {
                maxVotes = m.getValue();
                winner = m.getKey();
            }
  
        //     if(m.getValue() > max){
        //         result = m.getKey();
        //         max = m.getValue();
        //     }
        //     else if( m.getValue() == max){
        //         if(result.compareTo(m.getKey()) > 0){
        //             result = m.getKey();
        //         }
        //     }
        }
        
        return winner;
        
        
    }
}
