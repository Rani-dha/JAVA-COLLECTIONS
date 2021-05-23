// Program 7: Minimum cost of Ropes
// https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1/?track=Java-Collections-PriorityQueue&batchId=318#

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        
        //Taking input using class Scanner
        Scanner in = new Scanner(System.in);
        
        //Taking count of testcases
        int t = in.nextInt();
        while (t-- > 0) {
            
            //takling count of elements
            int n = in.nextInt();
            
            //Creating an array of size n
            long arr[] = new long[n];

            //inserting elements to the array
            for (int i = 0; i < n; ++i) arr[i] = in.nextLong();

            //calling minCost method of class solve
            System.out.println(new Solution().minCost(arr, n));
        }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        long minCostOfRopes = 0;
        PriorityQueue<Long> pq= new PriorityQueue<Long>();
        for(int i=0; i<arr.length; i++)
           pq.add(arr[i]);
           
        for(int i=1; i<n;i++){
            long rope1 = pq.poll();
            long rope2 = pq.poll();
            long total = rope1+rope2;
            minCostOfRopes += total;
            pq.add(total);
        }   
        
        return  minCostOfRopes; 

        /* Gfg solution 
         //implementing MinHeap using priority queue.
        PriorityQueue<Long> pq = new PriorityQueue<>();
         
        for (int i = 0; i < n; i++) pq.add(arr[i]);
        Long cost = new Long("0");
        
        //using a loop while there is more than one element in priority queue. 
        while (pq.size() != 1) 
        {
            //storing the first and second numbers from priority queue.
            long x = pq.poll();  
            long y = pq.poll(); 
            
            //adding their sum in result.
            cost += (x + y);
            
            //pushing the sum of first and second numbers in priority queue.
            pq.add(x + y); 
        }
        //returning the result.
        return cost;
        */
        
    }
}

/* 

Input:
n = 4
arr[] = {4, 3, 2, 6}
Output: 
29
Explanation:
For example if we are given 4
ropes of lengths 4, 3, 2 and 6. We can
connect the ropes in following ways.
1) First connect ropes of lengths 2 and 3.
Now we have three ropes of lengths 4, 6
and 5.
2) Now connect ropes of lengths 4 and 5.
Now we have two ropes of lengths 6 and 9.
3) Finally connect the two ropes and all
ropes have connected.
Total cost for connecting all ropes is 5
+ 9 + 15 = 29. This is the optimized cost
for connecting ropes. Other ways of
connecting ropes would always have same
or more cost. For example, if we connect
4 and 6 first (we get three strings of 3,
2 and 10), then connect 10 and 3 (we get
two strings of 13 and 2). Finally we
connect 13 and 2. Total cost in this way
is 10 + 13 + 15 = 38.

*/