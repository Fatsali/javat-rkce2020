package day07nestedif;

import java.util.Scanner;

public class Odevsorusu3 {

	public static void main(String[] args) {
		// 
		// Kullanýcýdan bir gün adý alýn eðer gün "Cuma ise ekrana"Müslümanlar için kutsal gün
				//cumartesi ise ekrana "Yahudileri için kutsal gün" Pazar ise ekrana Hýristiyanlar için kutsal gün yazdýrýn
				Scanner scan=new Scanner(System.in);
				System.out.println("Lütfen haftanýn bir gün ismi giriniz");
				String day=scan.nextLine();
				//equalsýgnorecase
				if(day.equalsIgnoreCase("cuma")){
					System.out.println("Müslümanlar için kutsal gün.");
				}
				else if(day.equalsIgnoreCase("cumartesi")) {
					System.out.println("Yahudiler için kutsal gün.");	
				}
				else if(day.equalsIgnoreCase("pazar")){
					System.out.println("Hristiyanlar için kutsal gün.");	
				}else{
					System.out.println("Böyle bir kutsal gün yoktur.");
				}
				
				
			scan.close();	
				

	}

}
