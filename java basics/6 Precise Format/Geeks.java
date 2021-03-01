// Problem  : https://practice.geeksforgeeks.org/problems/precise-fomat-java/0/
class Geeks{
    
    static void printInFormat(float a, float b){
        float result = a/b;
        System.out.printf("%.7f", result);
        System.out.printf(" %.3f", result);
        System.out.println();       
    }    
    
}