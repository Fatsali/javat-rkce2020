package Java_Reviev_Turkish;

import java.util.Scanner;

public class Sorular2 {

	public static void main(String[] args) {
		/*
        Kullanici  iki sayi girsin 
        Program girilen sayilarin karesini ayri ayri ekrana yazdirsin //
        Ayri olarak; Program girilen sayilari ayri ayri 5 ile carpimini
        ve sonucunu ekrana yazdirsin. //
        Ayri olarak; Program girilen sayilara ayri ayri 12 eklesin //
        Ayri olarak; Program girilen sayilardan ayri ayri 5 cikarsin //
      */
        
        Scanner scan=new Scanner(System.in);
        System.out.println("L�tfen bir say� giriniz");
        int num1=scan.nextInt();
        System.out.println("L�tfen bir say� daha giriniz");
        int num2=scan.nextInt();
        System.out.println("ilk say�n�n karesi "+(num1*num1));
        System.out.println("ikinci say�n�n karesi "+(num2*num2));
        System.out.println("ilk say�n�n 5 ile �arp�m� "+(num1*5));
        System.out.println("ikinci say�n�n 5 ile �arp�m� "+(num2*5));
        System.out.println("ilk say�n�n 12 art�s� "+(num1+12));
        System.out.println("ikinci say�n�n 12 art�s� "+(num2+12));
        System.out.println("ilk say�dan 5 ��kar�m� "+(num1-5));
        System.out.println("ikinci say�dan 5 ��kar�m� "+(num2-5));
        
        scan.close();

	}

}
