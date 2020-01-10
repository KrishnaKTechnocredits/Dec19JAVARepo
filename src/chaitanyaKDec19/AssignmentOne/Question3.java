package chaitanyaKDec19.AssignmentOne;

/*
 * Write a program to print the sum of all the element of an array of size having N.
 */

class Question3{
    
    int calculateSum(int[] num){
        
        int sum=0;
        
        for(int i=0; i<num.length; i++){
            
            sum = sum+num[i];
        }
        
        return sum;
    }
}