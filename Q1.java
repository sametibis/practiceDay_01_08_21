package practiceOzkanAyata04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Q1 {
	/*
	 * 1-) Write a function to check whether a string is pangram or not assuming
	 * that the string passed in does not have any punctuation. Pangrams are words
	 * or sentences containing every letter of the alphabet at least once.
	 */

	public static void main(String[] args) {
		System.out.println(isPangram("The quick brown fox jumps over the lazy dog"));
		System.out.println(isPangram2("The quick brown fox jumps over the lazy dog"));
		System.out.println(isPangram3("The quick brown fox jumps over the lazy dog"));
		
		
		
		// What is the Set?
		ArrayList<Integer> list = new ArrayList<>(List.of(5, 5, 1, 1, 2, 2, 3, 3));
		System.out.println(list); // [1, 1, 2, 2, 3, 3]

		HashSet<Integer> set = new HashSet<>(list);
		System.out.println(set);// [1, 2, 3, 5]

	}

	static boolean isPangram(String str) {
		ArrayList<Character> alphabet = new ArrayList<>();
		for (char c = 'a'; c <= 'z'; c++) {
			alphabet.add(c);
		}
		str = str.replace(" ", "").toLowerCase();
		ArrayList<Character> letters = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			if (!letters.contains(str.charAt(i))) {
				letters.add(str.charAt(i));
			}
		}
		Collections.sort(letters);
		if (letters.equals(alphabet)) {
			return true;
		}
		return false;
	}

	// Another way
	static boolean isPangram2(String str) {
		str = str.toLowerCase();
		for (int i = 'a'; i <= 'z'; i++) {
			if (!str.contains(i + "")) {
				return false;
			}
		}
		return true;
	}

	// Use Sets
	static boolean isPangram3(String s) {
		s = s.replace(" ", "").toUpperCase();
		String[] arr = s.split("");
		List<String> list = Arrays.asList(arr);

		HashSet<String> set = new HashSet<>(list);

		return set.size() == 26;

	}

}
