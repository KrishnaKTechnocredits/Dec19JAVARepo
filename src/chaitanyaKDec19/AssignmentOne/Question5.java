package chaitanyaKDec19.AssignmentOne;

/*
 * Write a program to list all the integers between two integers start and end(including start and end).
 */

class Question5{
    
    void displayIntergerRageUsingFor(int start, int end){
        
        System.out.print("Output using For Loop: The integers between "+start+" and "+end+" are: ");
        
        for(int i=start; i<=end; i++){
            
            System.out.print(i+" ");
            
        }
        
        System.out.println();
    }
    
    void displayIntegerRangeUsingWhile(int start, int end){
        
        System.out.print("Output using While Loop: The integers between "+start+" and "+end+" are: ");
        
        while(start <= end){
            
            System.out.print(start+" ");
            start++;
        }
        System.out.println();
    }
}