package praveenReddyDec2019.assignment2;
/*
 WAP to print common numbers from 2 different array.
 */

public class CommonNumberQ12 {

		private static void PrintCommonArray(int[] array1, int[] array2) {
	
		boolean flag = false;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					flag = true;
					System.out.print(array1[i]+" ");
				}

			}
			
		}
		
		if (flag == false) {
			System.out.println("No common elements found");
		}
	}
		public static void main(String[] args) {
			
			int array1[] = { 1, 3, 6, 9, 7 };
			int array2[] = { 2, 5, 6, 9, 8 };
			PrintCommonArray(array1,array2);
			
		}

}
