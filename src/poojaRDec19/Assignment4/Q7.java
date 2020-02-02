package poojaRDec19.Assignment4;
/*
 * Write a Java program to convert seconds to hour, minute andseconds.

 */
public class Q7 {

	void operation(int seconds)
	{
		if(seconds!=0)
		{   int s=seconds%3600;
			int min=s/60;
			s=s%60;
			int hour=seconds/3600;
			System.out.println(seconds +" seconds means : "+ hour+" hours, "+min+" min, "+s+" seconds");
		}
	}
	public static void main(String[] args) {
		int seconds=3661;
		Q7 q7=new Q7();
		q7.operation(seconds);
		
	}

}
