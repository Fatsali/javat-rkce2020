package day20arrays;

public class OdevSorusu01 {

	public static void main(String[] args) {
		//Bir array�de herhangi iki eleman�n ayn� olup olmad���n� kontrol  eden
		//bir program yaz�n�z.Ayn� eleman varsa �Ayn� eleman var�
		//yoksa  �Ayn� eleman yok� yazd�r�n�z.
				
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
		System.out.println("Ayn� eleman var");
		}else {
		System.out.println("Ayn� eleman yok");
		}
	}
}
