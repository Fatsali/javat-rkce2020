package day19arrays;

public class Array03 {

	public static void main(String[] args) {
		// Elemanlar� 1,2,3,4,5 olan bir int array olu�turunuz
		// bu array de 3 eleman� olup olmad���n� kontrol ediniz
		// 3 varsa ekrana 3 var yazd�r�n
		//3 yoksa ekrana 3 yok yazd�r�n
		// ka� tane 3 oldu�unu yazd�r�n
		
		
		//Array olu�turup eleman eklemek i�in 1. yol
		//int arr[]=new int[5];
		
	//	arr[0]=1;
	//	arr[1]=2;
	//	arr[2]=3;
	//	arr[3]=4;
	//	arr[4]=5;
		//Array olu�turup eleman eklemek i�in 2. yol
		int arr[]={1,2,3,4,3};
		int count=0;
		for(int i=0;i<5;i++) {
			if(arr[i]==3) {
				count++;
			}
		}
			if(count>0) {
				System.out.println(count +"tane 3 var");
			}else {
				System.out.println("3 yok");
			}
	}

}
