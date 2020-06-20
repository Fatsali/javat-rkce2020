package day11StringMethod;

public class StringMethod04 {

	public static void main(String[] args) {
		// valueOf() rakamlarla olu�turulan Stringleri sayiya d�n��t�r�r b�ylece rakamlarla olu�turulan
		//Stringlere matamatiksel i�lemler yapabilmemizi sa�lar.
		// velueOf() hem Integer wrapper class�n�n i�indeki hem de Stringin i�inde var. Integer wrapper
		//class�n�n i�inde olan velueOf methodu String i integere �eviri. 
		String paraErkek="1900";
		String paraKad�n="2000";
		
		// bu ailenin toplam gelirini bulunuz
		System.out.println(paraErkek+paraKad�n);
		System.out.println(Integer.valueOf(paraErkek)+Integer.valueOf(paraKad�n));
		
		int maasErkek=1900;
		int maasKad�n=2000;
		
		// maa� erkek ve maa� kad�n say�lar�n� stringe d�n��t�r�n ve concatenation yap�n
		
		System.out.println(maasErkek+maasKad�n);
		System.out.println(String.valueOf(maasErkek)+String.valueOf(maasKad�n));
		

	}

}
