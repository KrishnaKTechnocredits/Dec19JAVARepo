//Count the number of occurrences of all the digits in the Integer number

package sonali1297;

public class Assignment1_Q9 {

	static void digitFreqCount(char digit, String num)
	{
		int count = 0;
		
		for(int i=0;i<num.length();i++)
		 {
		if(digit== num.charAt(i))
	  count++;
		
	}
	System.out.println("frequency of digit" + digit + "is" +" "+count);
	}
	public static void main(String[] args) 
	{
		String num= "128896";
		digitFreqCount('1', num);
		digitFreqCount('2', num);
		digitFreqCount('6', num);
		digitFreqCount('8', num);
		digitFreqCount('9', num);
	}
	}
