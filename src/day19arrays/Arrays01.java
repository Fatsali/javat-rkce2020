package day19arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// Arrays: tepsi demektir.
		// birden fazla varriable’i ayný anda kullanmak istediðimiz zaman arrays kullanýyoruz.
		// Array’ler object’tir.
		// Primitiveleri Java oluþturur. non primitive lardan ise istediðimiz kadar üretebiliriz.
		// bu non primitivelerden biriside arraysdir.
		// Arraysler hipte depolanýr.
		// hip büyük bir alan olduðu için bulunabilmesi için adreslenmesi gerekir.
		// Arrays içinde tüm variable’lar ayný data type’ýnde olmalýdýr.
		// arrays sadece Primitive type (byte, short...8 tane) ve objeckt referans konulabilir.
		// arrays’ýn içinde Stringin adresi olur, kendisi olmaz.
		// array’in içine stackdekiler konulabilir.
		// Bir array oluþturmadan önce o Array’in içine kaç variable koyacaðýmýza karar vermeliyiz.
		// Bir Array içine koyabileceðimiz variable sayýsýna o Array’in “length”i denir.
		// bir Array’in length=2 gibi
		// O Array içine length’den fazla variable koyamayýz.
		
		
		// ýnteger Array oluþturalým
		
		int arr1[]=new int[5];
		
		//System.out.println(arr1);Array ýn reference ni ekrana yazdýrý
		//System.out.println(arr1[3]);Array ýn ýndex i 3 olan elemaný ekrana yazdýrýr
		System.out.println(arr1[0]);
		System.out.println(arr1[3]);
		arr1[0]=12;
		System.out.println(arr1[0]);
		arr1[1]=13;
		System.out.println(arr1[1]);
		arr1[2]=14;
		System.out.println(arr1[2]);
		arr1[3]=15;
		System.out.println(arr1[3]);
		arr1[4]=22;
		System.out.println(arr1[4]);
		
		// Array daki elemanlarý ekrana yazdýrmak için for döngüsü yapýnýz
		for(int i =0;i<5;i++) {
			System.out.println(arr1[i]);
		}
			//Array da olmayan index deðer atamasý yapýlýrsa run time error verir
			//Array da olmayan index kullanmaya çalýþýrsak "ArrayIndexOutOfBoundsException" alýrýz
		//arr1[5]=23;
		//System.out.println(arr1[5]);
	}

}
