package day14dowhileloop;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		//Kullan�c�dan bir String al�n bu stringin index i tek say� olan karakterlerini ekrana yazd�r�n.

		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir kelime veya c�mle giriniz");
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
