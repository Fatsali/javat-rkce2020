package day09switchoperator;

public class Switch01 {

	public static void main(String[] args) {
		//A harfini bulunca "Ýlk harf" B harfini bulunca "Ýkinci harf"
		//C harfini bulunca "Ücüncü harf" D harfini bulunca "Dördüncü harf
		//yazdýran programý if else if ve switch kullanarak yazýnýz
		
		
		char harf='A';
		//1.Yol==>if else if
		if (harf=='A') {
			System.out.println("Ýlk harf");
		}else if (harf=='B') {
			System.out.println("Ýkinci harf");
		}else if (harf=='C') {
			System.out.println("Üçüncü harf");}
		else if (harf=='D') {
			System.out.println("Dördüncü harf");}
		else {
			System.out.println("Bilmiyorum");
		}
		
		//2. yol ==>switch 
		switch(harf) {
		case'A':
			System.out.println("Ýlk harf");
			break;
		case'B':
			System.out.println("Ýkinci harf");
			break;
		case'C':
			System.out.println("Üçüncü harf");
			break;
		case'D':
			System.out.println("Dördüncü harf");
			break;	
		default:
			System.out.println("Bilmiyorum");
		
		
		}
		
	}

}
