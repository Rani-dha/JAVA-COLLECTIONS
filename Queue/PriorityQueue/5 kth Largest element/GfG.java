// Program 5: kth Largest element
// https://practice.geeksforgeeks.org/problems/kth-largest-element5034/1/?track=Java-Collections-PriorityQueue&batchId=318#

import java.util.*;
import java.io.*;
import java.lang.*;

class gfg {
    public static void main(String args[]) {
        
        //taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        
        //taking count of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            
            //taking count of elements
            int n = sc.nextInt();
            
            //taking the value of k
            int k = sc.nextInt();

            //Creating an array of size n
            int arr[] = new int[n];

            //adding all the elements to arr
            for (int i = 0; i < n; ++i) arr[i] = sc.nextInt();

            //calling the method KthLargest of class solve
            //and printing the result
            System.out.println(new Solution().KthLargest(arr, n, k));
        }
    }
}// } Driver Code Ends





class Solution 
{
    //Function to return kth largest element from an array.
    public static int KthLargest(int arr[], int n, int k) 
    {
        // Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<k;i++)
           pq.add(arr[i]);
           
        for(int i=k; i< arr.length; i++){
            if( pq.peek() < arr[i]){
                pq.poll();
                pq.add( arr[i]);
            }
        }   
        
        return pq.poll();
        
        
    }
}


/**
 * Input:
N = 5, K = 5
arr[] = {4, 3, 7, 6, 5} 
Output: 
3
Explanation: 
Fifth largest element
in the array is 3.
 */