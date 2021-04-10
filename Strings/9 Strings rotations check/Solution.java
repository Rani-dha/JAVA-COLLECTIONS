// Program 9:

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