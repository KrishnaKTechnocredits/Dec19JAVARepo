package kedarKDec19.Assignment2;

public class Question4 {
	/*
	 * largest and smallest
	 * 
	 * 
	 */
	static void MaxMin(int[] num) {
		int sumMaxMin=0;
		int smallestIndex=0;
		int largestIndex=0;
		int smallest=num[0];
		int largest=num[0];
		for(int i=0;i<num.length;i++)
		{	
			if(smallest>num[i])
				{
				smallest=num[i];	
				smallestIndex=i;
				//System.out.println(i);
					
				}
			else if(largest<num[i])
			{
				largest=num[i];
				largestIndex=i;
			}
			
		}
		sumMaxMin=smallest+largest;
		System.out.println("Smallest" +smallest);
		System.out.println("Largest" +largest);
		System.out.println("Index of Smallest" +smallestIndex);
		System.out.println("Index of Largest" +largestIndex);
		System.out.println("Sum of Largest and Smallest in array is " +sumMaxMin);
	}
	
	
	public static void main(String[] args) {
		int[] array= {2,6,3,9,11};
		MaxMin(array);
	}

}
