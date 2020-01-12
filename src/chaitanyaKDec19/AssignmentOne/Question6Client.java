package chaitanyaKDec19.AssignmentOne;

/*
 * Write a program to add the corresponding elements of two arrays, each of size N and print the sums. 
 * N can be any integer between 1 and 100. 1≤N≤100
 */

class Question6Client{
    
    public static void main(String[] args){
        
        int[] arrayOne = new int[]{1, 4, 6, 9};
        int[] arrayTwo = new int[]{-9, 6, 4, 1};
        
        System.out.println("The sum of arrays is: "+ new Question6().calculateSumOfArrays(arrayOne, arrayTwo));
    }
}