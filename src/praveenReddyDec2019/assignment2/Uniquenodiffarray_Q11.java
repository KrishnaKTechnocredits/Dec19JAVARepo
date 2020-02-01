package praveenReddyDec2019.assignment2;

/*
 WAP to print unique number from the two different array 
 a. int array1 = {1, 3, 6, 9, 7}, 
 b. int array2 = {2, 5, 6, 9, 8} 
 output Array :- {1, 3, 6, 9, 7, 2, 5, 8} 
 */

public class Uniquenodiffarray_Q11 {
	static void UniqueArray(int a[], int b[]) {
	for (int i=0;i<a.length;i++)
	{
	  for (int j=0;j<a.length;j++)
		//{
			if(a[i]!=b[j])
			{
				//int values1[] = (int) a[i];
				//int values2 = b[i];
				//return;
			}
		//}
	  System.out.println("values are " + a[i]);
	  return;
	}
		
	}
	
	public static void main(String[] args) {
		int a[] = {1,3,6,9,7};
		int b[] = {2,3,6,9,8};
		Uniquenodiffarray_Q11.UniqueArray(a, b);
	}
	
	

}
