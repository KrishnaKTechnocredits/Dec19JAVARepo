/**
 * 
 */
package ameyLDec19.ameyTest;

/**
 * @author Amey
 *
 */
public class OddEvenSumTest {

	/**
	 * @param Print sum of Odd and even number
	 */
	static void OddEvenSum(String[] arr){
		int evenS=0,oddS=0;
		for(int i=0;i<arr.length;i++)
		{
			int num=Integer.parseInt(arr[i]);
			if(num%2==0)
				evenS=evenS+num;
			else
				oddS=oddS+num;
		}
		System.out.println("Sum of Even numbers -> "+evenS);
		System.out.println("Sum of odd numbers -> "+oddS);

	}

	public static void main(String[] args)
	{
		//ars contains {"10","12","15"};
		OddEvenSum(args);
	}

}
