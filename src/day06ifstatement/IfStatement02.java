package day06ifstatement;

public class IfStatement02 {

	public static void main(String[] args) {
		//bir int variable oluşturun deger atayın
		//eger çift sayı ise ekrana çift yazdırın 
		//eger tek sayı ise ekrana tek yazdırın
		int num=11;// burada bir test yapıldı.12,-12,0 ,13,-13 
		if(num%2==0) {
			System.out.println("Pozitif");
		}
 
		if(num%2!=0) {
			System.out.println("Negatif");
		}
		
	}

}
