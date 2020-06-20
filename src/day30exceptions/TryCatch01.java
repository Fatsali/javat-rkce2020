package day30exceptions;

public class TryCatch01 {

	public static void main(String[] args) {
		int num1=12;
		int num2=0;
		//finally{} block exception olsada olmasa da her zaman �al���r. finally block try catch block dan sonra kullan�l�r. 
		try {
			System.out.println(num1/num2);
		}catch(ArithmeticException e) {
			System.out.println("S�f�r ile b�lme yap�lamaz");
		}finally {
			System.out.println("�sleminiz bitmi�tir");
		}

	}
	//Interview: final, finally, finalize keyword lerinin fark�n� a��klay�n�z.
	//1) finally{}:(block) try catch block dan sonra kullan�l�r. exception olsa da olmasa da �al���r
	
	//2)final== (keyword)variable larda final kullan�l�rsa o veriablenin de�eri de�i�tirilemez. mesele pi say�s�. final pi sayisi seklinde 
	// pi say�s� yap�ld��� zaman de�eri de�i�mez. 
	//methodlarda final kullan�l�rsa o methodun body k�sm�n� de�i�tiremezsiniz denir. overriding yapamazs�n�z. 
	//class larda final kullan�l�rsa o class extend edilemez. 
	//public final class Animal{}==>public class Dog extends Animal{}
	
	//3 finalize()==>(method) finalize () , methodu Garbage Collectorin imha edece�i datalari imha edilecek hale getirir. 
	
	
}
