package Java_Reviev_Turkish;

import java.util.Scanner;

public class Day022 {

	public static void main(String[] args) {
		// Scanner kullanarak kullan�c�dan saat,
		//dakika ve saniye bilgilerini alarak sonucu yazd�r�nz
	    // saat,dakika, saniye -->int
	    // PM veya AM--> String
	    // �rn: 11:25:33 PM
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen saati giriniz");
		int saat=scan.nextInt();
		System.out.println("L�tfen dakikay� giriniz");
		int dakika=scan.nextInt();
		System.out.println("L�tfen saniyeyi giriniz");
		int saniye=scan.nextInt();
		System.out.println("L�tfen PM veya AM giriniz");
		String pmam=scan.next();
		pmam=pmam.toLowerCase();
		
		System.out.println("Saat:"+saat+":"+dakika+":"+saniye+" "+pmam);
		
		scan.close();
	}

}
