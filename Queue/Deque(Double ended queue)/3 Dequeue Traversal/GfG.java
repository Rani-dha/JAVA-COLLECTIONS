// Program 3: Deque traversal
// https://practice.geeksforgeeks.org/problems/dequeue-traversal/1/?track=Java-Collections-Deque&batchId=318

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    
	    //Taking input using Scanner class
	    Scanner sc=new Scanner(System.in);
	    
	    //taking count of all the testcases
	    int t=sc.nextInt();
	    
	    while(t-->0)
	    {
	        //taking count of total number of elements
	        int n=sc.nextInt();
	        
	        //Declaring and Initializing an ArrayDeque
	        ArrayDeque<Integer> deq = new ArrayDeque<>();
	        
	        //adding elements at the last of ArrayDeque
	        for(int i=0;i<n;i++)
	        {
	            int x=sc.nextInt();
	            deq.addLast(x);
	            
	        }
	        
	        
	        //Calling method printDeque 
	        printDeque(deq);
	        
	        
	    }
		
	}
	
	
 // } Driver Code Ends
//User function Template for Java


//Function to traverse the Deque and print the elements of it.
public static void printDeque(ArrayDeque<Integer> deq)
{
   //Your code here
   Iterator it = deq.iterator();
   while(it.hasNext())
     System.out.print(it.next() + " ");
     
   System.out.println();  // To avoid collisions with multiple cases   
}

// { Driver Code Starts.


}  // } Driver Code Ends

/* 

Input: 
5
1 2 3 4 5

Output: 
1 2 3 4 5

Explanation: 
Dqe will look like 
{1, 2, 3, 4, 5}.

*/