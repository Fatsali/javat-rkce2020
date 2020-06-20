package day17constructors;

public class Constructors02 {
	//buyume methodu bu class da deðil. constructors01 class ýnda o yüzden java kullanmama izin vermiyor.
	//eger siz baþka bir class daki methodu kullanmak istiyorsanýz
	// o class tan bir obje oluþturup o object sayesinde istediðiniz methodu kullanabilirsiniz
	public static void main(String[] args) {
		
		Constructors01 obj1=new Constructors01();
		
		//büyüme methodu static olduðundan java object kullanarak büyüme methodunu 
		//çaþýkrmamýzý istemez ve kodun altýný sarý renkle cizer
		obj1.buyume(33);
		Constructors01.buyume(45);//46
		obj1.isimDegistir("Kemal Can");
		Constructors01.isimDegistir("Merhaba Naci");
		System.out.println(obj1.isim);
		System.out.println(obj1.yas);
		
		// bir variable veya method static olarak oluþturulmuþsa o variable veya methoda obje oluþturmadan sadece 
		// class ismini kullanarak ulaþabilirsiniz
		System.out.println(Constructors03.ad);
		System.out.println(Constructors03.kilo);
		Constructors03.artirma(45);
		Constructors03.degistirme("Ayhan Isik");

	}

}
