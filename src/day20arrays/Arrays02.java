package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// Bir integer array ýn elemanlarýný küçükten büyüge diziniz 
		//ve ekrana iki durumu da yazdýrýnýz
		
		int arr[]= {2,11,0,23,7};
		System.out.println("Sýralamadan önce: "+Arrays.toString(arr));
		// Arrays.sort() methodu arrayýn ismi yazýlýrsa o arrayýn elemanlarýný küçükten 
		//büyüðe (ascending order,natural order)doðru sýralar
		Arrays.sort(arr);
		System.out.println("Sýralamadan sonra: "+Arrays.toString(arr));
		
		
		//charlardan oluþan bir array oluþturunuz oluþturunuz ve ascending order yapýnýz
		//charlar sýralanýrken java ascýý kodlarý kullanýr büyük harflerin Ascýý kodlarý küçük
		//harflerden azdýr o yüzden büyük harfler önce geçer
		//java rakamlarýn Ascýý kodu o rakamýn deðeri gibi düþünür.
		
		char arrch[]= {'d','l','a','f'};
		System.out.println("Sýralamadan önce: "+Arrays.toString(arrch));
		Arrays.parallelSort(arrch);
		System.out.println("Sýralamadan sonra: "+Arrays.toString(arrch));
		
		//stringlerden oluþan bir array oluþturun ve ascending order yapýn
		
		String arrstr[]= {"ordu","fatsa","ünye","korgan"};
		System.out.println("Sýralamadan önce: "+Arrays.toString(arrstr));
		Arrays.parallelSort(arrstr);
		System.out.println("Sýralamadan sonra: "+Arrays.toString(arrstr));
		
		//boolean bir array oluþturun ascendin orde yapýn
		
		boolean arrbl[]= {true,false,false};
		System.out.println("Sýralamadan önce: "+Arrays.toString(arrbl));
		//boolean için sort methodu kullanýlamaz
		
		
	}

}
