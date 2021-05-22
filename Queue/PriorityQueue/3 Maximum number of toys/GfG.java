// Program 3: Maximum number of toys
//  https://practice.geeksforgeeks.org/problems/maximize-number-of-toys/1/?track=Java-Collections-PriorityQueue&batchId=318#

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
		    
		    //creating an ArrayList
		    ArrayList<Integer>arr=new ArrayList<>();
		    
		    //adding the elements to the ArrayList
		    for(int i=0;i<n;i++)
		    {
		        arr.add(sc.nextInt());
		    }
		    
		    //taking total amount
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    //calling max_toys method
		    //and then printing the result
		    System.out.println(ob.max_toys(arr,n,k));
		}
		
	}
	
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int max_toys(ArrayList<Integer>arr, int n, int k)
    {
       //Your code here
       int toys=0;
       PriorityQueue<Integer> pq = new PriorityQueue<Integer>(arr);
       
       while( k>=0 && !pq.isEmpty() && k >= pq.peek()){
           k = k-pq.poll();
           toys++;
       }
       return toys;
    }
}


/* 

Example 1:

Input:
5
5 4 3 2 1
8

Output:
3

Explanation:
With k=8 amount, you can purchase toys 
with prices 3 2 1 so total of 3 toys.
Example 2:

Input:
5
1 2 3 4 5
15
â€‹
Output:
5

Explanation:
With k=15 amount, you can purchase all the toys.

*/