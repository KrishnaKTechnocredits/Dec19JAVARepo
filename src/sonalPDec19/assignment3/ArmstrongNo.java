package sonalPDec19.assignment3;
/*
 * WAP to find number is Armstrong or not?
 */
import java.util.Scanner;

public class ArmstrongNo {

	void findArmstrongNo(String inputNum) {
		int cubeSum = 0;
		for (int i = 0; i < inputNum.length(); i++) {
			int convertInInteger = Integer.parseInt(String.valueOf(inputNum.charAt(i)));
			cubeSum = cubeSum + (convertInInteger * convertInInteger * convertInInteger);
		}
		if (Integer.parseInt(inputNum) == cubeSum)
			System.out.println("Number is Armstrong number.");
		else
			System.out.println("Number is not Armstrong number.");

	}

	public static void main(String[] args) {
		ArmstrongNo armstrongno = new ArmstrongNo();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter No:");
		String no = s.nextLine();
		armstrongno.findArmstrongNo(no);
	}

}
