package chaitanyaKDec19.homeWork08Feb2020;

import java.util.*;

/*
 * Find duplicate elements from Array List and respective count
 */

public class HomeWork {

	public static void main(String[] args) {

		int dupeCount = 0;
		int dupeNumber = 0;

		ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(1, 3, 9, 3, 3, 9, 3));

		LinkedHashSet<Integer> intHashSet = new LinkedHashSet<Integer>();

		for (int number : intList) {

			if (intHashSet.add(number) == false) {

				if (dupeNumber != number) {
					dupeNumber = number;
					dupeCount++;
				}
			}

		}
		System.out.println("Duplicate number is: " + dupeNumber + " and it's frequency is: " + dupeCount);
		System.out.println("Unique list is: " + intHashSet);

	}

}
