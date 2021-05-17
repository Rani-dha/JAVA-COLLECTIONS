// Program 4: Reverse first k elements of the queue
// https://practice.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1/?track=Java-Collections-Queue&batchId=318#

import java.util.*;
class ModifyQueue{
    public static void main(String[] args){
        
        //Taking input using class Scanner
        Scanner sc=new Scanner(System.in);
        
        //Taking total number of testcases
        int t=sc.nextInt();
        
        while(t-->0){
            //Taking count of total number of elements
            int n=sc.nextInt();
            
            //Taking count of total elements
            //that need to be reversed
            int k=sc.nextInt();
            
            //Creating a Queue
            Queue<Integer> q=new LinkedList<>();
            
            //adding all the elements to the Queue
            while(n-->0){
                q.add((int)sc.nextInt());
            }
            
            //Creating an object of class GfG
            GfG g=new GfG();
            
            //calling modifyQueue of class GfG
            //and passing Queue and k as arguments
            //and storing the reuslt in a new Queue
            Queue<Integer> ans=g.modifyQueue(q,k);
            
            //Printing all the elements from the
            //new Queue and polling them out
            while(!ans.isEmpty()){
                int a=ans.peek();
                ans.poll();
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class GfG
{
    //Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
      //add code here.
      Deque<Integer> stack = new ArrayDeque<Integer>();
      
      // Pushing first k elements into the stack
      for(int i=0; i<k;i++)
         stack.push(q.poll());
      
      // Pushing back first k elements in reverse order to the queue   
      while( !stack.isEmpty()) 
            q.offer(stack.pop());
      
      //To get required output removing item at front and adding it to the rear    
      for(int i =0; i<q.size()-k;i++)
            q.offer(q.poll());
            
     return q;        
            
         
    }
}

/* 

Input:
5 3
1 2 3 4 5

Output: 
3 2 1 4 5

Explanation: 
After reversing the given
input from the 3rd position the resultant
output will be 3 2 1 4 5.

*/