package day03operators;

public abstract class TypeCasting01 {

	public static void main(String[] args) {
		
		byte by=101;
		int sayi=by;
		
		System.out.println(sayi);// küçük data tipini büyük data tipine çevirmek için ekstra bir kod yazmaya gerek yokk. java bunu otamatk olarak yapar.
		// buna bir Auto Widining denir
		
		
		int sayi2=53;
		byte by2=(byte)sayi2;// büyük data tipini küçük data tipine çevirmek java tarafýndan yapýlmaz
		// örnekteki gibi sað tarafa dönüþtürmek istediðimiz data tipini parantez içine yazmalýyýz.
		
		System.out.println(by2);
		
		double sayi3=23.9;
		int by3=(int)sayi3;
		
		System.out.println(by3);
		
		
		float sayi4=-23.9f;
		short by4=(short)sayi4;
		
		System.out.println(by4);//-23
		
		double sayi5=4.8;
		double sayi6=1.4;
		double sonuc1=sayi5/sayi6;
		System.out.println(sonuc1);//3.428571428571429
		
		int sonuc2=(int)(sayi5/sayi6);
		System.out.println(sonuc2);//3 
		
		int sayi7=5;
		int sayi8=3;
		int sonuc3=sayi7/sayi8;
		System.out.println(sonuc3);// normalde 5/3=1.666666 çýkar ama data type int aldýðýmýz için tam sayý çýkar
		
		
		int sayi9=255;
		byte by5=(byte) sayi9;
		System.out.println(by5);//normalde byte ta (-128....0.....127)256 sayi var.255 bir tane eksik o yüzden -1 yazýyor.
		
		
		
		
				
		
		

	}

}
