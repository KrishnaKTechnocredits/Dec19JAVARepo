class Assignment1_3
{
	public static void main(String args[])
	{
		int arr[]={6, 3, 8};
		//int arr[1]=20;
		//int arr[2]=30;
		//int arr[3]=40;
		int sum=0;
		System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("My Array is:" +arr[i]);
			
		}
		
		for(int i=0; i<arr.length; i++)
		{
			sum= sum+ arr[i];
			

		}System.out.println("Total Sum is : " +sum);
		
		
	}
			
}
