// Program 9: https://practice.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/0/?track=Java-Collections-String&batchId=318

class Solution{
    
    public static boolean areRotations(String s1, String s2 )
    {
        
        // Concatenate both strings and check if another string
        // occurs in the first as substring, if yes, then
        // it is rotated version, else not
        if((s1.length()==s2.length())&&((s1+s1).contains(s2)))
        {
            return true;
            
        }
        return false;
    }
    
}