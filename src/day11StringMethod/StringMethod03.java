package day11StringMethod;

public class StringMethod03 {

	public static void main(String[] args) {
		// concat()method concatenation yapmanýn yani iki Stringi birleþtirmenin diðer yöntemidir.
		String str1="Ali";
		String str2="Veli";
		System.out.println(str1+str2);
		System.out.println(str1.concat(str2));
		System.out.println(str1.concat(str2).concat(str1));
		System.out.println(str1.concat("==>").concat(str2));
		
		//replace() methodu bir characterin bütün görünümlerinin yerine baþka characte yazmaya yarar.
		//ornek ata==>ana
		//replace() 1.versiyon
		String str3="ata";
		System.out.println(str3.replace("t", "n"));//ana
		System.out.println(str3.replace("a", "o"));//oto
		
		System.out.println(str3.replace("x", "y"));//ata x olmadýðý için herhangi bir deðiþim yapmaz
		System.out.println(str3.replace("", "/"));
		System.out.println(str3.replace("t", ""));// aa olur t yi siler biz bir harfi silmek için kullanýlýr. 
		System.out.println(str3.replace("a", ""));
		System.out.println(str3.replace("at", "Mustaf"));
		System.out.println(str3.replace("at", "y"));
		System.out.println(str3.replace("ata", "y"));
		
		//replace() 2.versiyon
		//replaceFirst() methodu deðiþtirmek istediðimiz characterin ilk görünümünü deðiþtirir
		String str4="karakartal";
		System.out.println(str4.replaceFirst("k", "K"));// Karakartal
		System.out.println(str4.replaceFirst("a", "e"));//kerakartal
		System.out.println(str4.replaceFirst("ka", "A"));//Arakartal
		System.out.println(str4.replaceFirst("kar", ""));//akartal
		System.out.println(str4.replaceFirst("kara", "A"));//Akartal
		System.out.println(str4.replaceFirst("karakartal", "cimbombom"));// cimbombom
		
		//Soru:
		String text="Ali okula gitti. Ali otobüse bindi. Ali eve geldi.Ali yemek yedi.Ali uyudu.";
		System.out.println(text.replace("Ali", "Veli"));
		
		//replaceAll() ve replace() methodu tamamýyla ayný þeyi yapar.replace methodunda isterseniz tek harfli karakterler için tek týrnak kullanabilirsiniz fakat replace All da tek týrnak kullanamazsýnýz
		
		
	}

}
