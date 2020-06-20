package day09switchoperator;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		// kullanýcý ay ismini girsin program kaçýncý ay olduðun ekrana yazz
		//Büyük harf küçük harf hepsi için çalýþsýn
		//yanlýþ ay ismi girerse geçerli ay ismi giriniz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir ay ismi giriniz");
		String ay=scan.next();
		ay=ay.toLowerCase();//toLowerCase()==> bu metod Stringleri küçük harfe çevirmek için kullanýlýr.
		//toUpperCase ==>String leri büyük harfe çevirmek için kullanýlýr.
		switch(ay) {
		case "ocak":
			System.out.println("1.Ay");
			break;
		case "subat":
			System.out.println("2.Ay");
			break;
		case "mart":
			System.out.println("3.Ay");
			break;
		case "nisan":
			System.out.println("4.Ay");
			break;
		case "mayýs":
			System.out.println("5.Ay");
			break;
		case "haziran":
			System.out.println("6.Ay");
			break;
		case "temmuz":
			System.out.println("7.Ay");
			break;
		case "agustos":
			System.out.println("8.Ay");
			break;
		case "eylül":
			System.out.println("9.Ay");
			break;
		case "ekim":
			System.out.println("10.Ay");
			break;
		case "kasým":
			System.out.println("11.Ay");
			break;
		case "aralýk":
			System.out.println("12.Ay");
			break;
		default:
			System.out.println("Geçerli ay ismi giriniz");
			
		}
		
		scan.close();
		
		
		
	}

}
