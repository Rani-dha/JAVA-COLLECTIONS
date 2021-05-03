//
//

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner Class
	    Scanner sc =new Scanner(System.in);
	    
	    //taking count of testcases
	    int t=sc.nextInt();
	    
	    while(t-->0)
	    {
	        //taking n
	        int n=sc.nextInt();
	        
	        //calling helperFunction of class Multiply
	        Multiply m=helperFunction();
	        
	        //calling method multiplyBy5 of interace Multiply
	        System.out.println(m.multiplyBy5(n));
	    }
	}
	
 // } Driver Code Ends
//User function Template for Java

/*
The interface looks like

interface Multiply {
    public int multiplyBy5(int n);
}
*/


public static Multiply helperFunction() 
{
    //Your code here
    //Implement the multiplyBy5(int n) method using lambda expression. The implemented function should return n*5
   
    Multiply m = n -> { return n*5; } ;
    // wrong -System.out.println( n + " * 5" + " = " + n*5);};
    return m;
}

// { Driver Code Starts.


}

interface Multiply {
    public int multiplyBy5(int n);
}  // } Driver Code Ends