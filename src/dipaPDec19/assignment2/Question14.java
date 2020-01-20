package dipaPDec19.assignment2;
/*
 * WAP to print even number from the array
	int a = {15, 24, 52, 49, 62, 10};
	output :- {24, 52, 62, 10}
 */
public class Question14 {
	public static void main(String[] args) {
		int[] a = {15, 24, 52, 49, 62, 10};
		getEvenArray(a);
	}

	static void getEvenArray(int[] a) 
	{
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] % 2 == 0)
				System.out.print(a[i]+" ");
		}
		
	}
}
