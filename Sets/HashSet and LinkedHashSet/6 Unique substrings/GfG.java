// Program 6: Unique Strings
// https://practice.geeksforgeeks.org/problems/unique-substrings0524/1/?track=Java-Collections-HashSet&batchId=318#

//Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.ListIterator;
class GFG {
	public static void main (String[] args) {
		
		//Taking input using class Scanner
		Scanner sc = new Scanner(System.in);
		
		//Taking count of total number of testcases
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		  
		  
		  //Taking the string as input
		  String str=sc.nextLine();
		  Solution ob = new Solution();
		  //Calling the unique_substring method
		  //and printing the result
		  System.out.println(ob.unique_substring(str));
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
        public static int unique_substring(String str)
    {
        //Your code here
        Set<String> hs = new HashSet<>();
        // from the 2 loops we get all substrings and adding to HashSet we get distinct substrings
         for (int i = 0; i <= str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++){
                    hs.add(str.substring(i,j));
            }
        }
       return hs.size();
    }
}

// Input:
// jaja

// Ouput:
// 7

// Explanation:
// str = jaja. The substrings will be j, a, j, a, 
// ja, aj, ja, jaj, aja, jaja. Out of these the 
// unique are j, a, ja, aj, jaj, aja, jaja.