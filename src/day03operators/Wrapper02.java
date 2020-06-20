package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
		
		
		// kullanýcýdan ilk ismini alýn ekrana yazdýrýn
		//kullanýcýdan soy ismini alýn altýna yazdýrýn
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen isminizi giriniz");
		String isim=scan.nextLine();
		System.out.println("Soy isminizi giriniz");
		String soyisim=scan.nextLine();
		
		System.out.println(isim);
		System.out.println(soyisim);
		scan.close();
	}

}
