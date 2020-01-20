package chaitanyaKDec19.AssignmentOne;

/*
 * Write a program to add the corresponding elements of two arrays, each of size N and print the sums. 
 * N can be any integer between 1 and 100. 1≤N≤100
 */

class Question6{
    
    int calculateSumOfArrays(int[] x, int[] y){
        
        int sum=0;
        
        for(int i=0; i<x.length; i++){
            
            sum = sum + x[i] + y[i];
        }
        
        return sum;
    }
}