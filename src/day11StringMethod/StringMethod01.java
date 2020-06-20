package day11StringMethod;

public class StringMethod01 {

	public static void main(String[] args) {
		//startsWith() methodu bir Stringin istenen harfle baþlayýp 
		//baþlamadýðýný kontrol eder.Ýstenen harfle baþlýyorsa true baþlamýyorsa false return eder.
		String str1="Ali Can";
		//startsWith() 1.versiyon
		System.out.println(str1.startsWith("A"));
		System.out.println(str1.startsWith("B"));
		System.out.println(str1.startsWith("a"));
		System.out.println(str1.startsWith("Ali"));
		
		
		//startsWith() 2.versiyon
		
		System.out.println(str1.startsWith("a", 3));
		System.out.println(str1.startsWith("a", 5));
		System.out.println(str1.startsWith("Can", 4));
		
		//endsWith()Methodu istenen harfle bitiyorsa ture bitmiyorsa false
		
		String str2="Ayse Canan";
		System.out.println(str2.endsWith("n"));
		System.out.println(str2.endsWith("Canan"));
		System.out.println(str2.endsWith("CANAN"));
		System.out.println(str2.endsWith(""));
		
		String str3="Ali ";
	    System.out.println(str3.endsWith(" "));
	    System.out.println(str3.endsWith(""));
				
		
		
	}

}
