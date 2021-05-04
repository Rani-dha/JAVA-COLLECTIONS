// 2 ArrayList operations
// https://practice.geeksforgeeks.org/problems/arraylist-operations/1/?track=Java-Collections-ArrayList&batchId=318#

//Initial Template for Java
import java.util.Scanner;
import java.util.*;

class ArrayList_Collection
{
	public static void main(String args[])
	{
	    //Creating an object of class Scanner
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();//Taking number of testcases
		while(T>0)
		{
			ArrayList<Integer> A = new ArrayList<Integer>();//Declaraing and Initializing an ArrayList
			int q = sc.nextInt();//Taking number of queries
			
			while(q>0)
			{
				char c = sc.next().charAt(0);
				if(c == 'a')
				{
					int x = sc.nextInt();
					add_to_ArrayList(A,x);
				}
				
				if(c == 'b')
					sort_ArrayList_Asc(A);
					
				if(c == 'c')
					reverse_ArrayList(A);
					
				if(c == 'd')
					System.out.print(size_Of_ArrayList(A)+" ");
					
				if(c == 'e')
					print_ArrayList(A);
				
				if(c == 'f')
					sort_ArrayList_Desc(A);
				
			q--;
			}
		T--;
		System.out.println();
		}
	}
	
 // } Driver Code Ends
//User function Template for Java


public static void add_to_ArrayList(ArrayList<Integer> A, int x)
{
	//Your code here
	//Just add, don't print anything
	A.add(x);
}	

public static void sort_ArrayList_Asc(ArrayList<Integer> A)
{
	//Your code here
	//Just sort, don't print anything
	Collections.sort(A);
}

public static void reverse_ArrayList(ArrayList<Integer> A)
{
	//Your code here
	//Just reverse, don't print anything
    Collections.reverse(A);
    
}

public static int size_Of_ArrayList(ArrayList<Integer> A)
{
	//Your code here
	//Return the size of ArrayList
	return A.size();
}

public static void sort_ArrayList_Desc(ArrayList<Integer> A)
{
	//Your code here
	//Just sort in desc order, don't print anything
	Collections.sort( A, Collections.reverseOrder());
}

public static void print_ArrayList(ArrayList<Integer> A)
{
	//Your code here
	//Print the elements of A, don't add new line
	//Iterator it = A.Iterator();
	
	for( int i =0; i< A.size(); i++){
	    System.out.print( A.get(i) + " ");
	}

}


// { Driver Code Starts.

}  // } Driver Code Ends


/* In this question we will be implementing various operations on ArrayList. There will be different type of queries.
A query can be of five types:
1. a x (Adds an element x to the ArrayList A at the end)
2. b (Sorts the ArrayList A in ascending order)
3. c (Reverses the ArrayList A)
4. d (prints the size of the ArrayList)
5. e (prints space separated values of the ArrayList)
5. f (Sorts the ArrayList A in descending order)

Example 1:

Input:
6
a 4 a 6 a 7 b c e

Output:
7 6 4

Explanation :
There are six queries.
Queries are performed in this order
1. a 4 {ArrayList has 4}
2. a 7 {ArrayList has 4,7}
3. a 6 {ArrayList has 4,7,6}
4. b {sorts the ArrayList in ascending order,
      ArrayList now is 4 6 7}
5. c {reverse the ArrayList to 7 6 4}
6. e {prints the elements of ArrayList i.e. 7 6 4}
Example 2: */