package day14dowhileloop;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		//Kullanýcýdan bir String alýn bu stringin index i tek sayý olan karakterlerini ekrana yazdýrýn.

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir kelime veya cümle giriniz");
		String str=scan.nextLine();
		int length=str.length();
		int i=1;
		do {
			if(i%2==1) {
			System.out.print(str.charAt(i)+" ");
			}
			i++;
		}while(i<length);
		
	}

}
