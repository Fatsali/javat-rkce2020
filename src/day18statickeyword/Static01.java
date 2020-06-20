package day18statickeyword;

public class Static01 {
	
	static int en=12;
	static int boy=10;
	static int yaricap=4;
	static double pi;
	static int alan ;
	// e�er bir variable de�erini  olu�tururken hesap yapmam�z gerekirse "static block" olu�turmak iyidir
	//yani int alan=en*boy demek yerine static block olu�turup bu i�lemleri static block i�ine yazmak 
	//daha iyidir. "static block" variable lere de�er atamak i�in de kullan�labilir. 
	//static block class �n i�inde b�t�n methodlar�n main dahil d���nda ve constructorun d���nda olu�turulmal
	//static block class olu�turuldu�u zaman olu�turulur. 
	//static block t�m methodlardan ve constructorlardan �nce �al��t�r�l�r. 
	//birden fazla static block varsa �stteki �nce �al���r.
	
	static {
		pi=3.14;
	}
	
	static {
		alan=en*boy;
		pi=3.14;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(pi);
	
	}
	//Static class olu�turulabilir ama alt classlar static class olabilir.
	//�st class lar static olamazlar.

		static class AltClass{
			public static void main(String[]args) {
				
			}
			
		}
	
}
