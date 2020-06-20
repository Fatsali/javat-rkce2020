package day13whiledowhileloops;

import java.util.Scanner;

public class WhileLoop03 {

	public static void main(String[] args) {
		// Kullanýcýdan bir rakam alýn ve bu rakam icin
				//çarpým tablosunu ekrana yazdýrýn. 
				//Kullanýcýnýn hata yapmadýðýný farz edin. 
				//Ornegin kullanýcý 3 girerse; 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 
				//3x7=21 3x8=24 3x9=27 3x10=30

				
				Scanner scan=new Scanner (System.in);
				System.out.println("Lütfen bir rakam giriniz");
				int num=scan.nextInt();
				int product=1;
				if(num<0||num>9) {
					System.out.println("Lütfen rakam giriniz");
				}else {
				while(product<11) {
				System.out.println(num+"x"+product+"="+num*product+" ");
				product++;
				}
				}
				scan.close();	 
	}
}
