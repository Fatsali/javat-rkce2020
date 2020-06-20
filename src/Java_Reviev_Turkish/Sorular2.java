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
        System.out.println("Lütfen bir sayý giriniz");
        int num1=scan.nextInt();
        System.out.println("Lütfen bir sayý daha giriniz");
        int num2=scan.nextInt();
        System.out.println("ilk sayýnýn karesi "+(num1*num1));
        System.out.println("ikinci sayýnýn karesi "+(num2*num2));
        System.out.println("ilk sayýnýn 5 ile çarpýmý "+(num1*5));
        System.out.println("ikinci sayýnýn 5 ile çarpýmý "+(num2*5));
        System.out.println("ilk sayýnýn 12 artýsý "+(num1+12));
        System.out.println("ikinci sayýnýn 12 artýsý "+(num2+12));
        System.out.println("ilk sayýdan 5 çýkarýmý "+(num1-5));
        System.out.println("ikinci sayýdan 5 çýkarýmý "+(num2-5));
        
        scan.close();

	}

}
