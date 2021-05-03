// Java streams filter() method
// https://practice.geeksforgeeks.org/problems/java-streams-filter/1/?track=Java-Collections-Java-Streams&batchId=318#


//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total count of testcases
		int t = sc.nextInt();
		
		while(t-->0)
		{
		    //taking total count of elements
		    int n=sc.nextInt();
		    
		    //creating an array of size n and type int
		    int []arr=new int[n];
		    
		    //inserting elements to the array
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		   //calling the method filtersUsingStreams
		   //and printing the result
		   System.out.println(filterUsingStreams(arr));
		    
		    
		}
	}
	
 // } Driver Code Ends
//User function Template for Java

public static int filterUsingStreams(int []arr)
{
    //Your code here
    //Using filter() to get only odd elements then apply max().getAsInt()
    return Arrays.stream(arr)
                 .filter( x -> x%2 !=0 )
                 .max()
                 .getAsInt();
}

// { Driver Code Starts.


	
}  // } Driver Code Ends