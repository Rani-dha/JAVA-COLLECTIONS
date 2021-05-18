// Program 6: Generate Binary Numbers
// https://practice.geeksforgeeks.org/problems/generate-binary-numbers-1587115620/1/?track=Java-Collections-Queue&batchId=318#

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])
    {
        //Taking input using class Scanner 
        Scanner sc = new Scanner(System.in);
        
        //Taking the number of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking the range
            int n = sc.nextInt();
            
            //creating an ArrayList
            ArrayList<String> res = new ArrayList<String>();
            
            //calling the generate method of class solve
            //and storing the result in an ArrayList
            res = new solve().generate(n);
            
            //printing all the elements of the ArrayList
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends





class solve{
    
    //Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int N)
    {
        // Your code here
        //using a list to store the answer.  
        ArrayList<String> result = new ArrayList<String>();   
       
        //using a queue of string which helps in generating binary numbers.
        Queue<String> queue = new LinkedList<String>();

        //pushing first binary number i.e. 1 in queue.
        queue.add("1");
        for(int count = 0; count<N; count++){
            String current = queue.poll(); //storing the front element of queue and popping it.
            result.add(current);  // Adding the popped element into the result.
           
           // For generating the binary numbers below code is used.
            queue.add(current + "0");
            queue.add(current + "1");
        }
        
        return result;
    }
    
}


/* 

Example 1:

Input:
N = 2
Output: 
1 10
Explanation: 
Binary numbers from
1 to 2 are 1 and 10.

Example 2:

Input:
N = 5
Output: 
1 10 11 100 101
Explanation: 
Binary numbers from
1 to 5 are 1 , 10 , 11 , 100 and 101.

*/