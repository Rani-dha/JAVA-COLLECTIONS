// Problem: https://practice.geeksforgeeks.org/problems/predict-the-column-java/0/

/*Class Geeks with its member function columnWithMaxZero()
* a[][] = matrix input
* n : number of rows and columns each
*/
class Geeks{
    
    static int columnWithMaxZero(int a[][],int n){
        
        int max_count = 0, ans = -1;
        
        //traversing column wise
        //check for maximum occurences
        //of 0 in each column and 
        //adding the coulmn no. to ans
        for(int i = 0;i<n;i++){
            int count = 0;
            for(int j = 0;j<n;j++){
                if(a[j][i] == 0){
                    count++;
                }
            }
            if(count > max_count){
                max_count = count;
                ans = i;
            }
        }
        
        //returning the column no.
        //having maximum zeroes
        return ans;
    }
}
