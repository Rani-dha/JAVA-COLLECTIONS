class Geeks{
    static void countOddEven(int a[], int n){
        
        //initializing even and odd count to 0
        int countOdd = 0, countEven = 0;
        
        //Incrementing countEven if
        //remainder is 0 when divided
        //by 2 else incrementing 
        //countOdd
        for(int i = 0;i<n;i++){
            if(a[i] % 2 == 0){
                countEven++;
            }
            else
                countOdd++;
        }
        
        //Printing the counts
        System.out.println(countOdd + " " + countEven);
    }
}