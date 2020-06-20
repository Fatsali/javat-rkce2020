package day17constructors;

public class Constructors02 {
	//buyume methodu bu class da de�il. constructors01 class �nda o y�zden java kullanmama izin vermiyor.
	//eger siz ba�ka bir class daki methodu kullanmak istiyorsan�z
	// o class tan bir obje olu�turup o object sayesinde istedi�iniz methodu kullanabilirsiniz
	public static void main(String[] args) {
		
		Constructors01 obj1=new Constructors01();
		
		//b�y�me methodu static oldu�undan java object kullanarak b�y�me methodunu 
		//�a��krmam�z� istemez ve kodun alt�n� sar� renkle cizer
		obj1.buyume(33);
		Constructors01.buyume(45);//46
		obj1.isimDegistir("Kemal Can");
		Constructors01.isimDegistir("Merhaba Naci");
		System.out.println(obj1.isim);
		System.out.println(obj1.yas);
		
		// bir variable veya method static olarak olu�turulmu�sa o variable veya methoda obje olu�turmadan sadece 
		// class ismini kullanarak ula�abilirsiniz
		System.out.println(Constructors03.ad);
		System.out.println(Constructors03.kilo);
		Constructors03.artirma(45);
		Constructors03.degistirme("Ayhan Isik");

	}

}
