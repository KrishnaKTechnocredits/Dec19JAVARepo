package yashashrikDec19.Assignment2;
/*10) Find max value at differed index
i/p:- arr1: {10,2,9,14,3}
 arr2: {10,2,18,14,3}*/
public class MaxValueQ10 {

	void displayMaxValue(int[] a1,int[] a2)
	{
		int i=0;
		for(i=0;i<a1.length;i++)
		{
			if(a1[i]!=a2[i])
			{
			System.out.println("Values are not matching at index ->"+i);
			if(a1[i]>a2[i])
				System.out.println("From "+a1[i]+","+a2[i]+" max value is " +a1[i]);
			else
				System.out.println("From "+a1[i]+","+a2[i]+" max value is " +a2[i]);
			}
		}
		
	}
	public static void main(String[] args) {
		MaxValueQ10 maxvalue=new MaxValueQ10();
		int[] arr1= {10,2,9,14,3};
		int[] arr2= {10,2,18,14,13};
		maxvalue.displayMaxValue(arr1,arr2);
		
		
	}
}
