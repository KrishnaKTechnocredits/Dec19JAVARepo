package poonamDDec19.Assignment3;

public class Q4_SumUserNum {
	static void findNumSum(String num)
	{
		int sum =0;
		for(int i=0;i<num.length();i++)
		{
			char ch = num.charAt(i);
			sum = sum+ Integer.parseInt(String.valueOf(ch));
		}
		System.out.println("Sum of given number is: "+ sum);
	}

public static void main(String[] args)
	{
		String n= "159753";
		findNumSum(n);
	}
}
