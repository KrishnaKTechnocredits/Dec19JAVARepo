package rutujaGDec19;

public class PrimeTest {
	static int checkPrime(int Number) {
	int sum = 0;
	boolean flag = false ; 
	for(int i=2;i<=(Number/2);i++){  
		if(Number % i == 0){   			
			flag = true;
			break;
		}
	}
	if(flag == false){
	   sum = sum + Number;
	}
	
	return sum;
	}
	public static void main(String[] args) {
		int Sum = 0;
		for (int i = 0; i < args.length; i++) {
			int Number = Integer.parseInt(args[i]);
			Sum += checkPrime(Number);
		}
		System.out.println("Sum of Prime Numbers is : " +Sum);
	}

}
