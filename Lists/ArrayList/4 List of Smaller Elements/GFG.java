// 4 List of smaller elements
// https://practice.geeksforgeeks.org/problems/list-of-smaller-elements/1/?track=Java-Collections-ArrayList&batchId=318

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //Creating an object of Scanner class
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();//taking the number of testcases
		
		while(t-->0)
		{
		  //Declaring and Initializing an ArrayList
		  ArrayList<Integer>arr=new ArrayList<>();
		  
		  //taking the total number of elements
		  int n=sc.nextInt();
		  
		  for(int i=0;i<n;i++)
		  arr.add(sc.nextInt());
		  
		  //taking in the the value of k
		  int k=sc.nextInt();
		  
		  //calling the getSmaller method
		  ArrayList<Integer>ans=getSmaller(arr,k);
		  
		  //printing all the numbers which are smaller than k
		  for(int i:ans)
		  System.out.print(i+" ");
		   
		  System.out.println();
		}
	}
	
 // } Driver Code Ends
//User function Template for Java

public static  ArrayList<Integer> getSmaller(ArrayList<Integer>arr,int k)
{
    //Your code here
    ArrayList<Integer> al = new ArrayList<Integer>();
    for( int i=0; i<arr.size(); i++){
        if( arr.get(i) < k)
             al.add( arr.get(i));
    }
    return al;
}

// { Driver Code Starts.

	
}

  // } Driver Code Ends
  /* Input:
n = 6
arr = {8, 100, 20, 40, 3, 7}
k = 10
Output:
8 3 7
Explanation:
Here k is 10. From left-to-right the
elements less than 10 are 8 3 7.*/