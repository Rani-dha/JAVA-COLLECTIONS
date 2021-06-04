// Program 3: Hashing for PairTwo
// https://practice.geeksforgeeks.org/problems/hashing-for-pair-2/1/?track=Java-Collections-HashSet&batchId=318#

//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.io.*;

class Gfg
{
    public static void main (String[] args) {
        
        //Taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        
        //Taking total count of testcases
        int testcases = sc.nextInt();
        
        
        while(testcases-- > 0)
        {
            //taking size of array
            int N = sc.nextInt();
            int arr[] =  new int[N];  //array declaration
            
            for(int i = 0; i < N; i++)
             arr[i] = sc.nextInt(); //Input the array
             
            int sum = 0; 
            
            //taking value of sum
            sum = sc.nextInt();
            
            //Creating an object of class Geeks
            Geeks obj = new Geeks();
            
            //Calling sumExists method of class Geeks
            //and printing the result
            System.out.println(obj.sumExists(arr, N, sum));
        }
    }
}


 // } Driver Code Ends
//User function Template for Java


class Geeks
{
    //Complete this function
    //Function to check if two numbers in array have sum equal to the given sum.
    public static int sumExists(int arr[], int N, int sum)
    {
        //Your code here
        HashSet<Integer> h = new HashSet<>();
        for(int i=0 ; i<N; i++){
            if( h.contains(sum-arr[i]))
               return 1;
            else 
               h.add(arr[i]);
        }
        return 0;
     }
      
    
}

// { Driver Code Starts.
  // } Driver Code Ends


//   Example 1:

// Input:
// N = 10
// arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
// sum = 14

// Output: 
// 1

// Explanation: 
// there exists a pair which 
// gives sum as 14 example 
// (4,10),(5,9) etc.

// Example 2:

// Input:
// N = 4
// arr[] ={4, 3, 5, 6}
// sum = 12

// Output: 
// 0

// Explanation: 
// there does not exist any
// such pair which gives sum as 12.
