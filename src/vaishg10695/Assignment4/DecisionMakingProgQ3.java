//3. Find whether a number is odd or evennumber

package vaishg10695.Assignment4;

public class DecisionMakingProgQ3 {
	
	void oddEven(int num)
	{
		if (num%2==0)
			System.out.println("given Number "+num+ " is even");
		else
			System.out.println("given Number "+num+ " is odd");

	}

	public static void main(String[] args) {
		
		DecisionMakingProgQ3 q3=new DecisionMakingProgQ3();
		
		int num=50;
		
		q3.oddEven(num);
		
	}

}
