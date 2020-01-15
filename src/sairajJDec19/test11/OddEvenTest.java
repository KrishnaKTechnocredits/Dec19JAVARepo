package sairajJDec19.test11;

public class OddEvenTest {
		
	static void oddEvenSum(String [] args) {
		int sumEven=0;
		int sumOdd=0;
		for(int i=0; i<args.length;i++) {
			if(Integer.parseInt(args[i])%2==0) {
				sumEven = sumEven + Integer.parseInt(args[i]);
			}else {
				sumOdd = sumOdd + Integer.parseInt(args[i]);
			}
			
		}
		System.out.println("Sum of all even numbers is: "+ sumEven);
		System.out.println("Sum of all odd numbers is: "+ sumOdd);
	}
	
	public static void main(String[] args) {
		
		if(args.length!=0) {
			oddEvenSum(args);
		}else {
			System.out.println("Invalid Arguments");
		}
			
		}
}
