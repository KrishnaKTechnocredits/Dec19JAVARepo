package praveenReddyDec2019.GitTest;

public class Gittest1 {
	
	public void wordCount(String name)
	{
		String [] a1=name.split(" ");
		System.out.println(a1.length);
	}
	
	public static void main(String[] args) {
		String name = "Hi Hello Technocredits Good";
		Gittest1 ex1=new Gittest1();
		ex1.wordCount(name);
		
	}

}
