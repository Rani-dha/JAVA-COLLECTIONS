// Program : https://practice.geeksforgeeks.org/problems/consonants-and-vowels-check-java/0/

class Geeks{
    
    static void checkString(String s)
    {
       
        //Initializing vowel count 
        //and consonant count to 0
        int v=0;
        int c=0;
        
        //Increment vowel count if 
        //the character encountered is
        //vowel, else incrementing the
        //consonant count if it is not space
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a'|| s.charAt(i) == 'e' || s.charAt(i) == 'i' ||
            s.charAt(i) == 'o' || s.charAt(i) == 'u' ){
                v++;
            }
            else if(s.charAt(i) != ' '){
            // or  else if(s.charAt(i)!='a'&&s.charAt(i)!='i'&&s.charAt(i)!='u'&&s.charAt(i)!='e'&&s.charAt(i)!='o'&&s.charAt(i)!=' ') use this condition    
                c++;
            }
        }
        
        if(v>c)
           System.out.print("Yes");
        else if(c>v)
           System.out.print("No");
        else
           System.out.print("Same");
        
        System.out.println();
    }
}