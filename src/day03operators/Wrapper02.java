package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
		
		
		// kullan�c�dan ilk ismini al�n ekrana yazd�r�n
		//kullan�c�dan soy ismini al�n alt�na yazd�r�n
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen isminizi giriniz");
		String isim=scan.nextLine();
		System.out.println("Soy isminizi giriniz");
		String soyisim=scan.nextLine();
		
		System.out.println(isim);
		System.out.println(soyisim);
		scan.close();
	}

}
