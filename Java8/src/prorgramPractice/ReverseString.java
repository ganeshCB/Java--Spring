package prorgramPractice;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Input String which you want to reverse:");
			String inputtext = sc.next();

			String reverseString = reverseStringTest(inputtext);
			System.out.println(reverseString);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String reverseStringTest(String inputString) {
		if (inputString == null || inputString.trim().isEmpty())
			return inputString;

		String reverse = "";

		for (int i = inputString.length() - 1; i >= 0; i--) {
			char c = inputString.charAt(i);
			reverse = reverse +c;
		}
		return reverse;
	}
}
