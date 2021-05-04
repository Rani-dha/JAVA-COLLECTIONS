//  ArrayList Iterate from front to back
//  https://practice.geeksforgeeks.org/problems/arraylist-iterate-front-to-back/1/?track=Java-Collections-ArrayList&batchId=318

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		//Creating an object of class Scanner
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//taking all the testcases
		
		while(t-->0)
		{
		    int n=sc.nextInt();//taking the total number of elements
		    ArrayList<Integer>arr=new ArrayList<>();//Declaring and Intializing an ArrayList
		    for(int i=0;i<n;i++)
		    {
		        int x=sc.nextInt();//taking in the element
		        arr.add(x);
		    }
		    
		    Iterator iterator=arr.iterator();//creating an iterator of ArrayList arr
		    
		    //calling the iterFTB method and passing the iteraror
		    iterFTB(iterator);
		    
		    System.out.println();
		}
		
	}
	
 // } Driver Code Ends
//User function Template for Java

public static void iterFTB(Iterator iterator)
{
    //Your code here
    //Just print the elements, don't provide new line
    while( iterator.hasNext()){
        System.out.print( iterator.next() + " ");
    }
}

// { Driver Code Starts.

	
}  // } Driver Code Ends