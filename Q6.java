package practiceOzkanAyata04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Q6 {

	// 9. Create a method the prints the lowercase alphabet​

	// Create a method that generates names, Method accepts an int that will set #
	// of names to be stored in the arraylist. It returns an Arraylist​

	// Create a method that accepts an arrayList of Strings and return the longest
	// String

	public static void main(String[] args) {
		ArrayList<String> list = nameCreator(10);
		System.out.println("List: " + list);
		System.out.println("The longest name of List: " + longestName(list));
	}

	static ArrayList<Character> alphabetMethod() {
		ArrayList<Character> alphabet = new ArrayList<>();
		for (char c = 'a'; c <= 'z'; c++) {
			alphabet.add(c);
		}
		return alphabet;
	}

	static char getRandomChar(int num) {
		return alphabetMethod().get(num);
	}

	static ArrayList<String> nameCreator(int num) {
		ArrayList<String> names = new ArrayList<>();
		Random rnd = new Random();
		for (int i = 0; i < num; i++) {
			String name = "";
			int random = rnd.nextInt(26); // it will create a number between 0-25
			for (int j = 0; j <= random; j++) {
				name += getRandomChar(rnd.nextInt(26));
			}
			names.add(name);
		}
		return names;
	}

	static String longestName(ArrayList<String> names) {
		String longestName = "";
		for (String name : names) {
			if (name.length() > longestName.length()) {
				longestName = name;
			}
		}
		return longestName;
	}

}
