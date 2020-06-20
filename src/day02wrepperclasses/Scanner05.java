package day02wrepperclasses;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
		
		/*ýnan bir dairenin çevresini ve alanýný hesaplayan 
		bir program yazýnýz. (float kullanýnýz)
		Not 1: pi sayýsý: 3.14159
		Not 2: Alan: 3.14159 x radius x radius
		Not 3: Cevre: 2 x 3.14159 x radius */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen yarý capi giriniz");
		
		double yaricap=scan.nextDouble();//data tipi int ise next in kullanýlýr
				                        //data tibi Double ise next Double kullanýlýr
		
		System.out.println(3.14159*yaricap*yaricap);
		System.out.println(2*3.14159*yaricap);
		
scan.close();
	}

	
}
