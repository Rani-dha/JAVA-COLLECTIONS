// Program 4: Removing consecutive duplicates
// https://practice.geeksforgeeks.org/problems/removing-consecutive-duplicates-1587115621/1/?track=Java-Collections-Stack&batchId=318#

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//taking the length of the string
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    
		    //taking the string
		   String str = br.readLine().trim();
		   
		   //calling removeConsecutiveDuplicates method of class solve
		   System.out.println(new Solution().removeConsecutiveDuplicates(str));
		}
	}
}// } Driver Code Ends





class Solution
{
    //Function to remove consecutive duplicates from given string using Stack.
    public static String removeConsecutiveDuplicates(String str)
    {
        // Your code here
        // My logic to remove consecutive duplicates.
        Deque<Character> stack = new ArrayDeque<Character>();
        stack.push(str.charAt(0));
        String res = Character.toString(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if( stack.peek() != str.charAt(i)){
                res+= Character.toString(str.charAt(i));
                stack.push(str.charAt(i));
            }
        }
        return res;
    }
}