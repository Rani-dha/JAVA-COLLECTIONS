// program 4: Interetion of two arrays
// https://practice.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1/?track=Java-Collections-HashSet&batchId=318#

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	
	    //Taking input using class Scanner
		Scanner sc=new Scanner(System.in);
		
		//Taking count of total testcases
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n,m;
		    
		    //taking count of elements in array a
		    n=sc.nextInt();
		    
		    //taking count of elements in array b
		    m=sc.nextInt();
		    
		    //Creating 2 arrays of n and m
		    int a[]=new int[n];
		    int b[]=new int[m];
		    
		    //inserting elements to array a
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    
		    //inserting elements to array b
		    for(int i=0;i<m;i++)
		    {
		        b[i]=sc.nextInt();
		    }
		    Solution ob = new Solution();
		    //calling NumberofElementsInIntersection method
		    //and printing the result
		    System.out.println(ob.NumberofElementsInIntersection(a,b,n,m));
		}
	}
	

}
// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to return the count of the number of elements in
    //the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[],int b[],int n,int m)
    {
        //Your code here
        int intersectionCount = 0;
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<m; i++)
           h.add(b[i]);
           
        for(int i=0; i<n;i++){
            if(h.contains(a[i])){
               intersectionCount ++;
               h.remove(a[i]);
            }   
        }   
        return intersectionCount;
    }
};


// Input:
// n = 6, m = 5
// a[] = {1, 2, 3, 4, 5, 6}
// b[] = {3, 4, 5, 6, 7} 

// Output: 4

// Explanation: 
// 3 4 5 and 6 are the elements 
// in the intersection of two arrays.