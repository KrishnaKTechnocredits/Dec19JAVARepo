package praveenReddyDec2019.assignment2;
/*
 Largest and smallest number in unsorted array
 */

public class LargestQ4 {

    void FindLargestNumber(int arr[])
	{
		int largestNum = arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
				if(arr[i] > largestNum)
				{
					largestNum = arr[i];
					
				}
			
		}
		System.out.println("Largest element:" +largestNum);	
	}
    void FindSmallestNumber(int arr[])
	{
		int smallestNum = arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
				if(arr[i] < smallestNum)
				{
					smallestNum = arr[i];
					
				}
			
		}
		System.out.println("Smallest element:" +smallestNum);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={0,1,10,3};
		LargestQ4 example4=new LargestQ4();
		example4.FindLargestNumber(arr);
		example4.FindSmallestNumber(arr);
	}

}

