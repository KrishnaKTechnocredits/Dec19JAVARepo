//1.Find the maximum of twonumbers.

package vaishg10695.Assignment4;

public class DecisionMakingProgQ1 {
	
	void maxNumber(int a, int b)
	{
		if(a>b)
			System.out.println("a is Maximum ");
		else
			System.out.println("b is Maximum ");

	}
	public static void main(String[] args) {
		
		DecisionMakingProgQ1 q1=new DecisionMakingProgQ1();
		
		int a=10;
		int b=20;
		
		q1.maxNumber(a,b);
		
	}

}
