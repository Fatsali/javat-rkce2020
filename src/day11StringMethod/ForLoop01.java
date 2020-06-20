package day11StringMethod;

public class ForLoop01 {

	public static void main(String[] args) {
		// 
		
		//for(baþlangýç deðeri;bitirme þartý, arttýrma veya azaltma){
		//6,5,4,3 ve 2 yi ekrana yazdýran bir for loop oluþturun
		for(int i=6;i>-2;i--) {	
		System.out.println(i);
		}
		
		//3,4,5,6,7 sayýlarýný oluþturan bir  for loop oluþturunuz.
		for(int i=3;i<8;i++) {
			System.out.println(i);
		}
		//ilk 100 sayma sayýsýný 1 den 100 kadar yazdýrýn
		for(int i=1;i<101;i++) {
			System.out.print(" "+i);
		}
			//ilk 100 sayma sayýsýný 100 den 1 kadar yazdýrýn
			for(int i=1;i>0;i--) {
				System.out.print(" "+i);
			}
		System.out.println();
		//ilk 50 çift sayma sayýsýný ekrana yazdýran for loop oluþturunuz
			for(int i=2;i<100;i=i+2) {
				System.out.print(i+" ");	
				}
		System.out.println();
		// ilk 50 tek sayma sayýsýný
		for(int i=1;i<100;i=i+2) {
			System.out.print(i+" ");	
			}
		
	}
	
}
