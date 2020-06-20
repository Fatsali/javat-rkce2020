package Java_Reviev_Turkish;

import java.util.Scanner;

public class Day022 {

	public static void main(String[] args) {
		// Scanner kullanarak kullanýcýdan saat,
		//dakika ve saniye bilgilerini alarak sonucu yazdýrýnz
	    // saat,dakika, saniye -->int
	    // PM veya AM--> String
	    // Örn: 11:25:33 PM
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen saati giriniz");
		int saat=scan.nextInt();
		System.out.println("Lütfen dakikayý giriniz");
		int dakika=scan.nextInt();
		System.out.println("Lütfen saniyeyi giriniz");
		int saniye=scan.nextInt();
		System.out.println("Lütfen PM veya AM giriniz");
		String pmam=scan.next();
		pmam=pmam.toLowerCase();
		
		System.out.println("Saat:"+saat+":"+dakika+":"+saniye+" "+pmam);
		
		scan.close();
	}

}
