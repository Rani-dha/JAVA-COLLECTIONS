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
   // Iterator it = arr.Iterator();
    //int a = (Integer)it.next();
    // while( it.hasNext()){
    //     int b = (Integer) it.next();
    //     if ( a < b)
    //       it.remove();
    //     a = b;  
    // }
    ArrayList<Integer> al = new ArrayList<Integer>();
    int a = arr.get(0);
    for(int i=1; i<arr.size(); i++){
        int b = arr.get(i);
        if( a <= b)
           al.add(arr.get(i));
        else if( a>b)
            al.add(a);
        a = b;  
    }
   // if()
    return al;
}


// { Driver Code Starts.



}
  // } Driver Code Ends