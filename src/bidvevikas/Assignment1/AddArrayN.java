
 //4)a program to print the sum of all the element of an array of size having N

class AddArrayN {
	void add(int n)
	{
		int[] arr;
		arr = new int[n];
		int val=10;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=val+i;
			sum=sum+arr[i];
		}
		System.out.println("Sum of all the element of an array of size "+n+" is "+sum);
	}
	public static void main(String[] args) {
		AddArrayN ad= new AddArrayN();
		ad.add(10);
	}

}