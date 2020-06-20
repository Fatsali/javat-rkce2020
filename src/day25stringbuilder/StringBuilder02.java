package day25stringbuilder;

public class StringBuilder02 {

	public static void main(String[] args) {
		//Substring() methodu atama yapmadan Strind'i deðiþtirmez
		StringBuilder str1= new StringBuilder("animals");
		//str1=str1.substring(3); hata verir. çünkü substring() methodu String Class ýndan gelir
		// ve bir string return eder. halbuki srt1 String deðil StringBuilder dir. java data tipleri
		// uyuþmadýðýndan dolayý atamayý kabul etmez. 
		// bu hatadan kurtulmak için iki yol var
		
		//1. yol : String class ýndan yeni bir String üretip atama yapýnýz. 
		
		String str2=str1.substring(3);
		System.out.println(str1);
		
		//2. yol str1.substring(3) ifadesini direk System.out.println(str1.substring(3));içine yazýn
		System.out.println(str1.substring(3));
		
		System.out.println(str1.substring(1,4));
		
		
		//indexOf() Methodu belli bir charecterin index ini return eder
		System.out.println(str1.indexOf("m"));
		
		//length() methodu string classýndan gelir ve stringin uzunluðunu return eder. 
		System.out.println(str1.length());
		
		//charAt() methodu belli bir indexteki karakteri ruturn eder.
		
		System.out.println(str1.charAt(4));
		
		// insert() methodu istenen indexe istenen characteri eklemeye yarar. 
		// insert() methodu append() gibi StringBuilder i direk deðiþtirir
		
		str1.insert(0, "X");
		System.out.println(str1);
		
		//delete() Methodu istenen index deki characteri siler
		str1.delete(0, 1);
		System.out.println(str1);
		
		//deleteCharAt() istenen index deki karakteri siler. 
		str1.deleteCharAt(6);
		System.out.println(str1);
		
		//reverse() methodu Stringi tersten yazdýrýr
		str1.reverse();
		System.out.println(str1);
		
		
		//toString() methodu StringBuilderi Stringe cevirmek için kullanýlýr.
		System.out.println(str1.toString());// str1 artýk StringBuilder deðil String'dir. 
		
		//StringBuilder Java'nýn 5. versiyonunda olusturuldu. StringBuffer'ler StringBuilder'larýn eski
		// versiyonudur. bu yüzden StringBuilder kullanmayý tercih edin.
		
		
		
		
		
		
		
	}

}
