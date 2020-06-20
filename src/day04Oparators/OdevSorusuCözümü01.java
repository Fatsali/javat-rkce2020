package day04Oparators;

import java.util.Scanner;

public class OdevSorusuCözümü01 {

	public static void main(String[] args) {
		
		//kullanýcýdan Integer aldýktan sonra String alamýyoruz.
		
		Scanner scan=new Scanner(System.in);
		
		//javada nextInt kullandýktan sonra next 
		System.out.println("yaþýnýzý giriniz");
		String yas=scan.nextLine();
		int yeniYas=Integer.parseInt(yas);//stringi tamsayýya cevirme metodu
		                                  //Integer.parseInt() sadece rakam içeren Stringler için kullanýlýr
		System.out.println(yeniYas+1);
		
		System.out.println("Adýnýzý ve soyadýnýzý giriniz");
		String isim=scan.nextLine();
		System.out.println(isim);
		

		
		
		
		
		
		
		
		
		scan.close();
		

	}

}
