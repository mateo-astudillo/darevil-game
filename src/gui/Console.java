package gui;

import java.util.Scanner;

abstract public class Console {
	private static Scanner input = new Scanner(System.in);

	public static void print(Object m) {
		System.out.print(m);
	}

	public static void println(Object m) {
		System.out.println(m);
	}

	public static String getString() {
		String word = input.nextLine();
		return word;
	}

	public static int getInt(int min, int max) {
		int number = min - 1;
		String temp;
		while (number < min || number > max) {
			Console.print(" (" + min + ", " + max + ")\n > ");
			try {
				temp = input.nextLine();
				number = Integer.parseInt(temp);
			} catch (NumberFormatException ex) {
				Console.print("Inserte un numero...\n > ");
			}
		}
		return number;
	}

	public static boolean match(String word, String[] words) {
		boolean result = false;
		for (int i = 0; i < words.length; i++) {
			result = word.equalsIgnoreCase(words[i]);
			if (result) {
				return result;
			}
		}
		return result;
	}
}