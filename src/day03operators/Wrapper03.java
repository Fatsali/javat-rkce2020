package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
		
		//Kullanýcýdan ad ve soyadýný alalým ekrana yazdýralým
		//kullanýcýdan adresini alýn ekrana yazdýralým.2. cadde bakýrköy istanbul
		//kullanýcýdan yaþýný alalým ekrana yazdýralým
		//kullanýcýya türkiyede yaþýyorum. doðru yanlýþ. cevabýný ekrana yazdýralým
		//true veya false olarak
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen adýnýzý ve soyadýnýzý giriniz");
		String adýSoyadý=scan.nextLine();
		System.out.println(adýSoyadý);
		
		System.out.println("Lütfen yaþýnýzý yazýnýz");
		int yas=scan.nextInt();
		System.out.println(yas);
		
		System.out.println("Lütfen adresinizi giriniz");
		String adres=scan.nextLine();
		System.out.println(adres);
		
		System.out.println("Türkiye'de mi yaþýyorsun");
		boolean yer=scan.hasNext();
		System.out.println(yer);
		
		
		
		
		
		
		
		
				
		scan.close();
		
		
		

	}

}
