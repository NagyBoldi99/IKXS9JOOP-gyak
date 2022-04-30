package gyak02;

import java.util.Scanner;

public class elsofeladat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;

		do {
			System.out.println("Enter a number between 1 and 10");
			while (!input.hasNextInt()) {
				System.out.println("Thats not a number");
				input.next();
			}
			n = input.nextInt();
		} while (n < 1 || n > 10);

		input.close();

		System.out.println("n = " + n);

		int db = 0;
		for (int i = 10, j = i + 1; db < n; i++, j++) {
			if (relprim(i, j)) {
				db++;
				System.out.println("Relativ primek " + i + " " + j);
			}
		}

		System.out.println(db + " darab relativ prim van");
	}

	public static boolean relprim(int i, int j) {
		if (lnko(i, j) == 1) {
			return true;
		} else
			return false;
	}

	public static int lnko(int i, int j) {
		while (j != 0) {
			int tmp = j;
			j = i % j;
			i = tmp;
		}
		return i;
	}
}

