// 5 Maximum neighbours in arrayList
// https://practice.geeksforgeeks.org/problems/maximum-neighbours-in-arraylist/1/?track=Java-Collections-ArrayList&batchId=318#

//Initial Template for Java
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.ListIterator;
class GFG {
	public static void main (String[] args) {
	    //Creating an Object of class Scanner
		Scanner sc = new Scanner(System.in);
		//Taking input all the testcases
		int t = sc.nextInt();
		
		while(t-->0)
		{
		    //Taking the total number of elements 
		    int n=sc.nextInt();
		    
		    //Declaring and Initializing an ArrayList of type Integer
		    ArrayList<Integer>arr=new ArrayList<>();
		    
		    //adding all the elements to the ArrayList
		    for(int i=0;i<n;i++)
		    {
		        arr.add(sc.nextInt());
		    }
		    
		    
		    //Calling the method maxNeighbour
		    ArrayList<Integer>ans=maxNeighbour(arr);
		    
		    //Printing the elements
		    for(int x:ans)
		    System.out.print(x+" ");
		    
		    System.out.println();
		}
		
	}
	
	

 // } Driver Code Ends
//User function Template for Java


public static ArrayList<Integer> maxNeighbour(ArrayList<Integer>arr)
{
    //Your code here
    ArrayList<Integer> al = new ArrayList<Integer>();
    int a = arr.get(0); // Initial  previous item
    for(int i=1; i<arr.size(); i++){
        int b = arr.get(i); // To get the current item
        if( a <= b) // Comparing the previous and current item, greater item is added to the arraylist.
           al.add(arr.get(i));
        else if( a>b)
            al.add(a);
        a = b;  // To store the previous item
    }
   // if()
    return al;
}


// { Driver Code Starts.



}
  // } Driver Code Ends

  /* Given an ArrayList arr of N positive integers. The task is to find the maximum for every adjacent pairs in the ArrayList.

Example 1:

Input:
6
1 2 2 3 4 5

Output:
2 2 3 4 5

Explanation:
Maximum of arr[0] and arr[1] is 2, that of arr[1] and arr[2] 
is 2, ... and so on. For last two elements, maximum is 5.


*/