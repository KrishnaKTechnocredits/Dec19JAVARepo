//5.Find greater of two numbers using ternary operator

package vaishg10695.Assignment4;

public class DecisionMakingProgQ5 {


	void largestNumber(int a, int b)
	{
		int result=a>b?a:b;
		 
		System.out.println("Greater number is "+result);
	}
	public static void main(String[] args) {
		
		DecisionMakingProgQ5 q5=new DecisionMakingProgQ5();
		
		int a=100;
		int b=20;
		
		q5.largestNumber(a,b);
		
	}
}
