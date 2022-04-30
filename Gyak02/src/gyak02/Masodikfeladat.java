package gyak02;

import java.util.Scanner;

public class Masodikfeladat {

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
		} while (n < 1 || n > 9);

		input.close();
		
		 for(int i=1; i<=n; i++)
				{
			for(int j=1; j<=n; j++)
					{
				System.out.println(n);
					}
				}
	}

}
