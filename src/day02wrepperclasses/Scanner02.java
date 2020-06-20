package day02wrepperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		//kullanýcý karenin bir kenar uzunluðunu giriniz
				//karenin çevresini ve alanýný
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen karenin bir kenar uzunluðunu yazýnýz");
		
		int kenarUzunlugu=scan.nextInt();
		

		System.out.println(kenarUzunlugu*4);
		System.out.println(kenarUzunlugu*kenarUzunlugu);
		
		
		
		
		
		scan.close();

	}

}
