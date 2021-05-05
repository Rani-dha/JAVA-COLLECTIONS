// Program 2 : LinkedList Traversal 
//

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		//taking all the testcases
		int t=sc.nextInt();
		while(t-->0)
		{
		    //taking the total number of elements
		    int n=sc.nextInt();
		    
		    LinkedList<Integer>ll=new LinkedList<>();
		    for(int i=0;i<n;i++)
		    {
		        ll.add(sc.nextInt());
		    }
		    
		    //calling the LikedListTraversal method
		    LinkedListTraversal(ll);
		    System.out.println();
		}
	}
	
 // } Driver Code Ends
//User function Template for Java



public static void LinkedListTraversal(LinkedList<Integer>ll)
{
    //Your code here
    
     
    Iterator itr = ll.iterator();
    while( itr.hasNext()){
        //Integer value = (Integer)itr.next();
        System.out.print(itr.next() + " ");
    }
}

// { Driver Code Starts.

	
}  // } Driver Code Ends