// 6) First Repeating element in a array
// https://practice.geeksforgeeks.org/problems/first-repeating-element4018/1/?track=Java-Collections-HashMap&batchId=318#


import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //Taking input using class Scanner
		Scanner sc=new Scanner(System.in);
		
		//Taking total count of testcases
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    //taking total count of elements
		    int n=sc.nextInt();
		    
		    //creating a new array of size n
		    int arr[]=new int[n];
		    
		    //inserting elements to the array
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    Solution ob = new Solution();
		    //calling firstRepeated method 
		    //and printing the result
		    System.out.println(ob.firstRepeated(arr,n));
		}
		
	}
}// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to return the position of the first repeating element.
    public static int firstRepeated(int []arr, int n) 
    {
        //Your code here
        int index = -1;
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i= arr.length-1;i>=0;i--){
            if( hs.contains(arr[i]))
                index = i+1;
            else
                hs.add(arr[i]);
        }
        return index;
    }
}


/* Finding using HashMap
public static int firstRepeated(int []arr, int n) {
        
        boolean flag = false;
        int ans = -1;
        
        //using map to store frequency of each element.
        Map<Integer, Integer> m = new HashMap<>(); 
        
        //storing the frequency of each element in map.
        for (int i = 0; i < n; i++) { 
            if (m.containsKey(arr[i])) { 
                m.put(arr[i], m.get(arr[i]) + 1); 
            } 
            else { 
                m.put(arr[i], 1); 
            } 
        } 
        
        //iterating over the array elements.
        for (int i = 0; i < n; i++)
        {
            //if frequency of current element in map is greater than 1,
            //then we store the index and break the loop.
            if (m.get(arr[i])>1)
            {
                ans = i+1;
                break;
            }
        }
        
        //returning the position of the first repeating element.        
        return ans; 
      
    } 
*/


// Example 1:
// Input:
// n = 7
// arr[] = {1, 5, 3, 4, 3, 5, 6}
// Output: 2
// Explanation: 
// 5 is appearing twice and its first appearence is at index 2 which is less than 3 whose first occuring index is 3.

// Example 2:
// Input:
// n = 4
// arr[] = {1, 2, 3, 4}
// Output: -1
// Explanation: 
// All elements appear only once so answer is -1.

