package day09switchoperator;

public class Switch01 {

	public static void main(String[] args) {
		//A harfini bulunca "�lk harf" B harfini bulunca "�kinci harf"
		//C harfini bulunca "�c�nc� harf" D harfini bulunca "D�rd�nc� harf
		//yazd�ran program� if else if ve switch kullanarak yaz�n�z
		
		
		char harf='A';
		//1.Yol==>if else if
		if (harf=='A') {
			System.out.println("�lk harf");
		}else if (harf=='B') {
			System.out.println("�kinci harf");
		}else if (harf=='C') {
			System.out.println("���nc� harf");}
		else if (harf=='D') {
			System.out.println("D�rd�nc� harf");}
		else {
			System.out.println("Bilmiyorum");
		}
		
		//2. yol ==>switch 
		switch(harf) {
		case'A':
			System.out.println("�lk harf");
			break;
		case'B':
			System.out.println("�kinci harf");
			break;
		case'C':
			System.out.println("���nc� harf");
			break;
		case'D':
			System.out.println("D�rd�nc� harf");
			break;	
		default:
			System.out.println("Bilmiyorum");
		
		
		}
		
	}

}
