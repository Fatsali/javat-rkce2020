package day16overloading;

import java.util.Scanner;

public class OdevSorusu03 {

	public static void main(String[] args) {
		/*
		 Kullanýcýya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayý seçmesini söyleyin. 
        Hangi þekli seçerse, o þeklin alanýný ve çevresini ekrana yazdýran programý yazýnýz.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Paralelkenar, dikdörtgen ve üçgen kelimelerinden birini seciniz");
		String sekilIsmi = scan.next().toLowerCase();
		System.out.println("Iki sayi giriniz");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		alanVeCevre(sekilIsmi,num1,num2);
		scan.close();
			}
			 
			public static void alanVeCevre(String sekilIsmi, int num1, int num2) {
				
				switch(sekilIsmi) {
				case "paralelkenar":
					System.out.println("Alan= " + num1*num2);
					System.out.println("Cevre= " + 2*(num1+num2));
					break;
				case "dikdörtgen":
					System.out.println("Alan= " + num1*num2);
					System.out.println("Cevre= " + 2*(num1+num2));
					break;
				case "ucgen":
					System.out.println("Alan= " + (num1*num2)/2);
					break;
				default:
					System.out.println("Yanlis sekil ismi girdiniz");
				
				}
				}
			}
