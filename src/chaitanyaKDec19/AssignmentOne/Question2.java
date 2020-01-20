package chaitanyaKDec19.AssignmentOne;

/*
 *Write a program to print the sum of all the elements of an array of size 4. 
 */

class Question2{
    
    int calculateSum(int[] num){
        
        int sum=0;
        
        for(int i=0; i<num.length; i++){
            
            sum = sum+num[i];
        }
        
        return sum;
    }
}