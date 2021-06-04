// Program 5: Union of two arrays
// https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1/?track=Java-Collections-HashSet&batchId=318#

//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //Taking input using class Scanner
		Scanner sc=new Scanner(System.in);
		
		//Taking total count of testcases
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    
		    int n,m;
		    
		    //taking size of array a
		    n=sc.nextInt();
		    
		    //taking size of array b
		    m=sc.nextInt();
		    
		    //Creating 2 array of size n and m
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
		    Solution ob=new Solution();
		    //calling doUnion method and printing the results
		    System.out.println(ob.doUnion(a,n,b,m));
		}
		
	}
}// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashSet<Integer> h = new HashSet<>();
        int unionCount = 0; 
        for(int i=0; i<n; i++){
            if( !h.contains(a[i])){
                h.add(a[i]);
                unionCount++;
            }
        }
        
        for(int i=0;i<m; i++){
            if( !h.contains(b[i])){
                h.add(b[i]);
                unionCount++;
            }
        }
        return unionCount;
    }
}