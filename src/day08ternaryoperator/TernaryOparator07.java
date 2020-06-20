package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOparator07 {

	public static void main(String[] args) {
		// Kullanýcýdan bir sayý alýnýz.
		//sayý çift ise 10 a bölünüp bölünmediðini kontrol ediniz.
		//10 a bölünüyorsa "Woow"
        //10 a bölünmüyorsu "Yazýk"
		//sayý tek ise 5 e bölünüp bölünmediðin kontrol ediniz
		//sayý 5 e bölünüyorsa "wooow 5"
		//sayý 5 e bölünmüyorsa "Yazýk 5" yazdýrýnýz
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lütfen bir sayý giriniz");
		int num=scan.nextInt();
				
		String result=num%2==0?(num%10==0?"Wooow 10":"Yazýk 10"):(num%5==0?"Wooow 5":"Yazýk 5");
		System.out.println(result);
		
		scan.close();
		
	}

}
