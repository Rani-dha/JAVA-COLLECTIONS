// Program 7: https://practice.geeksforgeeks.org/problems/lowercase-to-upercase/0/?track=Java-Collections-String&batchId=318

class Solution
{
    public static String caseConversion(String str)
    {
        //initializing an empty String
        String toUpper = "";
        
        //concatenating charcters of String
        //after converting them to uppercase
        //to toUpper String
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) >= 97 && str.charAt(i) <= 122)
                toUpper += (char)(str.charAt(i)-32);
            else
                toUpper+=(char)str.charAt(i);
        }
        
        //returing the UpperCase String
        return toUpper;
    }
}