package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement04 {

	public static void main(String[] args) {
	//kullan�c�dan yas�n� al�n
		//yas 13 den az ise ekrana "�al��amaz" mesaj� verin
		//ya� 13 den 65 e kadar ise ekranan "�al��abilir"yazd�r�n
		//ya� 65 den b�y�k ise ekrana "Emekli"yazd�r�n
		//negatif say� girerse "Ya� negatif olamaz" desin
		
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Ya��n�z� giriniz");
		int yas=scan.nextInt();
		
	
		if (yas<0) {
			System.out.println("Yas negatif olamaz");
		}
		else if(yas<13) {
			System.out.println("�al��amaz");
		}
		else if(yas<=65) {
			System.out.println("�al��abilir");
		}
		else {
			System.out.println("Emekli");
		}
		
		
		scan.close();

	}

}
