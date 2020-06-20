package day11StringMethod;

public class StringMethod03 {

	public static void main(String[] args) {
		// concat()method concatenation yapman�n yani iki Stringi birle�tirmenin di�er y�ntemidir.
		String str1="Ali";
		String str2="Veli";
		System.out.println(str1+str2);
		System.out.println(str1.concat(str2));
		System.out.println(str1.concat(str2).concat(str1));
		System.out.println(str1.concat("==>").concat(str2));
		
		//replace() methodu bir characterin b�t�n g�r�n�mlerinin yerine ba�ka characte yazmaya yarar.
		//ornek ata==>ana
		//replace() 1.versiyon
		String str3="ata";
		System.out.println(str3.replace("t", "n"));//ana
		System.out.println(str3.replace("a", "o"));//oto
		
		System.out.println(str3.replace("x", "y"));//ata x olmad��� i�in herhangi bir de�i�im yapmaz
		System.out.println(str3.replace("", "/"));
		System.out.println(str3.replace("t", ""));// aa olur t yi siler biz bir harfi silmek i�in kullan�l�r. 
		System.out.println(str3.replace("a", ""));
		System.out.println(str3.replace("at", "Mustaf"));
		System.out.println(str3.replace("at", "y"));
		System.out.println(str3.replace("ata", "y"));
		
		//replace() 2.versiyon
		//replaceFirst() methodu de�i�tirmek istedi�imiz characterin ilk g�r�n�m�n� de�i�tirir
		String str4="karakartal";
		System.out.println(str4.replaceFirst("k", "K"));// Karakartal
		System.out.println(str4.replaceFirst("a", "e"));//kerakartal
		System.out.println(str4.replaceFirst("ka", "A"));//Arakartal
		System.out.println(str4.replaceFirst("kar", ""));//akartal
		System.out.println(str4.replaceFirst("kara", "A"));//Akartal
		System.out.println(str4.replaceFirst("karakartal", "cimbombom"));// cimbombom
		
		//Soru:
		String text="Ali okula gitti. Ali otob�se bindi. Ali eve geldi.Ali yemek yedi.Ali uyudu.";
		System.out.println(text.replace("Ali", "Veli"));
		
		//replaceAll() ve replace() methodu tamam�yla ayn� �eyi yapar.replace methodunda isterseniz tek harfli karakterler i�in tek t�rnak kullanabilirsiniz fakat replace All da tek t�rnak kullanamazs�n�z
		
		
	}

}
