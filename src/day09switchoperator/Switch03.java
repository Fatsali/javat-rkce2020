package day09switchoperator;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		// kullan�c� ay ismini girsin program ka��nc� ay oldu�un ekrana yazz
		//B�y�k harf k���k harf hepsi i�in �al��s�n
		//yanl�� ay ismi girerse ge�erli ay ismi giriniz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir ay ismi giriniz");
		String ay=scan.next();
		ay=ay.toLowerCase();//toLowerCase()==> bu metod Stringleri k���k harfe �evirmek i�in kullan�l�r.
		//toUpperCase ==>String leri b�y�k harfe �evirmek i�in kullan�l�r.
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
		case "may�s":
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
		case "eyl�l":
			System.out.println("9.Ay");
			break;
		case "ekim":
			System.out.println("10.Ay");
			break;
		case "kas�m":
			System.out.println("11.Ay");
			break;
		case "aral�k":
			System.out.println("12.Ay");
			break;
		default:
			System.out.println("Ge�erli ay ismi giriniz");
			
		}
		
		scan.close();
		
		
		
	}

}
