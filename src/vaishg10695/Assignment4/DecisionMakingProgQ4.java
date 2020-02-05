//4.Find whether a number is negative positive orzero

package vaishg10695.Assignment4;

public class DecisionMakingProgQ4 {
	
	
	void neg_Positive(int num)
	{
		
		if(num>0)
			System.out.println("Given number is Positive");
		else
			System.out.println("Given number is Negative");
		if(num==0)
			System.out.println("Given number is zero");

	}
	

	public static void main(String[] args) {

		DecisionMakingProgQ4 q4=new DecisionMakingProgQ4();
		
		int num=2;
		
		q4.neg_Positive(num);
	}

}
