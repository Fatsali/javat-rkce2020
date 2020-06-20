package Java_Reviev_Turkish;

import java.util.Scanner;

public class day023 {

	public static void main(String[] args) {
		// // Kullanýcýdan bir sayý girmesini isteyiniz
		// Sayý tek sayý ise "Sayýnýz tek sayýdýr."
		// Sayý çift sayý ise "Sayýnýz çift sayýdýr." yazdýrýnýz	
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir tam sayý girininiz");
		int num=scan.nextInt();
		if(num%2==0) {
			System.out.println("Sayýnýz çift sayýdýr");
		}else {
			System.out.println("Sayýnýz tek sayýdýr.");
			scan.close();
		}
	}

}
