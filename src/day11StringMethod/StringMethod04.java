package day11StringMethod;

public class StringMethod04 {

	public static void main(String[] args) {
		// valueOf() rakamlarla oluþturulan Stringleri sayiya dönüþtürür böylece rakamlarla oluþturulan
		//Stringlere matamatiksel iþlemler yapabilmemizi saðlar.
		// velueOf() hem Integer wrapper classýnýn içindeki hem de Stringin içinde var. Integer wrapper
		//classýnýn içinde olan velueOf methodu String i integere çeviri. 
		String paraErkek="1900";
		String paraKadýn="2000";
		
		// bu ailenin toplam gelirini bulunuz
		System.out.println(paraErkek+paraKadýn);
		System.out.println(Integer.valueOf(paraErkek)+Integer.valueOf(paraKadýn));
		
		int maasErkek=1900;
		int maasKadýn=2000;
		
		// maaþ erkek ve maaþ kadýn sayýlarýný stringe dönüþtürün ve concatenation yapýn
		
		System.out.println(maasErkek+maasKadýn);
		System.out.println(String.valueOf(maasErkek)+String.valueOf(maasKadýn));
		

	}

}
