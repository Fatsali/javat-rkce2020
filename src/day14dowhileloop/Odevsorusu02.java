package day14dowhileloop;

import java.util.Scanner;

public class Odevsorusu02 {

	public static void main(String[] args) {
		// //Kullanýcýdan bir sayý alýn ve bu sayýnýn bölenlerini ekrana yazdýrýnýz.
		//Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir.
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen pozitif bir sayý giriniz");
		int num=scan.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
		    System.out.print(" "+i);}
		}
		
		System.out.println(); 
		
		int böl=1;
		while(böl<=num) {
			if(num%böl==0) {
				System.out.print(" "+böl);
			}
			böl++;
		}
		scan.close();
	}

}
