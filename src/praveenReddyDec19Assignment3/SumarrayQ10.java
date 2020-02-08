package praveenReddyDec19Assignment3;
/*
 WAP to sum of two array 
 a. firstArray :- {1, 5, 9, 3, 7} 
 b. secondAraay:- {1, 7,  9, 3} 
 c. output :- 4
 */

public class SumarrayQ10 {
	static void SumOf2Arrays(int a[], int b[])
	{
		int sumoffirst = 0;
		int sumofsecond = 0;
		int Sum =0 ;
		for(int i=0;i<a.length;i++)
		{
			sumoffirst = sumoffirst + a[i];
		}
		for (int i=0;i<b.length;i++)
		{
			sumofsecond = sumofsecond + b[i];
		}
		Sum = sumoffirst +sumofsecond;
		System.out.println(Sum);
			
	}
	
public static void main(String[] args) {
	int a[] = {1, 5, 9, 3, 7};
	int b[] = {1, 7,  9, 3};
	SumarrayQ10.SumOf2Arrays(a, b);
	
}
}
