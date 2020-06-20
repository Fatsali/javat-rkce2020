package day16overloading;

import java.util.Scanner;

public class OdevSorusu01 {
	
	public static void main(String[] args) {
		//Kullanýcýya sayý girmesini söyleyin.
	    //Kullanýcýnýn girdiði sayýnýn rakamlarý toplamýný ekrana  yazdýran bir program yazýn.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayý giriniz");
		int num=scan.nextInt();
		rakamToplamý(num);
scan.close();
	}
	public static void rakamToplamý(int num) {
		int sum=0;
		while(num!=0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("Rakamlarý toplamý "+sum);
	}
	
	
}
