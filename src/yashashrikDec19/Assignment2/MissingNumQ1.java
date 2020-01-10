package yashashrikDec19.Assignment2;
/*1) Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but one
number is missing, you need to write a Java program to find that missing number in an
array*/
public class MissingNumQ1 {

	void displayMissingNum(int[] num)
	{
	
		for(int i=1;i<=10;i++)
		{
			String found="N";
			for(int j=0;j<num.length;j++)
			{
				if(i==num[j])
				{
					found="Y";
					break;
				}
					
					
			}
			if(found == "N")
			{
				System.out.println(i);
			}
			
		}
	}
	public static void main(String[] args) {
		MissingNumQ1 num=new MissingNumQ1();
		int[] arr={1,2,3,4,6,7,8,9,10};
		num.displayMissingNum(arr);
	}
}
