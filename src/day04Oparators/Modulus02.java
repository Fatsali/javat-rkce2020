package day04Oparators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
	
		//Kullanicinin girdigi 4 basamakli sayinin ilk ve son rakaminin
		//toplamini veren program yazin
		
	Scanner scan=new Scanner(System.in);
	System.out.println("L�tfen 4 basamakl� bir tam say� giriniz");
	
	
	//Bir tam say�n�n birler basamag�n� bulmak i�in say� 10 a b�l�n�r
	
	int s=scan.nextInt();
	int sonRakam=s%10;
	int ilkRakam=s/1000;
	
	System.out.println(sonRakam+ilkRakam);
	
	
	scan.close();

	}

}
