package rutujaGDec19.assignment1;
/* To print Sum of Integers */
public class Question1 {
	
		int Sum(int x , int y){ // methods that accepts two int parameters and returns integer
			return x+y;
		}
	    public static void main(String[] args){
	    	Question1 q =  new Question1();  //creating an object 
			System.out.println("Sum is : "+q.Sum(10,20) ); //(passing parameters) and printing
			
		}
	}
