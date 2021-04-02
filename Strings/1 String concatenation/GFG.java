// Program 1: https://practice.geeksforgeeks.org/problems/string-concatenation/1/

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		
		//Taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total count of testcases
		int t=sc.nextInt();
		while(t-->0)
		{
		    //Declaring a new ArrayList
		    ArrayList<String>arr=new ArrayList<>();
		    
		    //taking total count of elements
		    int n=sc.nextInt();
		    
		    //adding elements to the ArrayList
		    for(int i=0;i<n;i++)
		    arr.add(sc.next());
		    
		    //calling the method concatenateStrings
		    //and passing the ArrayList and printing
		    //the result
		    System.out.println(concatenateStrings(arr));
		}
	}
	
	
 // } Driver Code Ends
//User function Template for Java

public static String concatenateStrings(ArrayList<String>arr)
{
    //Your code here
    String res = "";
    Iterator i= arr.iterator();
    while(i.hasNext())
       res += i.next();
       
    return res;   
    
}


// { Driver Code Starts.

}  // } Driver Code Ends