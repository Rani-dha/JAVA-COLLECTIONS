
// Program : https://practice.geeksforgeeks.org/problems/pair-in-java/0/

// Custom comparator class to sort the pairs
// on the basis of first element
class custom_Compare{
    
    static void sortPairs(Pair arr[], int N){
        
        //using sort() method with Comparator
        //and sorting the values according
        //to x in non-decreasing order
        Arrays.sort(arr, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
              return p1.x - p2.x;
            }
        });
        
        //printing the x,y Pairs
        for(int i = 0;i<N;i++){
            System.out.print(arr[i].x + " " + arr[i].y + " ");
        }
        System.out.println();
    }
}

/**
 * Questions:
 * Let's learn about Java Classes and how they can be useful.

Given an array A of N pairs of integers. The task is to sort the array on the basis of first element.

Hint: You may write a custom comparator. Read here(https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/)

Example 1:

Input:
3
1 2 5 4 3 6

Output:
1 2 3 6 5 4

Explanation:
Pairs are (1, 2), (5, 4), (3, 6). Sorting them on 
basis of first element, we have (1, 2), (3, 6), (5, 4).
Example 2:

Input:
2
4 8 2 24

Output:
2 24 4 8

Explanation:
Pairs are (4, 8), (2, 24). Sorting them on 
basis of first element, we have (4, 8), (2, 24).

Constraints:
1 <= N <= 104
1 <= A[i] <= 105
 */