package day02wrepperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		//kullan�c� karenin bir kenar uzunlu�unu giriniz
				//karenin �evresini ve alan�n�
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen karenin bir kenar uzunlu�unu yaz�n�z");
		
		int kenarUzunlugu=scan.nextInt();
		

		System.out.println(kenarUzunlugu*4);
		System.out.println(kenarUzunlugu*kenarUzunlugu);
		
		
		
		
		
		scan.close();

	}

}
