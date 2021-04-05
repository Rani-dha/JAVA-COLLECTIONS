// Program 4: https://practice.geeksforgeeks.org/problems/vowels-in-string/1/

class Solution
{
    public static int countVowels(String str)
    {
        //Initializing vowel 
        //count to 0
        int count = 0;
        
        //Incrementing the vowel count 
        //if a vowel is encountered
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
            
        }
        
        //returning the total vowel count
        return count;
    }
}