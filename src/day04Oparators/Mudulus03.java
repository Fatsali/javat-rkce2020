package day04Oparators;

import java.util.Scanner;

public class Mudulus03 {

	public static void main(String[] args) {
		
		// kullan�c�dan �� basamakl� bir tam say� al�n bu say�n�n rakamlar� toplam�n� bulan bir program yaz�n�z
		Scanner scan=new Scanner(System.in);
		System.out.println("�� basamakl� bir say� giriniz");
		
		int s=scan.nextInt();//123
		int son=s%10;
		
		int v=s/10;
		int ort=v%10;
		
		int ilk=s/100;//�� basamakl� say�lar�n ilk rakam�n� bulmak i�in say� 100 e b�l�n�r.
		
		System.out.println(son+ilk+ort);
				
		
		
	scan.close();	
		
	}

}
