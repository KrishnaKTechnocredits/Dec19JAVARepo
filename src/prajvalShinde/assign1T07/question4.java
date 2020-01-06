package prajvalShinde.assign1T07;

public class question4 
{
	void squareSum(int[] num)
	{
		int totalSum = 0;
		
		for(int i=0;i<num.length;i++)
		{
			totalSum = totalSum + (num[i]*num[i]);
		}
		System.out.println("sum of element's square"+ totalSum);
	}
	public static void main(String[] a)
	{
		question4 s1 = new question4();
		int[] num ={4,5,6,7,8};
		s1.squareSum(num);
	}
	

}
