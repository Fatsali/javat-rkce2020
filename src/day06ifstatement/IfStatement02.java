package day06ifstatement;

public class IfStatement02 {

	public static void main(String[] args) {
		//bir int variable olu�turun deger atay�n
		//eger �ift say� ise ekrana �ift yazd�r�n 
		//eger tek say� ise ekrana tek yazd�r�n
		int num=11;// burada bir test yap�ld�.12,-12,0 ,13,-13 
		if(num%2==0) {
			System.out.println("Pozitif");
		}
 
		if(num%2!=0) {
			System.out.println("Negatif");
		}
		
	}

}
