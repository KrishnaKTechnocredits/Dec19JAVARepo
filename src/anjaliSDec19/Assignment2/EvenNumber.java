/*
 * WAP to print even number from the array
 */
package anjaliSDec19.Assignment2;

public class EvenNumber {

	void printEvenNumber(int[] arr)
	{
		int cnt=0;
		
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				cnt++;
				System.out.print(arr[i]+" ");
			}
		}
		if(cnt==0)
			System.out.println("There are no even numbers in the array.");
	}
	
	public static void main(String[] args) {
		EvenNumber even1= new EvenNumber();
		int[] arr= {15,24,52,49,62,10};
		even1.printEvenNumber(arr);
	}
}
