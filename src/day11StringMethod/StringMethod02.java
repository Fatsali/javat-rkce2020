package day11StringMethod;

public class StringMethod02 {

	public static void main(String[] args) {
		// substring() methodu bir stringin belli bir bölümünü kesip almak için kullanýlýr
		String str1="Java calýsana kolaydýr";
		//substring()1.versiyon
		System.out.println(str1.substring(5));//5 indexi gösterir.
		System.out.println(str1.substring(8));//index 8 dahildir(inclusive)
		System.out.println(str1.substring(22));//ekranda hiçbirþey göremezsiniz
		//System.out.println(str1.substring(23));//index 23 yok ama ben olmayan bir yerden kesmek istiyorum
		                                       // bu bir hatalý index tir. Java Exception verir. Yani beni uyarýr.hata yapýyorsun der
		System.out.println(str1.substring(0));//str1.substring(0)=str1 hiç kullanýlmaz
		//substring()2.versiyon
		System.out.println(str1.substring(5, 13));//ilk index dahil ikinci index dahil deðil.
											//ilk index i ekranda görürsünüz ikinci index ekranda göremezsiniz.
											//ekranda çalýþana görmeliyim
		System.out.println(str1.substring(6, 12));
		System.out.println(str1.substring(6, 6));//ekranda hiçbirþey vermez bu kullanýlmaz
		//System.out.println(str1.substring(7, 6));//Exception verir. bu hatayý yapmayýn. her zaman ilk index küçük veya eþit olmalýdýr.
		
		//	
		

	}

}
