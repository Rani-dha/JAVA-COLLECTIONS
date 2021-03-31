// Program: https://practice.geeksforgeeks.org/problems/almost-equal-java/0/

/*Function to count number of characters 
* to make s1 and s2 equal
* s1 : first string
* s2 : second string
*/
class Geeks{
    
    static int coutChars(String s1, String s2)
    {
      int hash[] = new int[26];

       int l1= s1.length(), l2 = s2.length(); 
      for(int i=0; i<l1; i++){
          hash[s1.charAt(i)-'a']++;
      }
      for(int i=0; i<l2; i++){
          hash[s2.charAt(i)-'a']--;
      }

      int count=0;
      for(int i=0;i<26; i++){
          if(hash[i] != 0) {
            count = count + Math.abs(hash[i]);              
          }
       }
      return count;        
    }
}

/**
 * Example 1:

Input:
madame
madam

Output:
1

Explanation:
String S1 = madame, string S2 = madam. character 'e' in 
first string is need to be deleted to make S1 equal to S2.
 */

 /**
  * Example 2:

Input:
suryansh
suryanshzzawesome

Output:
9

Explanation:
String S1 = suryansh, string S2 = suryanshzzawesome. 
All character after "suryansh" in second string are 
need to be deleted to make S1 equal to S2.
  */