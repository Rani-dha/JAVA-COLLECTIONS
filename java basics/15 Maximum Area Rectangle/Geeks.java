// Program: https://practice.geeksforgeeks.org/problems/maximum-area-rectangle/0/

/*Class maxArea to calculate Area of rectangles
* arr : array containing rectangles
* calculate_Area : function to calculate area
* and return the maximum area
*/
class maxArea{
    
    static int calculate_Area(Rectangle arr[]){
        
        // Your code here
        int max = 0, c=0;
        for(int i=0; i< arr.length; i++){
          c = arr[i].length * arr[i].breadth;
          if( max < c){
              max = c;
          }
        }
        return max;
        
    }
    
}

/**
 * Input:
3
1 2 3 4 5 6

Output:
30

Explanation:
Area of rectangle with length 5 and 
breadth 6 is maximum, and is equal to 30.
Example 2:

Input:
2
12 3 40 5 

Output:
200

Explanation:
Area of rectangle with length 40 and 
breadth 5 is maximum, and is equal to 200.
 */