package day07nestedif;

import java.util.Scanner;

public class Odevsorusu3 {

	public static void main(String[] args) {
		// 
		// Kullan�c�dan bir g�n ad� al�n e�er g�n "Cuma ise ekrana"M�sl�manlar i�in kutsal g�n
				//cumartesi ise ekrana "Yahudileri i�in kutsal g�n" Pazar ise ekrana H�ristiyanlar i�in kutsal g�n yazd�r�n
				Scanner scan=new Scanner(System.in);
				System.out.println("L�tfen haftan�n bir g�n ismi giriniz");
				String day=scan.nextLine();
				//equals�gnorecase
				if(day.equalsIgnoreCase("cuma")){
					System.out.println("M�sl�manlar i�in kutsal g�n.");
				}
				else if(day.equalsIgnoreCase("cumartesi")) {
					System.out.println("Yahudiler i�in kutsal g�n.");	
				}
				else if(day.equalsIgnoreCase("pazar")){
					System.out.println("Hristiyanlar i�in kutsal g�n.");	
				}else{
					System.out.println("B�yle bir kutsal g�n yoktur.");
				}
				
				
			scan.close();	
				

	}

}
