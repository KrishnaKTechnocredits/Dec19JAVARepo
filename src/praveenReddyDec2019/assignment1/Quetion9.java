package praveenReddyDec2019.assignment1;

public class Quetion9 {
	//String number;
	static void digiFreqCount(char digit, String number) 
	{
		//System.out.println(digit);
		int count=0;
		for(int i=0;i<number.length();i++)
		{
			if (digit==number.charAt(i))
				count++;
		}
		System.out.println("freq of digit: " +digit + " is " + count);
	}
	
	
	public static void main(String[] args) { //1
		String number="128896"; //2
		//digiFreqCount('1', number); //3
		//digiFreqCount('2', number);
		//digiFreqCount('8', number);
		//digiFreqCount('8', number);
		for (int i=0;i<number.length();i++)
		{
			char ch = number.charAt(i);
			int index = number.indexOf(0);
			System.out.println(ch + ":" +i + ":" + index);
			if(i == index)
			digiFreqCount(number.charAt(i), number);	
	
		}
	}

}
