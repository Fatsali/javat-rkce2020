package day10Stringmethod;

import java.util.Scanner;

public class OdevsorususwitchStatement {

	public static void main(String[] args) {
		//Kullanýcýdan ay ismi alýn eðer ay ismi 31 çeken aylardan biri ise
				//ekrana “Bu ay 31 gündür” yazdýrýn. Eðer ay ismi  30 çeken aylardan 
				//biri ise ekrana “Bu ay 30 gündür” yazdýrýn. 
				//Eðer ay ismi  28 veya 29 çeken aylardan biri ise ekrana 
				//“Bu ay Þubat ayýdýr” yazdýrýn. 
				//Bu isimlerin dýþýndaki isimler için “Geçersiz ay ismi” yazdýrýn

				Scanner scan=new Scanner(System.in);
				System.out.println("Lütfen bir ay ismi giriniz");
				String ay=scan.next();
				ay=ay.toLowerCase();
				
				switch(ay) {
				case "ocak":
					System.out.println("Bu ay 31 gündür.");
					break;
				case "subat":
					System.out.println("Bu ay Subat ayýdýr.");
					break;
				case "mart":
					System.out.println("Bu ay 31 gündür.");
					break;
				case "nisan":
					System.out.println("Bu ay 30 gündür.");
					break;
				case "mayýs":
					System.out.println("Bu ay 31 gündür.");
					break;
				case "haziran":
					System.out.println("Bu ay 30 gündür.");
					break;
				case "temmuz":
					System.out.println("Bu ay 31 gündür.");
					break;
				case "agustos":
					System.out.println("Bu ay 31 gündür.");
					break;
				case "eylül":
					System.out.println("Bu ay 30 gündür.");
					break;
				case "ekim":
					System.out.println("Bu ay 31 gündür.");
					break;
				case "kasým":
					System.out.println("Bu ay 30 gündür.");
					break;
				case "aralýk":
					System.out.println("Bu ay 31 gündür.");
					break;
				default:
					System.out.println("Gecersiz ay ismi.");
				}
				
			scan.close();

	}

}
