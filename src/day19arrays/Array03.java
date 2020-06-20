package day19arrays;

public class Array03 {

	public static void main(String[] args) {
		// Elemanlarý 1,2,3,4,5 olan bir int array oluþturunuz
		// bu array de 3 elemaný olup olmadýðýný kontrol ediniz
		// 3 varsa ekrana 3 var yazdýrýn
		//3 yoksa ekrana 3 yok yazdýrýn
		// kaç tane 3 olduðunu yazdýrýn
		
		
		//Array oluþturup eleman eklemek için 1. yol
		//int arr[]=new int[5];
		
	//	arr[0]=1;
	//	arr[1]=2;
	//	arr[2]=3;
	//	arr[3]=4;
	//	arr[4]=5;
		//Array oluþturup eleman eklemek için 2. yol
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
