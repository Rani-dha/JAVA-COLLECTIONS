// 6 Minimum vertical sum - medium level question
// https://practice.geeksforgeeks.org/problems/minimum-vertical-sum-1593518814/1/?track=Java-Collections-ArrayList&batchId=318#

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.ListIterator;
class GFG {
	public static void main (String[] args) {
	    //Creating an object of class Scanner
		Scanner sc = new Scanner(System.in);
		
		//Taking input the total number of testcases
		int t = sc.nextInt();
		
		while(t-->0)
		{
		    //Taking the total number of rows
		    int n=sc.nextInt();
		    
		    //Declaring and Initalizing an ArrayList
		    ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
		    for(int i=0;i<n;i++)
		    {
		        //Taking the number of columns
		        int m=sc.nextInt();
		        
		        //Declaring and Intializing an ArrayList for each row
		        ArrayList<Integer>temp=new ArrayList<>();
		        
		        for(int j=0;j<m;j++)
		        {
		            temp.add(sc.nextInt());
		        }
		        
		        arr.add(temp);
		    }

            //Calling the method minimum_verical_sum
		    System.out.println(minimum_vertical_sum(arr));
		}
		
	}
	

 // } Driver Code Ends
//User function Template for Java


public static int minimum_vertical_sum(ArrayList<ArrayList<Integer>> arr)
{
    //Your code here
    ArrayList<Integer> al = new ArrayList<Integer>();
    ArrayList<Integer> ans = new ArrayList<Integer>();
    for(int i=0; i<arr.size(); i++){
       al.add( arr.get(i).size());
    }
    int maxCol = Collections.max(al);
    
   // System.out.println(al + " max " + maxCol);
   
    for(int j=0; j<maxCol; j++){  
       int sum = 0;
       for(int i=0;i<arr.size(); i++){
         if( j < arr.get(i).size()){
           //System.out.print( " i " + j + " j " + i);
           sum += arr.get(i).get(j); 
         }
       }
      // System.out.println();
       ans.add(sum);
   }
   //System.out.println(al  + " " + ans);
    return  Collections.min(ans);

    
}

// { Driver Code Starts.

}  // } Driver Code Ends


/* Given an ArrayList of ArrayLists arr. Find the minimum vertical sum. ArrayLists inside the ArrayList arr may not be of the same size.


The vertical sum is defined as described below:
If we have an ArrayList of ArrayLists arr:
1 2 3 4
5 6
7 8 9
The vertical sums are: Sum of {1 5 7}, Sum of {2 6 8}, Sum of {3 9}, Sum of {4}.

Example:

Input:
arr = {{2 3 5}, {1 2}, {1 4 5 1}}
Output:
1
Explanation:
Here N  = 3. So we have 3 ArrayList
inside arr. Now, the first ArrayList
is of size 3 and elements  are {2 3 5}.
The second ArrayList is of size 2 and 
elements are {1 2}. The third ArrayList
is of size 4 and elements are {1 4 5 1}.
2 3 5
1 2
1 4 5 1
So, the vertical sums are {2+1+1},
{3+2+4}, {5+5},{1}. 1 is the min
vertical sum here.*/