package day14dowhileloop;

import java.util.Scanner;

public class DoWhile03 {
	int num;
	public static void main(String[] args) {
		// Kullan�c�dan bir say� al�n
		//say� 10 dan k���k ise ekrana "Kazand�n�z" yazd�r�n
		//say� 10 veya 10 dan b�y�kse ekrana "Tekrar deneyiniz" yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		int num=0;
		do {
			System.out.println("Bir say� giriniz");
		    num=scan.nextInt();
		    }while(num>=10);
		
		System.out.println("Kazand�n�z");
		
scan.close();
	}

}
