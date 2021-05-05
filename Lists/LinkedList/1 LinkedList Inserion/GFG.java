// Program 1: LinkedList Insertion
// https://practice.geeksforgeeks.org/problems/linkedlist-insertion/1/?track=Java-Collections-LinkedList&batchId=318


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		//taking the number of testcases
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    //taking input the number the of elements
		    int n=sc.nextInt();
		    ArrayList<Integer>arr=new ArrayList<>();
		    for(int i=0;i<n;i++)
		    {
		        arr.add(sc.nextInt());
		    }
		    
		    //calling the method insertion
		    LinkedList<Integer>ll=insertion(arr);
		    
		    //printing all the elements
		    for(int i:ll)
		    System.out.print(i+" ");
		    System.out.println();
		}
	}
	
 // } Driver Code Ends
//User function Template for Java

public static LinkedList<Integer> insertion(ArrayList<Integer>arr)
{
    //Your code here
    LinkedList<Integer> list = new LinkedList<>();
    Iterator itr = arr.iterator();
    while( itr.hasNext()){
        Integer value = (Integer)itr.next();
        list.add(value);
    }
    return list;
}

// { Driver Code Starts.

	
}  // } Driver Code Ends