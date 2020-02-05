// 2.Find the largest of three numbers using Logical And operator.

package vaishg10695.Assignment4;

public class DecisionMakingProgQ2 {

	void maxNumber(int a, int b, int c)
	{
		if((a>b)&&(a>c))
		{
			System.out.println("a is Maximum ");
		}
		else
		{
			if((b>a)&&(b>c))
			{
			System.out.println("b is Maximum ");
			}
			else
				System.out.println("c is Maximum ");

		}

	}
	public static void main(String[] args) {
		
		DecisionMakingProgQ2 q2=new DecisionMakingProgQ2();
		
		int a=10;
		int b=50;
		int c=20;
		
		q2.maxNumber(a,b,c);
		
	}
	}

