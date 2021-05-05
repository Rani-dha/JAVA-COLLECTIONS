// Program 3: LinkedList Josephus Circle Medium question
// https://practice.geeksforgeeks.org/problems/linkedlist-josephus-circle/1/?track=Java-Collections-LinkedList&batchId=318


//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Taking all the testcases
		int t = sc.nextInt();
		
		while(t-->0)
		{
		    //taking input total number people
		    int n=sc.nextInt();
		    
		    //taking input interval number
		    int k=sc.nextInt();
		    
		    //calling the method josephus
		    System.out.println(josephus(n,k));
		}
	}
	
 // } Driver Code Ends
//User function Template for Java

public static int josephus(int n, int k)
{
    //Your code here
    
    LinkedList<Integer> list = new LinkedList<>();
        
        for(int i=0;i<n;i++)
        {
            list.add(i);
        }
        
        Iterator<Integer> it = list.iterator();
        
        while(list.size()>1)
        {
            int count= 0;
            
            while(count<k)
            {
                while(it.hasNext() && count<k)
                {
                    it.next();
                    count++;
                }
                
                if(count<k)
                {
                    it= list.iterator();
                    it.next();
                    
                    count++;
                }
            }
            it.remove();
            
            
        }
        
        return list.getFirst();
}

// { Driver Code Starts.

	
}  // } Driver Code Ends
