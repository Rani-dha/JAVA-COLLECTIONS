// Program 1: TreeSet operations
// https://practice.geeksforgeeks.org/problems/treeset-operations/1/?track=Java-Collections-TreeSet&batchId=318#

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.ListIterator;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using class Scanner
		Scanner sc = new Scanner(System.in);
		
		//taking total count of testcases
		int t = sc.nextInt();
		
		while(t-->0)
		{
		    //taking total count of elements
		    int n=sc.nextInt();
		    
		    //Declaring and Initalizing a new ArrayList
		    ArrayList<Integer>arr=new ArrayList<>();
		    
		    //adding elements to the ArrayList
		    for(int i=0;i<n;i++)
		    {
		        arr.add(sc.nextInt());
		    }
		    
		    //taking the element to be erased
		    int x=sc.nextInt();
		    
		    //converting ArrayList to TreeSet
		    TreeSet<Integer> s= insert(arr);
		    
		    //displaying the TreeSet elements
		    display(s);
		    System.out.println();
		    
		    //erasing x from TreeSet
		    erase(s,x);
		    System.out.println();
		    
		    //displaying the TreeSet elements
		    display(s);
		    System.out.println();
		}
		
	}
	
	
	
 // } Driver Code Ends
//User function Template for Java


//Takes ArrayList as an argument and 
//inserts the elements of the ArrayList into a 
//TreeSet and returns the TreeSet.
public static TreeSet<Integer> insert(ArrayList<Integer> arr)
{
    //Your code here
    TreeSet<Integer> ts = new TreeSet<>();
    for(int i=0;i<arr.size(); i++){
       ts.add(arr.get(i));  
    }
    return ts;
}

//Takes a TreeSet as an argument and prints 
//the elements of the TreeSet. The newline 
//is provided by the driver code.
public static void display(TreeSet<Integer> s)
{
    //Your code here
    for(Integer x: s)
        System.out.print( x + " ");
    //System.out.println();
}

//Takes TreeSet and x as arguments and erases x 
//from the TreeSet. If erased, print "erased x" 
//else then print "not found".The newline 
//is provided by the driver code.
public static void erase(TreeSet<Integer> s,int x)
{
    //Your code here
    if (s.contains(x)){
         System.out.print("erased " + x);
         s.remove(x); 
    }
    else 
       System.out.print("not found");
}

// { Driver Code Starts.



}
  // } Driver Code Ends


//   Input:
//   10
//   9 8 7 4 4 2 1 1 9 8
//   1
  
//   Output:
//   1 2 4 7 8 9
//   erased 1
//   2 4 7 8 9
  
//   Explanation:
//   First, we just insert the elements into a TS and print it. 
//   As TreeSet contains elemens in sorted order, so we get 
//   sorted numbers. Now x is 1 here so we remove it from 
//   the TS and print erased 1. Finally, the display is called 
//   again to print the updated TS.
