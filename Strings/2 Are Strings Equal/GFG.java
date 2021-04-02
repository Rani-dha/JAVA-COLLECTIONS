// Program 2: https://practice.geeksforgeeks.org/problems/are-strings-equal/1/



/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total count of testcases
		int t=sc.nextInt();
		while(t-->0)
		{
		    //Taking two String as input
		    String s1=new String(sc.next());
		    String s2=new String(sc.next());
		    
		    //calling the method areEqual
		    //and printing the result
		    System.out.println(areEqual(s1,s2));
		}
	}
	
 // } Driver Code Ends
//User function Template for Java

public static boolean areEqual(String s1, String s2)
{
    //Your code here
    return s1.equals(s2);
}

// { Driver Code Starts.

	
}  // } Driver Code Ends