package ankitaPDec19.assignment1;
/*Write a program to list all the integers between two integers start and end(including start and end).*/

public class Question5 {
	
	  void display(int start,int end){
	      for (int i = start; i<=end; i++)
		  { 
		    System.out.println(i); 
		  }
		}
		 public static void main(String [] args){
			 Question5 add = new Question5();
			add.display(5,10);
		}

}
