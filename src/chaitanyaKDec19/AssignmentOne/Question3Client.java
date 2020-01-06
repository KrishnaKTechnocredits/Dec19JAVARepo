package chaitanyaKDec19.AssignmentOne;

/*
 * Write a program to print the sum of all the element of an array of size having N.
 */

class Question3Client{
        
    public static void main(String args[]){
        
        int[] numberArray = new int[]{-10,20,-30,10};
        
        System.out.println("Total of the numbers in array is: "+new Question3().calculateSum(numberArray));
        
    }
}