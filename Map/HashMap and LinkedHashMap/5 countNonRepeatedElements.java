// 5) Count non repeated elements
// https://practice.geeksforgeeks.org/problems/count-distinct-elements-1587115620/1/?track=Java-Collections-HashMap&batchId=318#

//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        //Taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        
        while(t-- >0)
        {
            //taking total count of elements
            int n=sc.nextInt();
            
            //Declaring and Initializing an array of size n
            int arr[] = new int[n];
            
            //Inserting elements to the array
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
                
            //calling countNonRepeated method
            //of class Hashing and printing the result
            System.out.println(new Solution().countNonRepeated(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: input array
    // n: size of array
    
    //Function to return the count of non-repeated elements in the array.
    static long countNonRepeated(int arr[], int n)
    {
        // add your code
        long result =0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<n;i++)
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
            
        for(Map.Entry<Integer, Integer> m: hm.entrySet()){
            if( m.getValue() == 1)
                result++;
        }    
        return result;
    }
}

// Input:
// 10
// 1 1 2 2 3 3 4 5 6 7

// Output: 
// 4

