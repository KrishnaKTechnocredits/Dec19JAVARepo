package poonamDDec19.Test1;

public class WordCount {
	static String[] arr;
	static void displayWordCount (String msg)
		{
			arr=msg.split(" ");
			System.out.println("Word count is "+ arr.length);	
		}
	public static void main(String[] args) {
		String arr = "Hi Hello Technocredits Good";
		displayWordCount(arr);		
	}
	

}
