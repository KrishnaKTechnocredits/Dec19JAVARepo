package poojaRDec19.Assignment3;

/*10) WAP to sum of two array
a. firstArray :- {1, 5, 9, 3, 7}
b. secondAraay:- {1, 7, 9, 3}
c. output :- 45*/

public class Q10 {
	void sum(int a1[],int a2[])
	{
		int add=0;
		for(int i=0;i<a1.length;i++)
		{
			add=add+a1[i];
		}
		for(int i=0;i<a2.length;i++)
		{
			add=add+a2[i];
		}
		System.out.println("addition of two array is : "+add);
	}

	public static void main(String[] args) {
		
		int[]a1={1,5, 9, 3,7};
		int[]a2={1, 7, 9, 3};
		Q10 q10=new Q10();
		q10.sum(a1, a2);
		
	}

}
