// Program: https://practice.geeksforgeeks.org/problems/count-the-specials-java/0/

// My Approach

class Geeks{
    static void countSpecials(int a[], int n, int k){
        int f = (int)Math.floor(n/k);

        Arrays.sort(a); //Sorting the array 
        int c1=0;
        for (int i=0;i<a.length; i++){
            int c2=1;
            for(int j=i+1; j<a.length; j++){
                if(a[i] == a[j])
                  c2++;   // counting till they are equal
                else 
                    break;
                
            }
            if(c2 == f)
               c1++; // when the a[i] count equals to required count we increment the total count(c1) 
            
            i+=(c2-1); //Incrementing till next different element
            // 1 2 2 2 3 3
            // if i = 1; a[1] = 2; c2 = 3 ; now incrementing i to  i+3 i.e) a[4] ==> 3

        }
        System.out.println(c1); // Printing the required count
}
}


// Editorial

/**
 class Geeks{
    static void countSpecials(int a[], int n, int k){
        
        int f = (int)Math.floor(n/k);
        int count = 0;
        
        //creating a freqeuncy 
        //storing array
        int hash[] = new int[1001];
        
        Arrays.fill(hash, 0);
        
        
        //incrementing the frequency
        //of element encountered
        for(int i = 0;i<n;i++){
            hash[a[i]]++;
            
        }
        
        //incrementing count if frequency is f
        for(int i=0;i<n;i++)
        {
            if(hash[a[i]] == f){
                count++;
                hash[a[i]]=-1; // Decrementing to avoid multiple count
            }
        }
        
        //printing the count
        System.out.println(count);
        
    }
}
 */



