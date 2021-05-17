// Program 2: Queue Traversal
// https://practice.geeksforgeeks.org/problems/queue-traversal-1594111322/1/?track=Java-Collections-Queue&batchId=318#

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using class Scanner
		Scanner sc = new Scanner(System.in);
		
		//taking total number of testcases
		int t=sc.nextInt();
		while(t-->0)
		{
		    //taking total number of elements
		    int n=sc.nextInt();
		    
		    //Creating a Queue
		    Queue<Integer>q=new LinkedList<>();
		    
		    //adding all the elements to the Queue
		    for(int i=0;i<n;i++)
		    {
		        q.add(sc.nextInt());
		    }
		    
		    //calling the queueTraversal method
		    queueTraversal(q);
		    
		    System.out.println();
		}
	}
	
	
 // } Driver Code Ends
//User function Template for Java

public static void queueTraversal(Queue<Integer>q)
{
    //Your code here
    while( !q.isEmpty())
       System.out.print( q.poll() + " ");
}

// { Driver Code Starts.

}  // } Driver Code Ends

/* 

Input : 
5
3 4 2 2 4

Output : 
3 4 2 2 4 

Explanation :
Just print the elements.

*/