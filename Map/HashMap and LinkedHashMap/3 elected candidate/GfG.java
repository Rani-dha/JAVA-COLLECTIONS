// https://practice.geeksforgeeks.org/problems/elected-candidate/1/?track=Java-Collections-HashMap&batchId=318

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //Taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total count of testcases
		int t=sc.nextInt();
		while(t-->0)
		{
		    //taking total count of elements
		    int n=sc.nextInt();
		    
		    //Declaring and Initializing a new ArrayList
		    ArrayList<String>names=new ArrayList<>();
		    
		    //adding the name to the ArrayList
		    for(int i=0;i<n;i++)
		    {
		        names.add(sc.next());
		    }
		    Solution ob = new Solution();
		    //calling the method and electionWinner
		    //and printing the result
		    System.out.println(ob.electionWinner(names,n));
		}
	}

}
// } Driver Code Ends


//User function Template for Java

class Solution{
        public static String electionWinner(ArrayList<String>names, int n)
    {
        //Your code here
        String result= "";
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i=0;i<names.size();i++){
            hm.put(names.get(i), hm.getOrDefault(names.get(i),0)+1);
        }
        
        int max = 0;
        for(Map.Entry<String, Integer> m: hm.entrySet()){
            if( max < m.getValue()){
                result = m.getKey();
                max = m.getValue();
            }
        }
        
        return result;
    }
}