package prajvalShinde.Assign1;
class ArrayEx1 
{
	void sum(int[] input)
	{
		int totalSum = 0;
		for(int i=0;i<input.length;i++)
		{
			totalSum = totalSum + input[i];
		}
		System.out.println(totalSum);
	}
    void display(int[] x)
	{
		System.out.println(x.length);
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		} 
	}
	public static void main(String[] a)
	{
	
	 ArrayEx1 ex1 = new ArrayEx1();
	 int[] num = new int[4];
	 num[0] = 10;
	 num[1] = 20;
	 num[2] = 30;
	 num[3] = 40;
	 ex1.display(num);
	 ex1.sum(num);
	 }
}