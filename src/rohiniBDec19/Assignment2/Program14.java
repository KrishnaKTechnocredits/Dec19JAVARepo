package rohiniBDec19.Assignment2;

/*14) WAP to print even number from the array */

public class Program14 
{
	void findEvenNumber(int inputArr[]) {
		
		for(int i=0;i<inputArr.length;i++)
		{
			if(inputArr[i]%2==0) {
				System.out.println("Even Number is :"+inputArr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {5, 6, 9, 10, 14, 63};
		Program14 prgm=new Program14();
		prgm.findEvenNumber(arr);
	}
}
