package pravinSDec19;

public class SumOfPrimeNoTest {

	void sumPrimeNo(int[] numArray) {

		int sumPrime = 0;
		int count=0;

		for (int i = 0; i < numArray.length; i++) {

			for(int j=1;j<=(numArray[i]/2);j++){
				
				if(numArray[i]%j == 0){
					
					count++;
				 
				}

			}
			if(count<=2){
				
			sumPrime= sumPrime + numArray[i];
				
			}
			
			count =0;
		}
		
		System.out.println("Sum of Prime Numbers: "+sumPrime);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numArray[] = new int[args.length];

		for (int i = 0; i < args.length; i++) {

			numArray[i] = Integer.parseInt(args[i]);

		}
		SumOfPrimeNoTest sumofprime = new SumOfPrimeNoTest();
		sumofprime.sumPrimeNo(numArray);

	}
}