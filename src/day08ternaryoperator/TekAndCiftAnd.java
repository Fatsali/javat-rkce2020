package day08ternaryoperator;

public class TekAndCiftAnd {

	public static void main(String[] args) {
		
		System.out.println(3<2 && 5>4);
		// && kullan�rsan�z java ilk false bulduktan sonra di�er kontrolleri yapmaz.
		// bu da javan�n y�k�n� azalt�r. y�k�n azalt�lmas� s�re kazand�r�r ve javan�n hata yapma riskini azalt�r.
		System.out.println(3<2 & 5>4);
		//& kullan�rsan�z java ilk false bulduktan sonra di�er kontrolleri yapar bu da java i�in iyi de�ildir 
		// ��nk� sonucu belli olan bir i�lem i�in hala emek sarfediyor.
		
	

	}

}
