package swatiShinde30.assignment2;
/*
 * Find first differ index from given arrays 
 */
public class Question8 {

	static void firstDifferIndex(int[] arr1,int[] arr2)
	{
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=arr2[i])
			{
				System.out.println("1st differ index is " +i);
				break;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr1= {10,2,9,14,3} ;         
		int[] arr2= {10,2,18,14,3}; 
		firstDifferIndex(arr1,arr2);
	}

}
