package day25stringbuilder;

public class StringBuilder02 {

	public static void main(String[] args) {
		//Substring() methodu atama yapmadan Strind'i de�i�tirmez
		StringBuilder str1= new StringBuilder("animals");
		//str1=str1.substring(3); hata verir. ��nk� substring() methodu String Class �ndan gelir
		// ve bir string return eder. halbuki srt1 String de�il StringBuilder dir. java data tipleri
		// uyu�mad���ndan dolay� atamay� kabul etmez. 
		// bu hatadan kurtulmak i�in iki yol var
		
		//1. yol : String class �ndan yeni bir String �retip atama yap�n�z. 
		
		String str2=str1.substring(3);
		System.out.println(str1);
		
		//2. yol str1.substring(3) ifadesini direk System.out.println(str1.substring(3));i�ine yaz�n
		System.out.println(str1.substring(3));
		
		System.out.println(str1.substring(1,4));
		
		
		//indexOf() Methodu belli bir charecterin index ini return eder
		System.out.println(str1.indexOf("m"));
		
		//length() methodu string class�ndan gelir ve stringin uzunlu�unu return eder. 
		System.out.println(str1.length());
		
		//charAt() methodu belli bir indexteki karakteri ruturn eder.
		
		System.out.println(str1.charAt(4));
		
		// insert() methodu istenen indexe istenen characteri eklemeye yarar. 
		// insert() methodu append() gibi StringBuilder i direk de�i�tirir
		
		str1.insert(0, "X");
		System.out.println(str1);
		
		//delete() Methodu istenen index deki characteri siler
		str1.delete(0, 1);
		System.out.println(str1);
		
		//deleteCharAt() istenen index deki karakteri siler. 
		str1.deleteCharAt(6);
		System.out.println(str1);
		
		//reverse() methodu Stringi tersten yazd�r�r
		str1.reverse();
		System.out.println(str1);
		
		
		//toString() methodu StringBuilderi Stringe cevirmek i�in kullan�l�r.
		System.out.println(str1.toString());// str1 art�k StringBuilder de�il String'dir. 
		
		//StringBuilder Java'n�n 5. versiyonunda olusturuldu. StringBuffer'ler StringBuilder'lar�n eski
		// versiyonudur. bu y�zden StringBuilder kullanmay� tercih edin.
		
		
		
		
		
		
		
	}

}
