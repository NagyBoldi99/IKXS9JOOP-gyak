package feladatok;

public class b {

	public static void main(String[] args) {
		konyv test=new konyv();
		test.setAuthor("Alfonz Bakelit");
		test.setPrice(2000);
		test.setTitle("Az �let �rtelme");
		test.setYop(2000);
		test.incvalue(20);
		System.out.println(test.toString());
	}
	
}
