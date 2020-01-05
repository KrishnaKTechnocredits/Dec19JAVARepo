package rutujaGDec19.assignment1; 
/*
 * To print all integers between a start and end point  */

public class Question5 {
	void print(int start , int end){
		for(int i = start ; i<=end;i++){
			System.out.println(i);
		}
	}
	public static void main(String[] args){
		Question5 five = new Question5();
		five.print(5 , 10);
	}

}
