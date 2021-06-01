// Program 5: Deque deletion at different cases
// https://practice.geeksforgeeks.org/problems/deque-deletion/1/?track=Java-Collections-Deque&batchId=318

//Function to erase the element from specified position X in deque.
public static void eraseAt(ArrayDeque<Integer> deq , int X)
{
    //Declaring and Initializing a Stack.
    Stack<Integer> stack = new Stack<Integer>(); 
    
    //pushing all the elements form 0 to X-1 range in Stack.
    for(int i=0;i<X;i++)
    {
        stack.push(deq.pollFirst());
    }
    
    //removing element at position X.
    deq.pollFirst();
    
    //adding the elements in front of the deque from the Stack.
    while(stack.isEmpty()==false)
    {
        deq.addFirst(stack.peek());
        stack.pop();
    }
}
    
//Function to erase the elements in range start (inclusive), end (exclusive).
public static void eraseInRange(ArrayDeque<Integer> deq , int start, int end)
{    
    //Declaring and Initializing a Stack.
    Stack<Integer> stack = new Stack<Integer>(); 
    
    int c=0;
    
    //pushing all elements form range 0 to start-1 and end to size-1 in Stack.
    while(deq.isEmpty()==false)
    {
        if(c>=start && c<end)
        {
            deq.pollFirst();
        }
        else
        stack.push(deq.pollFirst());
        c++;
    }
    
    //erasing the leftover elements i.e. in range from start to end.
    deq.clear();
    
    //adding all the elements of Stack in deque.
     while(stack.isEmpty()==false)
    {
        deq.addFirst(stack.peek());
        stack.pop();
    }
    
}


//Function to erase all the elements in the deque.
public static void eraseAll(ArrayDeque<Integer> deq )
{
    //erasing all the elements.
    deq.clear();
}


// Example 1:

// Input:
// 5
// 1 2 4 5 6
// 1 2

// Output: 
// 1 2 5 6 

// Explanation: 
// Here the query type is 1 
// and the position is 2. So we remove 
// element at position 2. The element at 
// position 2 is 1 2 4 5 6. So, we remove 
// 4 and get 1 2 5 6.
// Example 2:

// Input: 
// 4
// 1 2 3 4
// 2 1 3

// Output: 
// 1 4 

// Explanation: 
// Here the query type is 2 
// and the range is [1, 3). So we need to 
// delete 1 2 3 4. Remember that end is 
// exclusive. So the updated dequeue is 1 4.
// Example 3:

// Input:
// 3
// 1 2 3
// 3

// Output: 
// Empty

// Explanation: 
// Here the query is of type 3 
// so we remove all the elements of dequeue.


