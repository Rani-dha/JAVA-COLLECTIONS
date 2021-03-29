// problem: https://practice.geeksforgeeks.org/problems/matrix-interchange-java/0/

/*Class Geeks with its member function interchange()
* a[][] = matrix input
* r : number of rows
* c : number of columns
*/
class Geeks{
    
    static void interchange(int a[][],int r, int c){
        
        // Your code here
        int start=0, end=c-1;
        for(int i=0;i<r;i++){
            int t       = a[i][start];
            a[i][start] = a[i][end];
            a[i][end]   = t;
        }
        
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        } 
    }
}public class Geeks {
    
}
