// Program 8: 

class Solution
{
    public static String caseConversion(String str)
    {
        //initializing an empty String
        String toLower = "";
        
         //concatenating charcters of String
        //after converting them to lowercase
        //to toLower String
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) >= 65 && str.charAt(i) <= 92)
                toLower += (char)(str.charAt(i)+32);
            else
                toLower+=(char)str.charAt(i);
        }
        
        //returing the LowerCase String
        return toLower;
    }
}

