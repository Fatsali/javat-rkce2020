package day30exceptions;

public class TryCatch01 {

	public static void main(String[] args) {
		int num1=12;
		int num2=0;
		//finally{} block exception olsada olmasa da her zaman çalýþýr. finally block try catch block dan sonra kullanýlýr. 
		try {
			System.out.println(num1/num2);
		}catch(ArithmeticException e) {
			System.out.println("Sýfýr ile bölme yapýlamaz");
		}finally {
			System.out.println("Ýsleminiz bitmiþtir");
		}

	}
	//Interview: final, finally, finalize keyword lerinin farkýný açýklayýnýz.
	//1) finally{}:(block) try catch block dan sonra kullanýlýr. exception olsa da olmasa da çalýþýr
	
	//2)final== (keyword)variable larda final kullanýlýrsa o veriablenin deðeri deðiþtirilemez. mesele pi sayýsý. final pi sayisi seklinde 
	// pi sayýsý yapýldýðý zaman deðeri deðiþmez. 
	//methodlarda final kullanýlýrsa o methodun body kýsmýný deðiþtiremezsiniz denir. overriding yapamazsýnýz. 
	//class larda final kullanýlýrsa o class extend edilemez. 
	//public final class Animal{}==>public class Dog extends Animal{}
	
	//3 finalize()==>(method) finalize () , methodu Garbage Collectorin imha edeceði datalari imha edilecek hale getirir. 
	
	
}
