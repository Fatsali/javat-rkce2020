package day08ternaryoperator;

public class TekAndCiftAnd {

	public static void main(String[] args) {
		
		System.out.println(3<2 && 5>4);
		// && kullanýrsanýz java ilk false bulduktan sonra diðer kontrolleri yapmaz.
		// bu da javanýn yükünü azaltýr. yükün azaltýlmasý süre kazandýrýr ve javanýn hata yapma riskini azaltýr.
		System.out.println(3<2 & 5>4);
		//& kullanýrsanýz java ilk false bulduktan sonra diðer kontrolleri yapar bu da java için iyi deðildir 
		// çünkü sonucu belli olan bir iþlem için hala emek sarfediyor.
		
	

	}

}
