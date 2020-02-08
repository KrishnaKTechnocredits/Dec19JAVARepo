package sameerDDec19.Assignment3;
/*WAP to sum of two array
	a. firstArray :- {1, 5, 9, 3, 7}
	b. secondAraay:- {1, 7, 9, 3}
	c. output :- 45
 */
public class Question10
{
	public static void main(String[] args)
	{
		int[] arr1= {1,2,3,4,5,6,7,8,9};
		int[] arr2= {10,11,12,13,14,15,16,17};
		sum(arr1,arr2);
	}
	static void sum(int[] arr1,int[] arr2)
	{
		int sum=0;
		int sum1=0;
		int sum2=0;
		for(int i=0;i<arr1.length;i++)
		{
			sum1=sum1+arr1[i];
		}
		for(int i=0;i<arr2.length;i++)
		{
			sum2=sum2+arr2[i];
		}
		sum=sum1+sum2;
		System.out.println("The sum is :"+sum);
	}
}
