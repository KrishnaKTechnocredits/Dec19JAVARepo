package swatiShinde30.assignment2;
/*
 *  Find all pairs on integer array whose sum is equal to given number? 
 */
public class Question7 {

	static void addition(int sum,int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				int add = array[i]+array[j];
				if(add==sum)
				{
					System.out.println("Numbers having addition equals to given num "+array[i]+" "+array[j]);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int array[]= {2, 4, 3, 5, 7, 8, 9 };
		int sum =7;
		addition(sum,array);
	}

}
