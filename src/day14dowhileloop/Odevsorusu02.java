package day14dowhileloop;

import java.util.Scanner;

public class Odevsorusu02 {

	public static void main(String[] args) {
		// //Kullan�c�dan bir say� al�n ve bu say�n�n b�lenlerini ekrana yazd�r�n�z.
		//Ornegin; 12'nin b�lenleri 1, 2, 3, 4, 6, 12 dir.
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen pozitif bir say� giriniz");
		int num=scan.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
		    System.out.print(" "+i);}
		}
		
		System.out.println(); 
		
		int b�l=1;
		while(b�l<=num) {
			if(num%b�l==0) {
				System.out.print(" "+b�l);
			}
			b�l++;
		}
		scan.close();
	}

}
