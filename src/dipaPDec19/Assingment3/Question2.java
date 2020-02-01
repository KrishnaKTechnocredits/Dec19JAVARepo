package dipaPDec19.Assingment3;

/*
 * WAP to find max length String from the given array.
	a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
 */
public class Question2 {
	public static void main(String[] args) {
		Question2 que = new Question2();
		String[] str = { "all the best", "technocredits", "", "maharashtra" };
		System.out.println("The max length String is "+que.maxLengthString(str));
	}

	String maxLengthString(String[] str1) {
		int maxlength = 0;
		String maxstring = null;
		for(int i = 0; i < str1.length; i++) 
		{
			if (str1[i].length() > maxlength) //compare the string by its length.
			{
				maxlength = str1[i].length();
				maxstring = str1[i];
			}
		}
		return maxstring;				//return the max length string.
	}
}
