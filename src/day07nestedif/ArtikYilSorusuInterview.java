package day07nestedif;

import java.util.Scanner;

public class ArtikYilSorusuInterview {

	public static void main(String[] args) {
		// kullan�c�dan y�l girmesini isteyin 
		//girilen y�l art�k y�l ise ekrana "Art�k y�l" yazd�r�n
		//girilen y�l art�k y�l de�il ise ekrana"Art�k y�l de�il" yazd�r�n
		//Art�k y�l 1)y�l 100 e b�l�n�rse 400 e de b�l�nmeli==>1300 art�k y�l de�ildir. 100 b�l�nd��� halde 400 b�l�nm�yor.
		//1200 art�k y�ld�r. 100 b�l�n�yor 400 e de b�l�n�yor.
		//2) y�l 100 e b�l�nmezse 4 e b�l�nmeli
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir y�l giriniz");
		int yil=scan.nextInt();
		if(yil%100==0 && yil%400==0) {
			System.out.println(yil +" Artik yildir.");
		}else if(yil%100!=0 &&yil%4==0) {
			System.out.println(yil +" Art�k yildir.");
		}else {
			System.out.println(yil+" art�k y�l degildir.");
		}
		
		
		
		scan.close();

	}

}
