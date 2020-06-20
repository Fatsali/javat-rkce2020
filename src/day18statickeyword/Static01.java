package day18statickeyword;

public class Static01 {
	
	static int en=12;
	static int boy=10;
	static int yaricap=4;
	static double pi;
	static int alan ;
	// eðer bir variable deðerini  oluþtururken hesap yapmamýz gerekirse "static block" oluþturmak iyidir
	//yani int alan=en*boy demek yerine static block oluþturup bu iþlemleri static block içine yazmak 
	//daha iyidir. "static block" variable lere deðer atamak için de kullanýlabilir. 
	//static block class ýn içinde bütün methodlarýn main dahil dýþýnda ve constructorun dýþýnda oluþturulmal
	//static block class oluþturulduðu zaman oluþturulur. 
	//static block tüm methodlardan ve constructorlardan önce çalýþtýrýlýr. 
	//birden fazla static block varsa üstteki önce çalýþýr.
	
	static {
		pi=3.14;
	}
	
	static {
		alan=en*boy;
		pi=3.14;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(pi);
	
	}
	//Static class oluþturulabilir ama alt classlar static class olabilir.
	//üst class lar static olamazlar.

		static class AltClass{
			public static void main(String[]args) {
				
			}
			
		}
	
}
