package aparnaVDec19.assignment2;
/*
 * 10) Find max value at differed index
       i/p:- arr1: {10,2,9,14,3}
       arr2: {10,2,18,14,3}
       o/p :- Values are not matching at index -> 2
       From (9,18) max value is 18
 */
public class MaxValueAtDifferIndex {
	
	static void maxValue(int arr1[], int arr2[])
	{
		if(arr1.length==arr2.length)
		{
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i]!=arr2[i])
				{
					System.out.println("Values are not matching at index:-> " + i);
					if(arr2[i]>arr1[i])
					{
					System.out.println("From " + arr1[i] +"  " +arr2[i]+  "  max value is "+ arr2[i]);
					}
					else
					{
						System.out.println("From " + arr1[i] +"  " +arr2[i]+  "  max value is "+ arr1[i]);
					}
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		int arr1[]={10,2,9,14,3};
		int arr2[]={10,2,18,14,3};
		maxValue(arr1,arr2);
	}

}
