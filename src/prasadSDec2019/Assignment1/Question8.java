package Assignment1;

public class Question8 {

	int countVowels(String name) {
		int count=0;
		System.out.println("Name is "+name);
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
			
		}
		return count;
	}
	
	public static void main(String[] args) {
		String name="Prasad";
		Question8 q8=new Question8();
		int count=q8.countVowels(name);
		System.out.println("Total number if Voweles are " +count);
	}

}
