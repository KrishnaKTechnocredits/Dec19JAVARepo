package anjaliSDec19.Test11jan2020;

public class OddEvenSumTest {
	void sumOddEven(String[] str)
	{
		int esum=0, osum=0;
		for(int i=0; i<str.length;i++)
		{
			if(Integer.parseInt(str[i]) % 2==0)
				esum=esum+Integer.parseInt(str[i]);
			else
				osum=osum+Integer.parseInt(str[i]);
		}
		System.out.println("Sum of even numbers is :"+ esum);
		System.out.println(" ");
		System.out.println("SUm of odd number is :"+ osum);
	}
	public static void main(String[] args) {
		OddEvenSumTest o= new OddEvenSumTest();
		o.sumOddEven(args);
	}
}
