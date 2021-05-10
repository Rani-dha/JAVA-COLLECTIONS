//
//

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking the number of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // Creating an ArrayList
            ArrayList<Integer> v = new ArrayList<>();

            // Taking the number of elements
            int n = sc.nextInt();

            // adding all the elements to the ArrayList
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                v.add(x);
            }
            Solution ob = new Solution();
            // calling the method profit
            // and printing the result
            System.out.println(ob.profit(v));
        }
    }

}// } Driver Code Ends

// User function Template for Java

class Solution {
    public static int profit(ArrayList<Integer> v) {
        // Your code here
        int totalProfit = 0;
        int len = v.size();
        Deque<Integer> stack = new ArrayDeque<Integer>();

        for (int i = len - 1; i >= 0; i--) {
            while (stack.isEmpty() == false && stack.peek() < v.get(i)) // Removing the elements in the stack which is smaller than ArrayList[i]
                stack.pop(); 

            totalProfit += (stack.isEmpty() == true ? v.get(i) : stack.peek() - v.get(i)); 
            // If there is no nextGreater elements add it, i.e) v.get(i)
            // If nextGreater element is present then calculate profit by nextGreater minus current item i.e) stack.peek() - v.get(i);

            stack.push(v.get(i));
        }

        return totalProfit;

    }
};