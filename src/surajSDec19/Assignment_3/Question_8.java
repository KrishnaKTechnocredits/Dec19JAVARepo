package surajSDec19.Assignment_3;

public class Question_8 {

	public void vowelCount(String str) {
		
		int Count = 0;
		

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			switch (ch) {
			case 'a':
				Count++;
				break;
				
			case 'e':
				Count++;
				break;
			
			case 'i':
				Count++;
				break;
			
			case 'o':
				Count++;
				break;
			
			case 'u':
				Count++;
				break;	
				
			
			}
		}
		System.out.println("Count of total vowels : "+Count);
		
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aseioubnd";
		Question_8 question_8 = new Question_8();
		question_8.vowelCount(str);
	}

}
