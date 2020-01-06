package prajvalShinde.assign1T07;

public class question6 {
	void sumOfTwoArrays(int[] num1,int[] num2)
	{
		for(int i=0; i<num1.length;i++)
		{
			for(int j=0; j<num2.length;j++)
			{
				if(i==j)
				{
					int sum=0;
					sum = num1[i] + num2[j];
					System.out.println(sum);
				}
			}
		}
	}
	public static void main (String[] a)
	{
		question6 add = new question6 ();
		int[] num1 ={3,4,8};
		int[] num2 ={4,5,90};
		add.sumOfTwoArrays(num1, num2);
	}

}
