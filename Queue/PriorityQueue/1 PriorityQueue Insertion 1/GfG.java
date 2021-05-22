// Program 1: PriorityQueue Insertion 1
//  https://practice.geeksforgeeks.org/problems/priorityqueue-inserion/1/?track=Java-Collections-PriorityQueue&batchId=318#

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.ListIterator;
class GFG {
	public static void main (String[] args) {
	    
	    //Taking input using class Scanner 
		Scanner sc = new Scanner(System.in);
		
		//Taking total number of testcases
		int t = sc.nextInt();
		
		while(t-->0)
		{
		    //taking total number of elements
		    int n=sc.nextInt();
		    
		    //Creating a new ArrayList
		    ArrayList<Integer>arr=new ArrayList<>();
		    
		    //Adding elements to the ArrayList
		    for(int i=0;i<n;i++)
		    {
		        arr.add(sc.nextInt());
		    }
		    
		    //Calling the method insertion
		    //and storing the result in a
		    //PriorityQueue
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
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    for(int i=0;i<arr.size(); i++){
        pq.add( arr.get(i));
    }
    
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
2 3 4 5 5 99

Explanation:
After inserting given elements in a PQ, they 
get arranged in a min heap way. So when we 
print it we get in sorted order
  
  */