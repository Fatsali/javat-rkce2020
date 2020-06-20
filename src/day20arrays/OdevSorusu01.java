package day20arrays;

public class OdevSorusu01 {

	public static void main(String[] args) {
		//Bir array’de herhangi iki elemanýn ayný olup olmadýðýný kontrol  eden
		//bir program yazýnýz.Ayný eleman varsa “Ayný eleman var”
		//yoksa  “Ayný eleman yok” yazdýrýnýz.
				
		int arr[]= {1,2,3,4,3};
		int uzunluk=arr.length;
		int count=0;
		for(int i=0;i<uzunluk;i++) {
			for(int i2=i+1;i2<uzunluk;i2++) {
				if(arr[i]==arr[i2]) {
					count++;
					break;
				}
			}
		} 
						
		if(count>0) {
		System.out.println("Ayný eleman var");
		}else {
		System.out.println("Ayný eleman yok");
		}
	}
}
