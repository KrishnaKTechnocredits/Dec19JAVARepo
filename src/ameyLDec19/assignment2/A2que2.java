/**
 * 
 */
package ameyLDec19.assignment2;

/**
 * @author Amey
 *
 */
public class A2que2 {

	/**
	 * @param Find duplicate number in an integer array
	 */


	void dupNum(int[] num)
	{
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					System.out.println("Duplicate number is :-"+ num[j]);
				}
			}
		}
	}


	public static void main(String[] args) {

		A2que2 A1 = new A2que2();
		int[] num={1,2,2,4,5,6,7,5,10};
		A1.dupNum(num);

	}

}
