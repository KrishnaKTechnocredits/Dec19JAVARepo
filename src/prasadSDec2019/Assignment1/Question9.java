package prasadSDec2019.Assignment1;

//  You are given a String s. 
//  Count the number of occurrences of all the digits in the Integer number

public class Question9 
{
	static void digitFreqCount(char digit,String number)
	{
		int count = 0;
		for(int i=0;i<number.length();i++)
		{
			if(digit ==number.charAt(i))//from whole string,when we need to access single character then charAt(int index) method is used
				count++;
		}
		System.out.println("Freq of "+digit+" is "+count);
	}

	public static void main(String[] args) 
	{
		String number="128896111111";
		/*digitFreqCount('1',number);
		digitFreqCount('2',number);
		digitFreqCount('8',number);
		digitFreqCount('9',number);
		digitFreqCount('6',number);*/
		/*for(int j=0;j<number.length();j++) 
		{
			digitFreqCount(number.charAt(j),number);// but this was printing occurences multiple times hence adding index and i(for loop vala) logic
		}*/
			for(int j=0;j<number.length();j++) 
		{
				char ch=number.charAt(j);
				int index = number.indexOf(ch);
				System.out.println(ch + ":"+ j +":"+index);
				if(j==index)
			   digitFreqCount(ch,number);
		}
	}

}
