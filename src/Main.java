import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		System.out .println("Welcome to Java program to remove duplicate characters from String"); 
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter a String with duplicate characters");
		String input = scnr.nextLine();
		String output = removeDupsInPlace(input); 
		System.out.println("String without duplicate characters is[HashMap] " + output);
		String withoutDups = removeDups(input);
		System.out.println("String without duplicate characters in place is " + withoutDups);
		scnr.close();

	}

	private static String removeDupsInPlace(String word) {
		Set<Character> chars = new HashSet<>();
		StringBuilder output = new StringBuilder(word.length());
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (chars.add(ch)) {
				output.append(ch);
			}
		}
		return output.toString();
	}

	private static String removeDups(String word) {
		
		final StringBuilder output = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			String character = word.substring(i, i + 1);
			if (output.indexOf(character) < 0) // if not contained
				output.append(character);
		}		
		return output.toString();
	}
}