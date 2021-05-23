// Program 6: Kth  Smallest element
// https://practice.geeksforgeeks.org/problems/kth-smallest-element5545-1587115620/1/?track=Java-Collections-PriorityQueue&batchId=318#

import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        //Taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        
        //Taking count of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking count of number elements
            int n = sc.nextInt();
            
            //taking the value of the k
            int k = sc.nextInt();
            
            //Creating an array of size n
            int arr[] = new int[n];
            
            //Inserting all the elements to the array
            for(int i = 0; i<n; ++i)
                arr[i] = sc.nextInt();
            
            //calling kthSmallest method of class solve
            //and printing the result
            System.out.println(new Solution().kthSmallest(arr, n, k));
        }
        
    }
}// } Driver Code Ends




class Solution
{
    //Function to find the kth smallest element in the array.
    public static int kthSmallest(int arr[], int n, int k)
    {
        // Your code here
        // using min heap
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i< arr.length;i++)
            pq.add(arr[i]);
    
        for(int i=1; i<k; i++)
           pq.poll();
           
        return pq.poll();  
        
        /**
        Using max heap priority queue.
        Queue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
            
        for(int i = 0; i < n; i++)
        {
            //if size of priority queue equals k, then we compare the element 
            //at top of priority queue with current element in the array.
            if(pq.size() == k)
            {
                //if top element is larger than arr[i], then we pop the top 
    	        //element and add arr[i] to the priority queue.
                if(pq.peek() >arr[i])
                {
                    pq.poll();
                    pq.add(arr[i]);
                }
            }
            //else we just add the current element to the priority queue.
            else if(pq.size() < k) 
                pq.add(arr[i]);
        }
        //returning the top element of the priority queue.    
        return pq.peek(); 
          
         */
    }
}


/**
 * Input:
N = 5, k = 5
arr[] = {4,3,7,6,5}

Output: 
7

Explanation: 
Fifth smallest element in the array is 7.
 */

