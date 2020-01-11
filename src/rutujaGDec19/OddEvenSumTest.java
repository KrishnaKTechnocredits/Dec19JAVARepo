package rutujaGDec19;

public class OddEvenSumTest {
	static int EvenSum(int x) {
		int esum = 0;
		esum = esum + x;
		return esum;
	}
	static int OddSum(int x) {
		int osum = 0;
		osum = osum + x;
		return osum;
	}
		public static void main(String[] args) {
			int Even = 0 , Odd = 0;
		for (int i = 0; i < args.length; i++) {
			int num = Integer.parseInt(args[i]);
			if(num % 2 == 0) {
			Even += EvenSum(num);
			}
			else
				Odd += 	OddSum(num);
			}
		System.out.println("Sum of Even numbers : "+Even);
		System.out.println("Sum of Even numbers : "+Odd);
			
		}
	}

