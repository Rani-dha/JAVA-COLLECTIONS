// Program 5: https://practice.geeksforgeeks.org/problems/count-distinct-vowels-in-string/1/


class Solution
{
    // Complete the function
    // str: input string
    public static int countVowels(String str)
    {
        //Initializing distinct vowel
        //count to 0
        int count = 0;
        
        //initializing a boolean array of size
        //26 to check for unique vowels
        boolean present[] = new boolean[26];
        
        //Incrementing the disticnt vowel
        //count it has not been previosuly
        //found
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            int val = (str.charAt(i) - 'a');
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                if(present[val] == false)
                {
                    present[val] = true;
                    count++;
                }
            }
            
        }
        
        //returning the count of distinct vowels
        return count;


    }
}