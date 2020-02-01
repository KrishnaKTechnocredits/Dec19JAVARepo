package surajSDec19.Assignment_3;
/*WAP to find reverse max length string 
  a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
 *
 * Author: Suraj Shinde
 * */

public class Question_6 {

	public void maxLengthString(String[] arr) {

		int maxLength = arr[0].length();
		String revMaxLengthName="";
		String maxLengthName = "";
		for (int i = 0; i < arr.length; i++)
			if (arr[i].length() > maxLength) {
				maxLength = arr[i].length();
				maxLengthName = arr[i];
			}
		System.out.println("maximum length of string from array : " + maxLengthName);
		
		for(int i=maxLengthName.length()-1;i>=0;i--)
		{
			revMaxLengthName=revMaxLengthName+maxLengthName.charAt(i);
		}
		System.out.println("Reverse maximum length of string from array : " + revMaxLengthName);
	}

	
	public static void main(String[] args) {

		 String[] arr= {"all the best", "technocredits","maharastra"};
		//String[] arr = { "12345", "1234568", "", "12", "12ds54545dsds3" };
		Question_6 question_6 = new Question_6(); 
		question_6.maxLengthString(arr);
	}

}
