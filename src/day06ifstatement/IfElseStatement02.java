package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		// Kullan�c�dan bir tam say� isteyiniz ve o tam say�n�n 
		//mutlak degerini ekrana yazd�r�n
		//mutlak deger bir say�n�n kendi i�aretiyle �arp�lmas�d�r
		//�rnek=0 �n mutlak degeri 0 d�r.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir tam say giriniz");
		int num=scan.nextInt();
		if(num>0) {
		System.out.println(num*(+1));
		}
		else {
			System.out.println(num*(-1));
		}
		
		
scan.close();
	}

}
