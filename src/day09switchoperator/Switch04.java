package day09switchoperator;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		// Kullan�c�dan notunu al�n 
		//ve a�a��daki kurallara g�re ekrana A, B, C veya D yazd�r�n.
		//1. 0 dahil 50 den az - D     2. 50(dahil) ile 60 aras� - C     
		//3. 60(dahil) ile 80 aras� - B.     4. 80(dahil) ustu- A
		//yanl�� not girilirse ge�erli not giriniz
		
		
		//switch de long kullan�lamaz double kullan�lama,boolean kullln�lamaz
		
	//	Scanner scan=new Scanner(System.in);
	//	System.out.println("L�tfen notunuzu giriniz");
	//	int not=scan.nextInt();
		//switch de case ifadesinden sonra sadece bir de�er yazabilirsiniz
		//herhangi bir i�lem yapamazs�n�z.
		
	//	if(not>=0&&not<50) {
	//		not=0;
	//	}else if(not>=50&&not<60) {
	//		not=50;}
	//	else if(not>=60&&not<80) {
	//		not=60;}
	//	else if(not>=80&&not<=100) {
	//		not=80;}

	//	switch(not) {
	//	case 0:
	//		System.out.println("D ald�n�z");
	//		break;
	//	case 50:
	//		System.out.println("C ald�n�z");
	//		break;
//		case 60:
//			System.out.println("B ald�n�z");
//			break;
//		case 80:
//			System.out.println("A ald�n�z");
//			break;
//		default:
//			System.out.println("Ge�erli not giriniz");
//					
//		}
//		scan.close();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen ge�erli bir not giriniz");
		int not = scan.nextInt();
		// switch de long , double , boolean kullan�lmaz.
		if (not >= 0 && not < 50) {
			not = 0;
		} else if (not >= 50 && not < 60) {
			not = 50;
		} else if (not >= 60 && not < 80) {
			not = 60;
		} else if (not >= 80 && not <= 100) {
			not = 80;
			switch (not) {
			case 0:
				System.out.println("D");
				break;
			case 50:
				System.out.println("C");
				break;
			case 60:
				System.out.println("B");
				break;
			case 80:
				System.out.println("A");
				break;
			default:
				System.out.println("ge�erli not giriniz");
			}
	
		
		scan.close();
		
		
		}
		

	}

}
