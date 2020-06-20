package day19arrays;

public class Array02 {

	public static void main(String[] args) {
		// 4 elemanlý char bir Array oluþturun bu array e  elemanlar yerleþtirin tüm elemanlarý for 
		//döngüsü kullanarak ekrana yazýnýz. son elemaný ekrana yazdýrýn
		
		char arr1[]=new char[4];
		arr1[0]='a';
		arr1[1]='d';
		arr1[2]='e';
		arr1[3]='m';
		
		for(int i=0;i<4;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("Son deðer: "+(arr1[3]));
		// Array ýn length in bulmak için Arrayismi.length yazmak yeterlidir
		//Stringlerde length methodu kullanýlýr ama stringlerde kullanýlan length methodu parantezlidir 
		// 
		
		System.out.println(arr1.length);
		
		// Array daki son elemaný yazdýrmak için lengtr kullanýlýz
		System.out.println(arr1[arr1.length-1]);
	}
}
