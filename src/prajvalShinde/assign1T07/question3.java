package prajvalShinde.assign1T07;

public class question3 {
	
	void sumArray(int[] num)
	{
		int totalSum = 0;
		for(int i=0;i<num.length;i++)
		{
			totalSum = totalSum+num[i];
		}
		System.out.println("sum of all element is"+ totalSum);
	}
   public static void main(String[] a)
   {
	   question3 a1 = new question3();
	   int[] num ={1,2,4,5,6};
	   a1.sumArray(num);
   }
	

}
