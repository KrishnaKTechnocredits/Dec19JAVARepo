package aparnaVDec19.assignment2;
/*
 * 6)Write a java program to check the equality of two arrays?
     Hint: Input Arrays :  First Array : [21, 57, 11, 37, 24] 
                           Second Array : [21, 57, 11, 37, 24] 
            Output Value : Two Arrays Are Equal
 */
public class EqualityOfTwoArrays {
	
	static void equalArrayCheck(int arr1[], int[]arr2)
	{ 
		if(arr1.length==arr2.length)
		{
			int count=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==arr2[i])
			{
				count++;
			}
			else
			{
				System.out.println("Two Arrays values are not equals");
			}
			if (count==arr1.length)
			{
				System.out.println("Two Arrays values are equal");
			}
			
			}
				}		
			}
		
	public static void main(String[] args) {
		int arr1[]={21, 57, 11, 37, 24};
		int arr2[]={21, 57, 11, 37, 24};
		equalArrayCheck(arr1,arr2);
	}

}
