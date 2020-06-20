package day07nestedif;

import java.util.Scanner;

public class OdevsesliHarfSorusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("a,e,i,o,u,b,c,d,f harflerinden birini giriniz");
		char harf=scan.next().charAt(0);
		if(harf=='a'||harf=='e'||harf=='i'||harf=='o'||harf=='u') {
			System.out.println("Sesli harf");
		}
		else if(harf=='b'||harf=='c'||harf=='d'||harf=='f') {
			System.out.println("Sesli harf");
		}
		else {
			System.out.println("Sistemde bu harf yoktur");
		}
		
		
		
		
		scan.close();
		
		
	}

}
