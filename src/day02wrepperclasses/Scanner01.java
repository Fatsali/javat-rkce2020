package day02wrepperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		//kullan�c� iki tam say� versin
		//program bu tam say�lar�n toplama�n� ve �arp�m�n� ekrana yazd�rs�n.
		
		Scanner scan=new Scanner(System.in);//Scanner classini import ettik.
		
		System.out.println("L�tfen iki tamsay� giriniz");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		
		System.out.println(sayi1+sayi2);
		System.out.println(sayi1*sayi2);
		
		
		//kullan�c� karenin bir kenar uzunlu�unu giriniz
		//karenin �evresini ve alan�n� 
		
		
		
		
		scan.close();
		
		
	}

}
