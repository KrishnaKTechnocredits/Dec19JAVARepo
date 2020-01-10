package krantikhair;

public class Quest6 {
	void comparetwoarray() {

		int[] arr1 = { 21, 57, 11, 37, 24 };
		int[] arr2 = { 21, 57, 11, 37, 24 };
		int size1 = arr1.length;
		int size2 = arr2.length;
		boolean flag = false;

		if (size1 == size2) {
			for (int index1 = 0; index1 < size1; index1++)
			for (int index2 = 0; index2 < size1; index2++)
			{
					if (arr1[index1] == arr2[index1])

						flag = true;
					else
						flag = false;

			}
				if (flag == true) {
					System.out.println("Two arrays are equal");
			} else {
				System.out.println("not equal");
			}
		}
	}

	public static void main(String[] args) {

		Quest6 t = new Quest6();
		t.comparetwoarray();

	}

}
