package po_10152021due;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("First string?");

		String s1 = sc.next();

		System.out.println("Second string?");

		String s2 = sc.next();

		System.out.println(rotation(s1, s2));

		sc.close();

	}

	public static boolean rotation(String s1, String s2) {
		String completeString = s1 + s1;
		if (completeString.contains(s2)) return true;
		return false;
	}

}
