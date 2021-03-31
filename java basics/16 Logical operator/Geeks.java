// Program: https://practice.geeksforgeeks.org/problems/logical-operators-java/0/

class Geeks{
    
    static void logicOp(boolean a, boolean b){
        
        System.out.println( (a&&b) + " " + (a||b) + " " + ((!a) && (!b)) );
        /*output (a&&b), (a||b), and ((!a)&&(!b))separated by spaces*/
    }
}