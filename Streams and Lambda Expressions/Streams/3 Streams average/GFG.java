// Java streams average() method
//   https://practice.geeksforgeeks.org/problems/java-streams-average/1/?track=Java-Collections-Java-Streams&batchId=318#

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
		    
		    //creating a new array of size n of type int
		    int []arr=new int[n];
		    
		    //inserting elements to the array
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		   //calling avgUsingStreams method
		   //and printing the result
		   System.out.println(avgUsingStreams(arr));
		    
		    
		}
	}
	
 // } Driver Code Ends
//User function Template for Java


public static double avgUsingStreams(int []arr)
{
    //Your code here
    //Using stream().average().getAsDouble()
    //Just return and don't typecase anything.
    
    double d = Arrays.stream(arr)
                     .average()
                     .getAsDouble();
    return d;
    
}

// { Driver Code Starts.

	
	
}  // } Driver Code Ends