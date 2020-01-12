package vishwasCDec19.vishAssignment2;
/*
 * Write a java program to check the equality of two arrays?
 */

import java.util.Arrays;

public class Q6CheckEqualityOfArray {
	

		   public static void main (String[] args) {
		      int arr1[] = {1, 2, 3};
		      int arr2[] = {1, 2, 3};
		      if (Arrays.equals(arr1, arr2)) System.out.println("Two array are equal");
		      else System.out.println("Two array are not equals");
		   }
		}


