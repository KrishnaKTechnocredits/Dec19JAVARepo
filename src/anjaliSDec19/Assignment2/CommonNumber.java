/*
 * WAP to print common number from 2 different array
 */
package anjaliSDec19.Assignment2;

public class CommonNumber {
	 void findCommonNumber(int[] arr1, int[] arr2)
	 {
		 int cnt=0;
		 if(arr1.length==arr2.length)
		 {
			 for(int i=0;i<arr1.length;i++)
			 {
				 for(int j=0;j<arr1.length;j++)
				 {
					 if(arr1[i]==arr2[j])
					 {
						 System.out.print(arr1[i]+" ");
						 cnt++;
					 }
				 }
			 }
			 if(cnt==0)
				 System.out.println("None of the elements are common!");
		}
		 else
			 System.out.println("Both arrays are of different size");
	 }
	
	public static void main(String[] args) {
		CommonNumber cmn = new CommonNumber();
		int[] arr1= {1,3,6,9,7};
		int[] arr2 = {2,5,4,9,8};
		cmn.findCommonNumber(arr1, arr2);
	}
}
