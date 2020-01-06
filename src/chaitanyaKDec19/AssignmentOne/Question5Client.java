package chaitanyaKDec19.AssignmentOne;

/*
 * Write a program to list all the integers between two integers start and end(including start and end).
 */

class Question5Client{
    
    public static void main(String[] args){
        
    	Question5 intRage = new Question5();
        
        //Calling method that uses for loop
        intRage.displayIntergerRageUsingFor(-5, 5);
        
        //Calling method that uses while loop
        intRage.displayIntegerRangeUsingWhile(1, 9);
    }
}