package day13whiledowhileloops;

public class whileLoop02 {

	public static void main(String[] args) {
		// ilk 5 sayma yayýsýnýn çarpýmýný ekrana yazdýran programý yazýnýz
		
		int num=1;
		int product=1;
		
		while(num<6) {
			product=product*num;
			num++;
		}
		System.out.println(product);		
				

	}

}
