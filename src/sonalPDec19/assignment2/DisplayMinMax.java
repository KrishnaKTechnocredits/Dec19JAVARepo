package sonalPDec19.assignment2;
/*
 *  Largest and smallest number in unsorted array?
 */

public class DisplayMinMax {
	void findMinMaxNo(int[] inputarr) {

		int maxNo = inputarr[0];
		int minNo = inputarr[0];
		for (int i = 0; i < inputarr.length; i++) {
			if (inputarr[i] > maxNo) {
				maxNo = inputarr[i];
			} else if (inputarr[i] < minNo) {
				minNo = inputarr[i];
			}
		}
		System.out.println("Minimum no in given array:" + minNo);
		System.out.println("Maximum no in given array:" + maxNo);
	}

	public static void main(String[] args) {
		int[] array = { 2, 3, 26, 28, 24, 8, 15, 19, 52, 100, 102 };
		DisplayMinMax displayminmax = new DisplayMinMax();
		displayminmax.findMinMaxNo(array);
	}
}
