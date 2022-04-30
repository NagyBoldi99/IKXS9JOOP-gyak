package feladatok;

import java.util.Scanner;

public class c {

	static Scanner input= new Scanner(System.in);
	public static void main(String[] args) {
		szemely sz = new szemely();
		sz=Readsz();
		System.out.println(sz.toString());

	}
	public static szemely Readsz()
	{
		szemely sz=new szemely();
		boolean ok;
		do {
			 System.out.println("Height(m),Weight(kg),FullName");
			 String inString = input.nextLine();
			 String[] strArray = inString.split(",");
			 	ok = true;
			 try {
				sz.setHeight(Double.parseDouble(strArray[0]));
				sz.setWeight(Integer.parseInt(strArray[1]));
				sz.setName(strArray[2]);
			 }
			 catch (Exception e) {
				 ok = false;
			 }
			} while (!ok);
		return sz;
	}
	
}
