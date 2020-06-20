package day07nestedif;

import java.util.Scanner;

public class ArtikYilSorusuInterview {

	public static void main(String[] args) {
		// kullanýcýdan yýl girmesini isteyin 
		//girilen yýl artýk yýl ise ekrana "Artýk yýl" yazdýrýn
		//girilen yýl artýk yýl deðil ise ekrana"Artýk yýl deðil" yazdýrýn
		//Artýk yýl 1)yýl 100 e bölünürse 400 e de bölünmeli==>1300 artýk yýl deðildir. 100 bölündüðü halde 400 bölünmüyor.
		//1200 artýk yýldýr. 100 bölünüyor 400 e de bölünüyor.
		//2) yýl 100 e bölünmezse 4 e bölünmeli
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir yýl giriniz");
		int yil=scan.nextInt();
		if(yil%100==0 && yil%400==0) {
			System.out.println(yil +" Artik yildir.");
		}else if(yil%100!=0 &&yil%4==0) {
			System.out.println(yil +" Artýk yildir.");
		}else {
			System.out.println(yil+" artýk yýl degildir.");
		}
		
		
		
		scan.close();

	}

}
