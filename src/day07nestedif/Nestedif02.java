package day07nestedif;

import java.util.Scanner;

public class Nestedif02 {

	public static void main(String[] args) {
		// Kullan�c�dan password girmesini isteyin
		//password 4 basamakl� bir say� ise �ift olup olmad���n� kontrol edin
		//�ift ise ekrana "Password tamam" yazd�r�n
		//tek say� ise ekrana"Tekrar deneyin" yazd�r�n
		//Password 4 basamakl� de�il ise "Tekrar deneyin
		//4 basamakl� demek 999 dan b�y�k 10000 den k���k demektir
		//0123 java i�in 123 t�r.
		Scanner scan=new Scanner(System.in);
		System.out.println("Tam say� olan bir password giriniz.");
		int password=scan.nextInt();
		if(password>999 && password<10000) {
			if(password%2==0) {
				System.out.println("Password tamam");
			}else if(password%2!=0)
				System.out.println("Tekrar deneyin ilk");
		}else {
			System.out.println("Tekrar deneyin son");
		}
		
		
		scan.close();
		
	}

}
