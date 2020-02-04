package poojaRDec19.Assignment3;
/*
 * 13) WAP to find number is Armstrong or not.
a. Int number = 153
i. Number is Armstrong
b. Int number = 234
i. Number is not Armstrong
Note :- Armstrong number means sum of each number cubes to number
it self.
 */
public class Q13 {
	void armstrong(int a)
	{
		int g=a;
		int sum=0,n;
		while(a!=0)
		{
			n=a%10;
			sum=sum+(n*n*n);
			a=a/10;
			
		}
		System.out.println(sum);
		
		
		if(sum==g)
		{
			System.out.println("no is armstrong");
		}
		else
		{
			System.out.println("no is not armstrong");
		}
	}

	public static void main(String[] args) {
		Q13 q13=new Q13();
		int a=153;
		q13.armstrong(a);

	}

}
