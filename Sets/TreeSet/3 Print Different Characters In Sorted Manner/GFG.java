// program 3: Print Different Characters In Sorted Manner
// https://practice.geeksforgeeks.org/problems/print-different-characters-in-sorted-manner/1/?track=Java-Collections-TreeSet&batchId=318#

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.ListIterator;
class GFG {
	public static void main (String[] args) {
	    
	    //using Scanner class to take input
		Scanner sc = new Scanner(System.in);
		
		//taking total count of testcases
		int t = sc.nextInt();
		
		sc.nextLine();
		while(t-->0)
		{
		  //taking the String
		  String str=sc.nextLine();
		  
		  //calling the Sorted_Characters method
		  //with String as parameter and printing 
		  //the result
		  System.out.println(Sorted_Characters(str));
		}
		
	}
	

 // } Driver Code Ends
//User function Template for Java


public static String Sorted_Characters(String str)
{
    //Your code here
    String result = "";
    TreeSet<Character> ts = new TreeSet<>();
    for(int i=0; i<str.length(); i++)
        ts.add(str.charAt(i));
    
    for(Character s: ts)
        result += s;
    
    return result;    
}


// { Driver Code Starts.


}
  // } Driver Code Ends

//   Example 1:

//   Input:
//   abdbc
  
//   Output:
//   abcd

//   Example 2:
  
//   Input:
//   fdfdfd
  
//   Output:
//   df  
