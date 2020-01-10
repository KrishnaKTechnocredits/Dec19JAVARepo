package chaitanyaKDec19.AssignmentOne;

/*
 * Write a program to print the sum of all the elements of an array of size 4.
 */

class Question2Client{
        
    public static void main(String args[]){
        
        int[] numberArrayOne = new int[4];
        numberArrayOne[0] = 10;
        numberArrayOne[1] = 11;
        numberArrayOne[2] = 12;
        numberArrayOne[3] = 14;
    
        
        System.out.println("Total of the numbers in array is: "+new Question2().calculateSum(numberArrayOne));
        
    }
}