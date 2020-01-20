package chaitanyaKDec19.AssignmentOne;

/*
 * Write a program to print the sum of element’s squares of an array having size of N.
 */

class Question4Client{
        
    public static void main(String args[]){
        
        int[] numberArray = new int[]{-10,20,-30,10};
        
        System.out.println("Total of the square of the numbers in array is: "+new Question4().calculateSquareSum(numberArray));
        
    }
}