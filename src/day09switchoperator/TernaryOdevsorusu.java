package day09switchoperator;

import java.util.Scanner;

public class TernaryOdevsorusu {

	public static void main(String[] args) {
		// Kullan�c�dan bir tamsay� girmesini isteyin,
		//o tamsay� 3 basamakl� ise ekrana �3 Basamakl�� yazd�r�n. 
		//3 basamakl� degilse �ift olup olmadigini kontrol edin.
		//�ift ise �3 basamakl� olmayan �ift say�� yazd�r�n.
		//�ift say� degilse �3 basamakl� olmayan tek say� yazd�r�n.�
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir tam say� giriniz.");
		int num=scan.nextInt();
		String result=num>99&&num<999?"�� basamakl� say�":(num%2==0?"�� basamakl� olmayan �ift say�":"�� basamakl� olmayan tek sayi");
		System.out.println(result);
		
		scan.close();
		 

	}

}
