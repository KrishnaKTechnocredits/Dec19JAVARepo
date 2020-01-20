package chaitanyaKDec19.AssignmentOne;

/*
 * Write a program to print the sum of element’s squares of an array having size of N.
 */

class Question4{
    
    int calculateSquareSum(int[] num){
        
        int sum=0;
        
        for(int i=0; i<num.length; i++){
            
            sum = sum+(num[i]*num[i]);
        }
        
        return sum;
    }
}