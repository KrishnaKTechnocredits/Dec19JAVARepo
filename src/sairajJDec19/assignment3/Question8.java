package sairajJDec19.assignment3;

public class Question8 {
	int getCount(String s)
	  {
	    int count = 0;
	    for (int j =0;j<s.length() ;j++ ) {
	      char ch = s.charAt(j);
	      if (ch =='a') {
	        count++;
	      }
	      else if (ch == 'e') {
	        count++;
	      }
	      else if (ch == 'i') {
	        count++;
	      }
	      else if (ch == 'o') {
	        count++;
	      }
	      else if (ch == 'u') {
	        count++;
	      }
	      else {
	      }
	    }
	    return count;
	  }
	
	public static void main(String[] args) {
		String input = "automation engineering";
		Question8 q1 = new Question8();
		System.out.println(q1.getCount(input));
	}

}
