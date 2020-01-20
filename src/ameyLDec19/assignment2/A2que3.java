/**
 * 
 */
package ameyLDec19.assignment2;

/**
 * @author Amey
 *
 */
public class A2que3 {

	/**
	 * @param check if array contain a particular number
	 */
	void findNum(int[] num,int Number)
	{
		int count =0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==Number)
				count++;
		}
		
		if(count!=0)
			System.out.println("Number : "+Number+" is present in array");
		else
			System.out.println("Number : "+Number+" is NOT present in array");
	}


	public static void main(String[] args) {

		A2que3 A1 = new A2que3();
		int[] num={2,5,9,7,4,6};
		int N=9;
		A1.findNum(num,N);

	}

}
