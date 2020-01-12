package surajSDec19.Test1;

class OddEvenSum {

	void sumPrint(String[] args) {
		int evenSum = 0;
		int oddSum = 0;

		for (int i = 0; i < args.length; i++) {
			int s = Integer.parseInt(args[i]);
			if (s % 2 != 0) {
				oddSum = oddSum + s;
			} else {
				evenSum = evenSum + s;
			}
		}
		System.out.println("Sum of Odd Number: " + oddSum);
		System.out.println("Sum of Odd Number: " + evenSum);
	}

	public static void main(String[] args) {
		OddEvenSum t1 = new OddEvenSum();
		t1.sumPrint(args);
	}

}