package Program;

import Model.Sales;
import Product.Book;
import Product.Estate;

public class feladat {

	private static final int FORINTTOEURO = 350;

	public static void main(String[] args) {
		Sales estate = new Estate(400000, 200, "IIT");
		System.out.println(estate);
		ConvertEuroForint(estate);
		System.out.println(estate);
		ConvertEuroForint(estate);
		
		Sales book = new Book("AZ ÉLET ÉRTELME", 1000, 20);
		System.out.println(book);
		ConvertEuroForint(book);
		System.out.println(book);

	}
	
	public static void ConvertEuroForint(Sales product) {
		if (product.getCurrency().equalsIgnoreCase("Ft")) {
			product.setPrice(product.getPrice() / FORINTTOEURO);
			product.setCurrency("Euro");
		}
		else if (product.getCurrency().equalsIgnoreCase("Euro")) {
			product.setPrice(product.getPrice() * FORINTTOEURO);
			product.setCurrency("Ft");
		}
	}
}
