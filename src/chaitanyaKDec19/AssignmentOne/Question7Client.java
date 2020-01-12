package chaitanyaKDec19.AssignmentOne;

/*You are given two numbers N and M, print the absolute difference between two numbers i.e.
* Approach:
* Therefore, if the value is negative, then make it positive by multiplying it with −1. Print out the value of result.
*/

class Question7Client{
    
    public static void main(String[] args){
        
    	Question7 absDiff = new Question7();
        
        //Showing absolute difference between negative integers
        absDiff.displayDiffBetNumber(-50, -999);
        
        //Showing absolute difference between positive integers
        absDiff.displayDiffBetNumber(121, 876);
        
        //Showing absolute difference between negative integers
        absDiff.displayDiffBetNumber(0, -999);
    }
}