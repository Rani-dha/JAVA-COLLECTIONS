// Program 1: Count only once
// https://practice.geeksforgeeks.org/problems/count-only-once/1/?track=Java-Collections-HashSet&batchId=318#

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.ListIterator;
class GFG {
	public static void main (String[] args) {
	    
	    //Taking input using class Scanner
		Scanner sc = new Scanner(System.in);
		
		//Taking count of Testcases
		int t = sc.nextInt();
		
		while(t-->0)
		{
		    //taking count of elements
		    int n=sc.nextInt();
		    
		    //creating a new ArrayList
		    ArrayList<Integer>arr=new ArrayList<>();
		    
		    //adding elements to the ArrayList
		    for(int i=0;i<n;i++)
		    {
		        arr.add(sc.nextInt());
		    }
		    
		    
		    //calling the coutOnce method
		    //and printing the result
		    System.out.println(countOnce(arr));
		}
		
	}
	
	
	
 // } Driver Code Ends
//User function Template for Java

public static int countOnce(ArrayList<Integer>arr)
{
    //Your code here
    TreeSet<Integer> result = new TreeSet<>(arr);
    return result.size();
}



// { Driver Code Starts.

}
  // } Driver Code Ends


//   Input:
// 7
// 8 8 6 5 9 9 2

// Output:
// 5

// Explanation:
// We have 8 8 6 5 9 9 2. Here 8 occurs 2 times,
// 6 occurs 1 time, 5 occurs 1 time, 9 occurs 
// 2 times, and 2 occurs 1 time. So, if we account 
// each element only once then we have 8 6 5 9 2 only. 
// So the count is 5 here.