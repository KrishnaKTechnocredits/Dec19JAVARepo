package ankitaPDec19.assignment1;

public class Question7 {
	
	void display(int a, int b){
        int diff = 0;
	    diff = a-b;
	    if(diff < 0){
	      diff = diff*(-1);
		}
	    System.out.println(diff);  
		
	}
	public static void main(String [] a)
	{ 
		Question7 diff = new Question7();
		diff.display(2,10);
	}

}
