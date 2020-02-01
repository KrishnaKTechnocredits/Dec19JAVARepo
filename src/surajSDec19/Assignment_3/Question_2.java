package surajSDec19.Assignment_3;
/*WAP to find max length String from the given array.
  a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
 *
 * Author: Suraj Shinde
 * */

public class Question_2 {

	public void maxLengthString(String[] arr) {

		int maxLength = arr[0].length();
		String maxLengthName = "";
		for (int i = 0; i < arr.length; i++)
			if (arr[i].length() > maxLength) {
				maxLength = arr[i].length();
				maxLengthName = arr[i];
			}
		System.out.println("maximum length of string from array : " + maxLengthName);
	}

	public static void main(String[] args) {

		 String[] arr= {"all the best", "technocredits","maharastra"};
		//String[] arr = { "12345", "1234568", "", "12", "12ds54545dsds3" };
		Question_2 question_2 = new Question_2(); 
		question_2.maxLengthString(arr);
	}

}
