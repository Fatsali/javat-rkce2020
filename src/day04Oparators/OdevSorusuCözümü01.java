package day04Oparators;

import java.util.Scanner;

public class OdevSorusuC�z�m�01 {

	public static void main(String[] args) {
		
		//kullan�c�dan Integer ald�ktan sonra String alam�yoruz.
		
		Scanner scan=new Scanner(System.in);
		
		//javada nextInt kulland�ktan sonra next 
		System.out.println("ya��n�z� giriniz");
		String yas=scan.nextLine();
		int yeniYas=Integer.parseInt(yas);//stringi tamsay�ya cevirme metodu
		                                  //Integer.parseInt() sadece rakam i�eren Stringler i�in kullan�l�r
		System.out.println(yeniYas+1);
		
		System.out.println("Ad�n�z� ve soyad�n�z� giriniz");
		String isim=scan.nextLine();
		System.out.println(isim);
		

		
		
		
		
		
		
		
		
		scan.close();
		

	}

}
