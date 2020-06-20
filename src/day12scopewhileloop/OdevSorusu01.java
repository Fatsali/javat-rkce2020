package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
		// Kullanýcýdan yaþadýðý ülkenin ismini alýn 
		//bu ülkenin bastan ikinci harfi ile sondan ikinci
		//harfini  büyük harf olarak ekrana yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen yaþadýðýnýz ülkenin ismini giriniz.");
		String ülke=scan.nextLine();
		ülke=ülke.toUpperCase();
		System.out.print(ülke.substring(1, 2));
		int length=ülke.length();
		System.out.println(ülke.charAt(length-2));
scan.close();

	}

}
