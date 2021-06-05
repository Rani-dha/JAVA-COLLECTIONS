// Program 2: distinct sorted
// https://practice.geeksforgeeks.org/problems/distinct-sorted/1/?track=Java-Collections-TreeSet&batchId=318#

//Initial Template for Java

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
		    
		    //Declaring and Initializing 
		    //an ArrayList of type Integer
		    ArrayList<Integer>arr=new ArrayList<>();
		    
		    //adding elements to the ArrayList
		    for(int i=0;i<n;i++)
		    {
		        arr.add(sc.nextInt());
		    }
		    Solution ob = new Solution();
		    //Calling uniqueSorted method
		    //and printing the elements
		    for(int i:ob.uniqueSorted(arr,n))
		    System.out.print(i+" ");
		    
		    System.out.println();
		}
		
	}
	
}

// } Driver Code Ends


//User function Template for Java

class Solution{
        public static ArrayList<Integer> uniqueSorted( ArrayList<Integer>arr, int n)
    {
        //Your code here
        ArrayList<Integer> result = new ArrayList<>();
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i=0; i<n;i++)
           ts.add(arr.get(i));
        
        for(Integer x: ts)
            result.add(x);
            
        return result;
    }
}


// Input:
// 6
// 3 3 2 2 1 4

// Output:
// 1 2 3 4

// Explanation:
// All distinct in sorted order.