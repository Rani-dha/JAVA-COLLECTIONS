// https://practice.geeksforgeeks.org/problems/frequency-count/1/?track=Java-Collections-HashMap&batchId=318

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t=sc.nextInt();
		while(t-->0)
		{
		    //taking total elements
		    int n=sc.nextInt();
		    
		    //Declaring a new ArrayList
		    ArrayList<Integer>arr=new ArrayList<>();
		    
		    //adding elements to the ArrayList
		    for(int i=0;i<n;i++)
		    {
		        arr.add(sc.nextInt());
		    }
		    
		    //calling the frequncyCount method and
		    //storing the result in new ArrayList
		    ArrayList<Integer>ans=frequencyCount(arr, n);
		    
		    //printing the elements
		    //of the ArrayList
		    for(int i:ans)
		    System.out.print(i+" ");
		    
		    System.out.println();
		}
	}
	
 // } Driver Code Ends
//User function Template for Java

public static ArrayList<Integer> frequencyCount(ArrayList<Integer>arr, int n)
{
    //Your code here
    LinkedHashMap<Integer,Integer> lm = new LinkedHashMap<>();
    ArrayList<Integer> result = new ArrayList<>();
    
    for(int i=0;i<n; i++){
        lm.put(arr.get(i), lm.getOrDefault(arr.get(i),0)+1);
    }
    
    for(Map.Entry<Integer, Integer> m: lm.entrySet())
        result.add(m.getValue());
        
    return result;    
}

// { Driver Code Starts.


}  // } Driver Code Ends