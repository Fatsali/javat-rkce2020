package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		// Kullanicidan alacagi urun miktarini ve fiyatini alalim
		// Eger kullanici 1000 den fazla urun alirsa %20 indirim yapin
		// ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
		// Eger kullanici 1000 den az veya 1000 urun alirsa indirim yapmayin
		// ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
		//para konularýnda double kullanýn
		//örnek 60 tl ye %20 indirim 0===>60*80/100
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Alacagýnýz ürün sayýsýný giriniz");
		double miktar=scan.nextDouble();
		System.out.println("Alacaðýnýz ürünün birim fiyatýný giriniz");
		double birimFiyat=scan.nextDouble();
		
		if(miktar>1000) {
			System.out.println(miktar*(birimFiyat*80)/100);
		}
		else {
			System.out.println(miktar*birimFiyat);
		}
		
		
		
		
		
		scan.close();

	}

}
