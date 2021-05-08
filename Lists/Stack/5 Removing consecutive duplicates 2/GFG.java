// Program 5: Removing consecutive duplicates 2
// https://practice.geeksforgeeks.org/problems/removing-consecutive-duplicates-2-1587115621/1/?track=Java-Collections-Stack&batchId=318#

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Reading number of testcases
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            // Reading the string that needs to processed
            String str = br.readLine().trim();

            // calling the removePair method of class solve
            String ans = new Solution().removePair(str);

            // if the new processed string is empty
            // then we print "Empty String"
            if (ans.length() <= 0)
                System.out.println("Empty String");

            // otherwise we print the new string
            else
                System.out.println(ans);
        }
    }
}// } Driver Code Ends

class Solution {
    // Function to remove pair of duplicates from given string using Stack.
    public static String removePair(String str) {
        // your code here
        Deque<Character> stack = new ArrayDeque<Character>();
        stack.push(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (stack.isEmpty() == false && stack.peek() == str.charAt(i))
                stack.pop();
            else if (stack.isEmpty() == true || (stack.isEmpty() == false && stack.peek() != str.charAt(i)))
                stack.push(str.charAt(i));
        }
        String result = "";
        while (stack.isEmpty() == false) {
            result = stack.peek() + result;
            stack.pop();
        }
        return result;
    }
}