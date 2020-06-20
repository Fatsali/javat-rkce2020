package day11StringMethod;

public class ForLoop02 {

	public static void main(String[] args) {
		// 100 den küçük 3 ün katý olan sayma sayýlarýný ekrana yan yana yazdýran for loop oluþturunu
		for(int i=3;i<100;i=i+3) {
			System.out.print(i+" ");
		}
	System.out.println();
		//ilk 5 sayma sayýnýný toplamýn veran progmaý for loop ile yazýnýz
	//1,2,3,4,5
	//1+2=3==>3+3=6==>6+4=10==>10+5=15
	int sum=0;	
	for(int i=1;i<6;i++) {
		sum=sum+i;
		}
	System.out.println("Toplam: "+sum);// sadece en son adýmý ekranda görmek isterseniz 
	//yazdýrma iþlemini o loop un dýþýnda yapýnýz.
	System.out.println();
	
	// 10 dan büyük ilk 3 sayma sayýsýnýn toplamýný veren vor loop yazýnýz
	int sum2=0;
	for(int i=11;i<14;i++){
		sum2=sum2+i;
	}
	System.out.println("Toplam1: "+sum2);
	
	//20 den büyük ilk 5 sayma sayýsýnýn toplamý
	int sum3=0;
	for(int i=21;i<26;i++) {
		sum3=sum3+i;
	}
	System.out.println("Toplam3: "+sum3);
	
	//ilk 50 sayma sayýsýnýn toplamýný veren for loop ol
	
	int sum4=0;
	for(int i=1;i<51;i++) {
		sum4=sum4+i;
	}
	System.out.println("Toplam4: "+sum4);
	
	//5 ile bölünebilen 100 den küçük sayma sayýlarýnýn toplamýný
	int sum5=0;
	for(int i=5;i<100;i+=5) {
		sum5=sum5+i;
	}
	System.out.println("Toplam4: "+sum5);
	
	}


}
