package prasadSDec2019.Assignment1;


public class Question1 {
	
	int sumOfInteger(int num1,int num2) {
		int sum;
		System.out.println("Num1 is:"+num1);
		System.out.println("Num2 is:"+num2);
		sum=num1+num2;
		return sum;
	}
	
	public static void main(String[] args) {
		Question1 q1=new Question1();
		int sum=q1.sumOfInteger(5, 2);
		System.out.println("Sum of Two integer is:"+sum);
	}
}
