package poojaRDec19.Assignment3;
/*
 * 1) WAP which fulfill below condition
a. WAP to find positive and negative number from the given array
b. check the sum of individual.
Input array;- {5, 6, -9, 14, -25, 6, 7, -14}
Output :- expected output of
a. positive number = {5, 6, 14, 6, 7}
b. negative number = {-9, -25, -14}
c. positive number sum :- 38
d. negative number sum :- 48
 */
public class Q1 {
	
	void check(int[]a)
	{ 
		int pos[]=new int[a.length];
		int neg[]=new int[a.length];
		int addOfPositive=0;
		int addOfNegative=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0)
			{
				
	          pos[i]=a[i];
	          
			}
			else
			{
				neg[i]=a[i];
			}
		}
		
		System.out.print("positive array : ");
		for(int i=0;i<pos.length;i++)
		{
			if(pos[i]!=0)
			System.out.print(pos[i]+"  ");
		    addOfPositive=pos[i]+addOfPositive;
		}
		System.out.println();
		System.out.print("negative array : ");
		for(int i=0;i<pos.length;i++)
		{
			if(neg[i]!=0)
			System.out.print(neg[i]+"  ");
			 addOfNegative=neg[i]+addOfNegative;
		}
		System.out.println();
		System.out.println("addition of positive array : "+addOfPositive);
		System.out.println("addition of negative array : "+addOfNegative);
		
	}

	public static void main(String[] args) {
		
		 Q1 q1=new Q1();
		 int a[]={5, 6, -9, 14, -25, 6, 7, -14};
		 q1.check(a);
	}

}
