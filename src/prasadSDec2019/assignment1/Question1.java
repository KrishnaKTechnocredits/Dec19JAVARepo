package prasadSDec2019.assignment1;

public class Question1 {

	int add(int a,int b) {
		int sum=a+b;
		return sum;
		
	}
	
	public static void main(String[] args) {
		Question1 q1=new Question1();
		int sum=q1.add(5, 2);
		System.out.println("Addtion is "+sum);
	}
}
