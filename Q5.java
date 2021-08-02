package practiceOzkanAyata04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Q5 {

	/*
	 * 1. Write a method that can remove duplicated values from an Integer
	 * ArrayList.EX : ArrayList<Integer>(List.of(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5) --->
	 * [1,2,3,4,5]
	 * 
	 */

	public static void main(String[] args) {
		System.out
				.println(removeDuplicates(new ArrayList<>(List.of(6, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5))));
		System.out.println(removeDuplicates2(new ArrayList<>(List.of(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5))));

	}

	static HashSet<Integer> removeDuplicates(ArrayList<Integer> list) {
		HashSet<Integer> set = new HashSet<>(list);

		System.out.println(new LinkedHashSet<>(list)); // [6, 1, 2, 3, 4, 5]

		/*
		 * The only difference between HashSet and LinkedHashSet is that: LinkedHashSet
		 * maintains the insertion order.
		 * 
		 * 
		 */

		return set; // [1, 2, 3, 4, 5, 6]

	}

	static ArrayList<Integer> removeDuplicates2(ArrayList<Integer> list) {
		ArrayList<Integer> newList = new ArrayList<>();
		for (Integer i : list) {
			if (!newList.contains(i)) {
				newList.add(i);
			}
		}
		return newList;
	}
	/*
	 * static ArrayList<Integer> remover(ArrayList<Integer> list) { for (int i = 0;
	 * i < list.size(); i++) { int count = 0; for (int j = 0; j < list.size(); j++)
	 * { if (list.get(i).equals(list.get(j))) count++; } if (count > 1) {
	 * list.remove(list.get(i)); i--; } } return list; return new ArrayList<>(new
	 * HashSet<>(list)); }
	 */
}
