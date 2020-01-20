package pravinSDec19.assignment1;
/*
 * Created By: Pravin Sarda
 * 
 * Assignment 1 - Question 5
 * Write a program to list all the integers between two integers start and end(including start and end).
	Hint:
		Input: start = 5, end = 10
		Output: 5 6 7 8 9 10 
 */
public class Question5 {

	
	void display(int start, int end) {
		
		if(start<end) {
			
			for(int i=start; i<=end; i++) {
				
				System.out.print(i+" ");
				
			}	
			
		}
		else {
			
			for(int i=end; i<=start; i++) {
				
				System.out.print(i+" ");
				
			}	
			
		}

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question5 list = new Question5();
		
		list.display(10, 8);

	}

}
