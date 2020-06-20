package day16overloading;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen ilk isminizi giriniz");
		String isim=scan.nextLine().toLowerCase();
		System.out.println("Lütfen soyisminizi giriniz");
		String soyisim=scan.nextLine().toLowerCase();
		  
        isimYazma(isim,soyisim);
        scan.close();
	}
	public static void isimYazma(String isim,String soyisim) {
		
		isim=isim.substring(0, 1).toUpperCase()+isim.substring(1);
		soyisim=soyisim.substring(0, 1).toUpperCase()+soyisim.substring(1);
		
		System.out.println(isim +" "+ soyisim);
	
		
		
		}
		
	}