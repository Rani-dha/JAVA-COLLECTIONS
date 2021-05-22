// Program 2: PriorityQueue Insertion 2
// https://practice.geeksforgeeks.org/problems/priorityqueue-inserion-2/1/?track=Java-Collections-PriorityQueue&batchId=318#


//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.ListIterator;
class GFG {
	public static void main (String[] args) {
		
		//Taking input using Scanner Class
		Scanner sc = new Scanner(System.in);
		
		//Taking total  number of testcases
		int t = sc.nextInt();
		
		while(t-->0)
		{
		    //Taking total number of elements
		    int n=sc.nextInt();
		    
		    //Creating a new ArrayList
		    ArrayList<Integer>arr=new ArrayList<>();
		    
		    //adding the elements in the ArrayList
		    for(int i=0;i<n;i++)
		    {
		        arr.add(sc.nextInt());
		    }
		    
		    //Calling insertion method 
		    //and storing the result in 
		    //a PriorityQueue
		    PriorityQueue<Integer>pq=insertion(arr);
		    
		    //Printing all the elements
		    //of the PriorityQueue
		    while(pq.size()>0)
		    {
		        System.out.print(pq.poll()+" ");
		    }
		    
		    System.out.println();
		}
		
	}
	
	
	
	
 // } Driver Code Ends
//User function Template for Java

public static PriorityQueue<Integer> insertion(ArrayList<Integer>arr)
{
    //Your code here
    
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
    for(int i=0; i<arr.size();i++)
        pq.add(arr.get(i));
        
    return pq;    
}

// { Driver Code Starts.



}
  // } Driver Code Ends

  /* 
  
  Input:
6
5 4 2 99 5 3

Output:
99 5 5 4 3 2

Explanation:
We customize our PQ as a max-heap and insert the elements.
  
  */