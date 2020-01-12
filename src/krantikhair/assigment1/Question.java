package krantikhair.assigment1;

public class Question {
	public static void main(String[] args) 
	{
	String number = "1112228899966688";
	for (int i = 0; i < number.length(); i ++)
	{char ch = number.charAt(i);
	int ind = number.indexOf(ch);
	System.out.println (ch + ":" + ":" + ind);
	}

}
}
