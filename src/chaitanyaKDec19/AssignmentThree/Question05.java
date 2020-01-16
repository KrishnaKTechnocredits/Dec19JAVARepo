package chaitanyaKDec19.AssignmentThree;

public class Question05 {

	int displayNumInReverse(int num) {

		int localNum = num;
		int remainder = 0;
		int reverseNum = 0;

		while (localNum != 0) {

			remainder = localNum % 10;
			reverseNum = (reverseNum * 10) + remainder;
			localNum = localNum / 10;

		}

		return reverseNum;
	}

}
