/**
 * 
 */
package ameyLDec19.assignment2;

/**
 * @author Amey
 *
 */
public class A2que1 {

	/**
	 * @param Find missing number in an integer array of 1 to 10 
	 */


	void missNum(int[] num)
	{
		int Total = 55;
		int sumOfArray=0;

		for (int i=0;i<num.length;i++)
			sumOfArray=sumOfArray+num[i];


		if(Total==sumOfArray)
			System.out.println("No number is missing");
		else
			System.out.println("Missing number in array of 1 to 10 is :- "+ (Total-sumOfArray));

	}


	public static void main(String[] args) {

		A2que1 A1 = new A2que1();
		int[] num={1,2,3,4,5,6,7,8,10};
		A1.missNum(num);


	}

}
