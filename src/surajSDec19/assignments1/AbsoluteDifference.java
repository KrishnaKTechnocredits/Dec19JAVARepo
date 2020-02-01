package surajSDec19.assignments1;

import java.util.Scanner; 
public class AbsoluteDifference{


	void absoluteDifferenceMethod(int a, int b){
		int z=a-b;
		if(z<0)
		{
			z=z*(-1);
		}
		System.out.println("The absolute difference between two numbers is: "+z);
		
	}




	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 1st number N: ");
		int n=in.nextInt();
		
		System.out.println("Enter 2st number M: ");
		int m=in.nextInt();
		
		AbsoluteDifference absoluteDifference=new AbsoluteDifference();
		absoluteDifference.absoluteDifferenceMethod(n,m);
	
	}





}