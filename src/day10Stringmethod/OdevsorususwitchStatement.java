package day10Stringmethod;

import java.util.Scanner;

public class OdevsorususwitchStatement {

	public static void main(String[] args) {
		//Kullan�c�dan ay ismi al�n e�er ay ismi 31 �eken aylardan biri ise
				//ekrana �Bu ay 31 g�nd�r� yazd�r�n. E�er ay ismi  30 �eken aylardan 
				//biri ise ekrana �Bu ay 30 g�nd�r� yazd�r�n. 
				//E�er ay ismi  28 veya 29 �eken aylardan biri ise ekrana 
				//�Bu ay �ubat ay�d�r� yazd�r�n. 
				//Bu isimlerin d���ndaki isimler i�in �Ge�ersiz ay ismi� yazd�r�n

				Scanner scan=new Scanner(System.in);
				System.out.println("L�tfen bir ay ismi giriniz");
				String ay=scan.next();
				ay=ay.toLowerCase();
				
				switch(ay) {
				case "ocak":
					System.out.println("Bu ay 31 g�nd�r.");
					break;
				case "subat":
					System.out.println("Bu ay Subat ay�d�r.");
					break;
				case "mart":
					System.out.println("Bu ay 31 g�nd�r.");
					break;
				case "nisan":
					System.out.println("Bu ay 30 g�nd�r.");
					break;
				case "may�s":
					System.out.println("Bu ay 31 g�nd�r.");
					break;
				case "haziran":
					System.out.println("Bu ay 30 g�nd�r.");
					break;
				case "temmuz":
					System.out.println("Bu ay 31 g�nd�r.");
					break;
				case "agustos":
					System.out.println("Bu ay 31 g�nd�r.");
					break;
				case "eyl�l":
					System.out.println("Bu ay 30 g�nd�r.");
					break;
				case "ekim":
					System.out.println("Bu ay 31 g�nd�r.");
					break;
				case "kas�m":
					System.out.println("Bu ay 30 g�nd�r.");
					break;
				case "aral�k":
					System.out.println("Bu ay 31 g�nd�r.");
					break;
				default:
					System.out.println("Gecersiz ay ismi.");
				}
				
			scan.close();

	}

}
