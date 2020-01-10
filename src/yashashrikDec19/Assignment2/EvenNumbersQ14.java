package yashashrikDec19.Assignment2;
/*14)WAP to print even number from the array
int a = {15, 24, 52, 49, 62, 10};
output :- {24, 52, 62, 10}*/
public class EvenNumbersQ14 {

	void displayEvenNum(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		EvenNumbersQ14 even=new EvenNumbersQ14();
		int[] arr1= {15,24,52,49,62,10};
		even.displayEvenNum(arr1);
	}
}
