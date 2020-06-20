package day16overloading;

public class Overloading01 {

	public static void main(String[] args) {
		// iki sayýnýn toplamýný ekrana yazdýrann bir method oluþturunuz

		
		toplama(2,3);//Method 1
		toplama(7);//Method 2
		toplama(2.3,4);//Method 3
		toplama(5,4.1);//Method 4
	}
	//methodun body kýsmýný deðistirmek yeterli olmadý
	//overloading yapma yollarý
	//1)Parametrelerin sayýsýný deðiþtirerek ayný isimli method'lar oluþturabiliriz
	//2)Parametre sayýsýný deðiþtirmeden herhangi bir prametrenin data type nin deðiþtirerek de
	//ayný isimli methodlar oluþturabiliriz.
	//note: toplama (2,3);çaðrýsý toplama (int num1,int num2)var olduðu sürede 
	//toplama (int num1,int num2) yi kullanýr, çünkü argument data type ile parametre data birebir örtüþüyor
	//fakat birebir ötüþen data type yoksa auto widwninge göre java kullanacaðý methodu seçer
	//3) farkli data type indeki parametrelerin yerlerini deðiþtirerek de ayný isimli methodlar luþturabilirsiniz
	
	//Method 1
	public static void toplama(int num1,int num2) {
		System.out.println(num1+num2);
	//Method 2	
	}
	public static void toplama(int num1) {
		System.out.println(num1+num1);
	//Method 3	
	}
	public static void toplama(double num1,int num2) {
		System.out.println(num1+num2);
	//Method 4
	}
	public static void toplama(int num1,double num2) {
		System.out.println(num1+num2);
		
	}
}
