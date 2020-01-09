package sonalPDec19.assignment2;

/*
 * WAP to print unique number from the two different array 
 * a. int array1 = {1, 3, 6, 9, 7}, 
 * b. int array2 = {2, 5, 6, 9, 8} 
 * output Array :- {1, 3, 6, 9, 7, 2, 5, 8} 
 */

public class Question11 {
	
	static void findUniqueNum(int[] input1, int[] input2)
	{
		String uniqueNo = "";
		//int count = 0;
		
		for(int i=0; i<input1.length; i++)
		{
			uniqueNo = uniqueNo + " " + input1[i];
		}
		
		for(int j=0; j<input2.length;j++)	
		{
			int count =0;
			for(int i=0; i<input1.length; i++)
			{
				if(input2[j]==input1[i])
					//System.out.print(input1[i]+ " ");
					count++;				
			}
				if(count== 0)
				{
					uniqueNo = uniqueNo + " "+ input2[j];
				}
		}
		System.out.print(uniqueNo);
	}

	public static void main(String[] args) {
		int[] array1 = {1, 3, 6, 9, 7};
		int[] array2 = {2, 5, 6, 9, 8};
		findUniqueNum(array1, array2);
	}
}
