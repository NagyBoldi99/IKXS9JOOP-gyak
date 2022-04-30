package gyak02;

import java.util.Scanner;

public class Negyedikfeladat {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[][] matrix = new int[5][3];
		feltolt(matrix);
		kiir(matrix);
		System.out.println("Adj meg egy szamot");
		int num=read();
		if(IsContain(matrix,num)) {
			System.out.println("Benne van");
		}
		else
		{
			System.out.println("Nincs benne");
		}
	}
	
	public static void feltolt(int[][] tomb)
	{
		for(int i=0; i<tomb.length; i++)
		{
			for(int j=0; j<tomb[0].length; j++)
			{
				tomb[i][j]=(int)(Math.random()*50)+1;
			}
		}
	}
	
	public static void kiir(int[][] tomb)
	{
		for(int i=0; i<tomb.length; i++)
		{
			for(int j=0; j<tomb[0].length; j++)
			{
				System.out.print(tomb[i][j] + " ");			
			}
			System.out.print("\n");
		}
	}
	public static boolean IsContain(int[][] matrix,int num) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if(num==matrix[row][column])
                {
                	return true;
                }
            }
        }
        return false;
    }
	
	public static int read()
	{
	int n = 0;
	while (!input.hasNextInt()) {
		System.out.println("Nem egy szam");
		input.next();
	}
		n = input.nextInt();
		input.nextLine();
		return n;
	}
}
