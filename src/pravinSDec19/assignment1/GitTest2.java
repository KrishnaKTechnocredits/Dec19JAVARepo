package pravinSDec19.assignment1;

public class GitTest2 {

	static void countWords(String str) {
		
		String[] strArray = str.split(" ");
		System.out.println("Total words: "+strArray.length);
		
		for(int i=0; i<strArray.length;i++) {
			
			String word ="";
			word = strArray[i];
			int count = 0;
			for (int j=0; j<word.length();j++) {
				
				count++;
									
			}
			
			System.out.println(word+" : "+count);
			
			
		}
		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hi Hello Technocredits Good";
		countWords(str);
		
		
	}

}
