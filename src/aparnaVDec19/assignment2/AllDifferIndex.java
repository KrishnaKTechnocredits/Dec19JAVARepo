package aparnaVDec19.assignment2;
/*
 * 9) Find all differ index from given arrays
      i/p :- arr1: {10,2,9,14,3}
             arr2: {10,2,18,14,13}
      o/p :- Values are not matching at index -> 2
             Values are not matching at index -> 4
 */
public class AllDifferIndex {
	static void allDifferIndex(int arr1[], int arr2[])
	{
		if(arr1.length==arr2.length)
		{
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i]!=arr2[i])
				{
					System.out.println("Values are not matching at index:-> " + i);;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int arr1[]={10,2,9,14,3};
		int arr2[]={10,2,18,14,13};
		allDifferIndex(arr1,arr2);
		
	}
}
