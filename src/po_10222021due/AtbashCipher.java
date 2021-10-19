package po_10222021due;

import java.util.Scanner;

public class AtbashCipher {

	private static String alphabet = "abcdefghijklmnopqrstuvwxyz";
	private static String alphabet_caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String reversed = "zyxwvutsrqponmlkjihgfedcba";
	private static String reversed_caps = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String to be coded?");
		String s1 = sc.nextLine();
		System.out.println(cipher(s1));
		sc.close();
	}
	
	public static StringBuilder cipher(String s1) {
		StringBuilder coded_string = new StringBuilder("");
		for (int i = 0; i < s1.length(); i++) {
			String character = String.valueOf(s1.charAt(i));
			if (alphabet.contains(character)) {
				Integer index = alphabet.indexOf(character);
				String coded = String.valueOf(reversed.charAt(index));
				coded_string.append(coded);
				continue;
			}
			if (alphabet_caps.contains(character)) {
				Integer index = alphabet_caps.indexOf(character);
				String coded = String.valueOf(reversed_caps.charAt(index));
				coded_string.append(coded);
				continue;
			}
			else {
				coded_string.append(character);
				continue;
			}
		}
		return coded_string;
	}
	
}
