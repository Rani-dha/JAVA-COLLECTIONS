// Problem: https://practice.geeksforgeeks.org/problems/the-pattern-matcher-java/0/

       /**
         * Hints (Conditions that must satisfy):
         * 1. Length of the String should be even
         * 2. The last character should be 'y'
         * 3.Count of occurences of x should be equal to half the length of the String
         */

class Geeks{
    
    static void follPatt(String s)
    {

      int len = s.length();
      int countX = 0;
      for(int i=0; i<len; i++){
          if(s.charAt(i) == 'x'){
              c++;
          }
      }
      if( (len%2 == 0) && (s.charAt(len-1) == 'y') && (countX == len/2) )
          System.out.println("1");
      
      else
        System.out.println("0");
    }
}
