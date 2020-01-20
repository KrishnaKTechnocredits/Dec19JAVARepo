package chaitanyaKDec19.AssignmentOne;

/*You are given two numbers N and M, print the absolute difference between two numbers i.e.
* Approach:
* Therefore, if the value is negative, then make it positive by multiplying it with −1. Print out the value of result.
*/

class Question7{
    
    void displayDiffBetNumber(int x, int y){
        
        if((x-y)<0)
            System.out.println("Absoulte Differce Between "+x+" and "+y+" is: "+((x-y)*-1));
        else
            System.out.println("Absoulte Differce Between "+x+" and "+y+" is: "+(x-y));
    }
}